package com.example.JPA.JPAdepth.repository;

import com.example.JPA.JPAdepth.entity.Course;
import com.example.JPA.JPAdepth.entity.Passport;
import com.example.JPA.JPAdepth.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


@SpringBootTest
class StudentRepositoryTest {

	@Autowired
	StudentRepository courseRepository;

	@Autowired
	EntityManager entityManager;

	@Test
	@Transactional
	void findbyid() {
//		Student course =courseRepository.findById(2002);
		Student student = entityManager.find(Student.class, 2002L);
		assertEquals("Louise",student.getName());

	}

	@Test
	@Transactional
	void findStudentBypassport() {
		Passport passport = entityManager.find(Passport.class,4001L);
		assertEquals("Ashley", passport.getStudent().getName());

	}
	@Test
	@DirtiesContext
	void deletebyid() {
		  courseRepository.deleteByid(1002);
//		Course course =courseRepository.findById(1002);
		//assertEquals(null,course);
//		assertNull(course);

	}

}
