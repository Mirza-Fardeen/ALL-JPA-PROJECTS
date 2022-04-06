package com.example.JPA.JPAdepth.entity;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Component
@Entity
@Table(name ="Course")
public class Course {


    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(mappedBy = "course")
    private List<Review> review = new ArrayList<>();


    @ManyToMany(mappedBy = "courseList")
    List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addToStudentList(Student student) {
      studentList.add(student);
    }

    public Course() {
    }

    public Course(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Course(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public List<Review> getReview() {
        return review;
    }

    public void addReview(Review review) {
        this.review.add( review);
    }
    public void removeReview(Review review) {
        this.review.remove( review);
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
