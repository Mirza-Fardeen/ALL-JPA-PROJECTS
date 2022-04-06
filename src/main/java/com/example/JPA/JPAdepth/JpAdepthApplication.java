package com.example.JPA.JPAdepth;

import com.example.JPA.JPAdepth.Inhertitence.FullTimeEmployee;
import com.example.JPA.JPAdepth.Inhertitence.PartTimeEmployee;
import com.example.JPA.JPAdepth.entity.Course;
import com.example.JPA.JPAdepth.entity.Review;
import com.example.JPA.JPAdepth.entity.Student;
import com.example.JPA.JPAdepth.repository.CourseRepository;
import com.example.JPA.JPAdepth.repository.EmployeeRepository;
import com.example.JPA.JPAdepth.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

public class JpAdepthApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(JpAdepthApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		Course course = courseRepository.findById(1001);
//
//		studentRepository.SavestudentWithPassport();
//		Student byId = studentRepository.findById(2002L);
//		List<Review> reviews = new ArrayList<>();
//		reviews.add(new Review("5","Good hands on stuff"));
//		reviews.add(new Review("4","Hatsoff"));
//		//courseRepository.addreviews();
//		courseRepository.addReviwsToCourse(1003L,reviews);
//		employeeRepository.insertEmployee(new FullTimeEmployee("Jack", new BigDecimal("10000")));
//
//		employeeRepository.insertEmployee( new PartTimeEmployee("Jill", new BigDecimal("45")));
//
////		Course course1 = courseRepository.saveCourse(new Course("Java course"));
//		logger.info("All Employees {}", employeeRepository.getEmployees());
	}
}
