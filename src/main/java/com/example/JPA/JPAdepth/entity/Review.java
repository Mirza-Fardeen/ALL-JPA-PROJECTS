package com.example.JPA.JPAdepth.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table
public class Review {

    @Id
    @GeneratedValue
    private long id;
    private String rating;
    private String description;

    @ManyToOne
    private Course course;

    public Review() {
    }

    public Review(long id,String rating, String description) {
        this.rating = rating;
        this.id = id;
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public Review(String rating, String description) {
        this.rating = rating;
        this.description = description;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Review {" +
                "rating=" + rating +
                ", name='" + description + '\'' +
                '}';
    }
}
