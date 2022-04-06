package com.example.JPA.JPAdepth.repository;

import com.example.JPA.JPAdepth.entity.Course;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.Optional;

import static org.junit.Assert.*;


@SpringBootTest
class CourseSpringDataRepositoryTest {

	@Autowired
	CourseSpringDataJPA courseSpringDataJPA;

//	@Autowired
	Logger logger = LoggerFactory.getLogger(Course.class);

	@Test
	void findbyid() {
		Optional<Course> course =courseSpringDataJPA.findById(1004L);
	assertFalse(course.isPresent());
	}


}
