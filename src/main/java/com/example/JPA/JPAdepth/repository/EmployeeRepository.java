package com.example.JPA.JPAdepth.repository;


import com.example.JPA.JPAdepth.Inhertitence.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
public class EmployeeRepository {

    @Autowired
    EntityManager em;

   public void insertEmployee(Employee employee){
    em.persist(employee);
   }
    public List<Employee> getEmployees(){
        List<Employee> employee =em.createQuery("select e from Employee e",Employee.class).getResultList();
        return employee;
    }
}
