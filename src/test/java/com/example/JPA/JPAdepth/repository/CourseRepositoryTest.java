package com.example.JPA.JPAdepth.repository;

import com.example.JPA.JPAdepth.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.Assert.*;



@SpringBootTest
class CourseRepositoryTest {

	@Autowired
	CourseRepository courseRepository;

	@Test
	void findbyid() {
		Course course =courseRepository.findById(1001);
		assertEquals("Jpa quick",course.getName());

	}
	@Test
	@DirtiesContext
	void deletebyid() {
		  courseRepository.deleteByid(1002);
		Course course =courseRepository.findById(1002);
		//assertEquals(null,course);
		assertNull(course);

	}

}
