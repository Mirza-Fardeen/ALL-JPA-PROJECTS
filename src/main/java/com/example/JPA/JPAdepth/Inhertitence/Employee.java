package com.example.JPA.JPAdepth.Inhertitence;

import com.example.JPA.JPAdepth.entity.Review;
import com.example.JPA.JPAdepth.entity.Student;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Component
@Entity
@Table(name ="Employee")
public abstract class Employee {


    @Id
    @GeneratedValue
    private long id;

    private String name;



    public Employee() {
    }

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(String name) {
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
        return "Employee {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
