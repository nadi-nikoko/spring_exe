package com.love2code.springboot.cruddemo.DAO;

import com.love2code.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository <Employee, Integer> {

    //thats all, the code is not need anymore

}
