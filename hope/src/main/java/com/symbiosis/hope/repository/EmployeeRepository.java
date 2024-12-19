package com.symbiosis.hope.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symbiosis.hope.model.Employee;

@Repository
@Qualifier("empRepo")
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
