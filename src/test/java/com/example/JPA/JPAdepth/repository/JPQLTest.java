package com.example.JPA.JPAdepth.repository;

import com.example.JPA.JPAdepth.entity.Course;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import javax.persistence.EntityManager;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


@SpringBootTest
class JPQLTest {

	@Autowired
	CourseRepository courseRepository;

	Logger loggger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager entityManager;

	@Test
	void findbyid() {
//		Course course =courseRepository.findById(1001);
//		assertEquals("Jpa quick",course.getName());

		List mylist =entityManager.createQuery("Select c From Course c").getResultList();
		loggger.info("Select c From Course c \n \n {}", mylist);
	}

}
