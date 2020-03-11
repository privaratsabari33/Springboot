package com.example.demo.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EmployeeEntity;

@Repository
public interface EmployeeDao extends JpaRepository<EmployeeEntity, Long> { 
	
	@Query(value="select name from Employee " , nativeQuery=true)
    public List<EmployeeEntity> getAllEmployees();
	
	   
	 
	}
	





