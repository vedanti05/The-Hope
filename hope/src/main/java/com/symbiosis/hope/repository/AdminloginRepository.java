package com.symbiosis.hope.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.symbiosis.hope.model.Adminlogin;

@Repository
@Qualifier("admRepo")
public interface AdminloginRepository extends JpaRepository<Adminlogin,Integer>{
	@Query(value = "select * from adminlogin where email=:email and password=:password",nativeQuery = true)
	List<Adminlogin> findAllByEmailAndPassword(String email,String password);
}
