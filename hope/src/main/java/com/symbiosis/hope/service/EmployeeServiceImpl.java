package com.symbiosis.hope.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.hope.model.Employee;
import com.symbiosis.hope.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
     @Autowired
     @Qualifier("empRepo")
     private EmployeeRepository empRepo;

	@Override
	public Employee createEmp(Employee emp) {
		// TODO Auto-generated method stub
		return empRepo.save(emp);
	}

	@Override
	public List<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employee searchEmp(long id) {
		// TODO Auto-generated method stub
		Optional<Employee> opt=empRepo.findById(id);
		
		if(opt.isPresent())
		{
			Employee e=opt.get();
			return e;
		}
		else
		return null;
	}

	@Override
	public Employee updateEmployee(long id, Employee emp) {
		// TODO Auto-generated method stub
        Optional<Employee> opt=empRepo.findById(id);
		
		if(opt.isPresent())
		{
			Employee e=opt.get();
			e.setName(emp.getName());
			e.setDepartment(e.getDepartment());
			e.setSalary(emp.getSalary());
			return empRepo.save(e);
		}
		else
		return null;
		
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		Optional<Employee> opt=empRepo.findById(id);
		
		if(opt.isPresent())
		{
			Employee e=opt.get();
			empRepo.deleteById(id);
			return true;
		}
		else
		return false;
	}

}