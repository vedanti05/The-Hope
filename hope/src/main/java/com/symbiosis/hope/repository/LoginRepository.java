package com.symbiosis.hope.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.symbiosis.hope.model.Login;

@Repository
@Qualifier("logRepo")
public interface LoginRepository extends JpaRepository<Login, String> {
	 
	@Query(value = "select * from login where emailid=:emailid and password=:password",nativeQuery = true)

	List<Login> findAllByusernameAndPassword(String emailid, String password);

}
