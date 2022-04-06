package com.example.JPA.JPAdepth.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Component
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToOne
    private Passport passport;

    @ManyToMany
    @JoinTable(name="Student_Course", joinColumns = @JoinColumn(name="Student_ID") , inverseJoinColumns = @JoinColumn(name ="Course_ID"))


    List<Course> courseList = new ArrayList<>();

    public List<Course> getCourseList() {
        return courseList;
    }

    public void addToCourseList(Course course) {
       courseList.add(course);
    }

    public Student() {
    }

    public Student(long id, String name, Passport passport) {
        this.passport=passport;
        this.id = id;
        this.name = name;
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Student(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
