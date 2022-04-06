package com.example.JPA.JPAdepth.repository;

import com.example.JPA.JPAdepth.entity.Passport;
import com.example.JPA.JPAdepth.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;



@Repository
@Transactional
public class StudentRepository {


//    @PersistenceContext
    @Autowired
    EntityManager entityManager;

    public Student findById(long id){
        Student student =  entityManager.find(Student.class,id);
      return student;
    }

    //delete by
    public void deleteByid(long id){
        Student course = findById(id);
        entityManager.remove(course);
    }

    //save


    public Student saveCourse(Student course){
     String id=String.valueOf(course.getId());
      if(id==null){

          //insert

          entityManager.persist(course);
      }
      else {
          //save

          Student course1 = new Student(course.getId(),course.getName());
          entityManager.merge(course1);
      }
         return course;
    }

    public void SavestudentWithPassport(){

        Passport passport = new Passport("Zshdghhd1");
        entityManager.persist(passport);
        Student student = new Student("Mike");
        student.setPassport(passport);
        entityManager.persist(student);



    }
}
