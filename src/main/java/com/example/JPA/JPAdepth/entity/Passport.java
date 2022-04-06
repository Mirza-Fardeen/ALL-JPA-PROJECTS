package com.example.JPA.JPAdepth.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name="passport")
public class Passport {

    @Id
    @GeneratedValue
    private long id;

    private String numb;

    @OneToOne(mappedBy = "passport")
    private Student student;

    public Passport() {
    }

    public Passport(long id, String numb) {
        this.id = id;
        this.numb = numb;
    }

//    public Passport(long id, String numb, Student student) {
//        this.id = id;
//        this.numb = numb;
//        this.student = student;
//    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Passport(String numb) {
        this.numb = numb;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumb() {
        return numb;
    }

    public void setNumb(String numb) {
        this.numb = numb;
    }

    @Override
    public String toString() {
        return "Passport {" +
                "id=" + id +
                ", name='" + numb + '\'' +
                '}';
    }
}
