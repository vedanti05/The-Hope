package com.symbiosis.hope.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.symbiosis.hope.model.Adminlogin;

@Repository
@Qualifier("adminRepo")
public interface AdminloginRepository extends JpaRepository<Adminlogin,Integer>{
	@Query(value = "select * from adminlogin where username=:username and password=:password",nativeQuery = true)
	List<Adminlogin> findAllByusernameAndPassword(String username,String password);
}
