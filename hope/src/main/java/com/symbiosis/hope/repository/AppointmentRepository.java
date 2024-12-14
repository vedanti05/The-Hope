package com.symbiosis.hope.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.symbiosis.hope.model.Appointment;

@Repository
@Qualifier("appRepo")
public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{
	@Query(value = "select * from appointment where username=:username and emailid=:emailid",nativeQuery = true)
	List<Appointment> findAllByUsernameAndEmailid(String username,String emailid);
}
