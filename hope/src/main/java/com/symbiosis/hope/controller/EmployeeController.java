package com.symbiosis.hope.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.hope.model.Employee;
import com.symbiosis.hope.service.EmployeeService;

@RestController
@CrossOrigin(origins = "https://localhost:4200")
@RequestMapping("/empsystem/")
public class EmployeeController {
@Autowired
private EmployeeService empService;

@GetMapping("/emps")
public List<Employee> getAll()
{
	return empService.getAllEmps( );
}

@PostMapping("/emps")
public Employee createEmp (@RequestBody Employee e)
{
	return empService.createEmp(e);
}

@GetMapping("/emps/{id}")
public ResponseEntity<Employee> search (@PathVariable("id")long id)
{
	Employee e=empService.searchEmp(id);
	if(e==null)
		return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	else
		return new ResponseEntity<Employee> (e,HttpStatus.OK);
}

@PutMapping("/emps/{id}")
public Employee update (@PathVariable("id")long id,@RequestBody Employee e)
{
	return empService.updateEmployee(id, e);
}

@DeleteMapping("/emps/{id}")
public ResponseEntity<?> deleteemp(@PathVariable("id")long id)
{
	boolean ans=empService.delete(id);
	if(ans)
	{
		return ResponseEntity.ok().build();
	}
	else
		return ResponseEntity.notFound().build();
}
}
