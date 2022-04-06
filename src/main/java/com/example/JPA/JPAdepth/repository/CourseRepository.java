package com.example.JPA.JPAdepth.repository;

import com.example.JPA.JPAdepth.entity.Course;
import com.example.JPA.JPAdepth.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;


@Component
@Repository
@Transactional
public class CourseRepository {

    @Autowired
//    @PersistenceContext
    EntityManager entityManager;

    public Course findById(long id){
      Course course =  entityManager.find(Course.class,id);
      return course;
    }

    //delete by
    public void deleteByid(long id){
        Course course = findById(id);
        entityManager.remove(course);
    }

    //save


    public Course saveCourse(Course course){
     String id=String.valueOf(course.getId());
      if(id==null){

          //insert

          entityManager.persist(course);
      }
      else {
          //save

          Course course1 = new Course(course.getId(),course.getName());
          entityManager.merge(course1);
      }
         return course;
    }

    public void PlaywithEm(){
        Course course1 = new Course("Web Dev");
        course1.setName("Web Dev");
        entityManager.persist(course1);
        Course course2 = new Course("back end");
//        entityManager.detach(course2);
//        entityManager.clear();
        course2.setName(" back end");
        entityManager.persist(course2);

    }

    public  void addreviews(){
        Course course =  findById(1003L);
        Review review1 = new Review("5","Good hands on stuff");
        Review review2 = new Review("4","Hatsoff");

        course.addReview(review1);
        course.addReview(review2);
        review1.setCourse(course);
        review2.setCourse(course);
        entityManager.persist(review1);
        entityManager.persist(review2);
    }

    public  void addReviwsToCourse(long courseId , List<Review> myReviews){
        Course course =  findById(courseId);

        for(Review rev : myReviews){
            entityManager.persist(rev);
            course.addReview(rev);
            rev.setCourse(course);

        }
    }
}
