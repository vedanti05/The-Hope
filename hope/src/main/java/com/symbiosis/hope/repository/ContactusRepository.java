package com.symbiosis.hope.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.symbiosis.hope.model.Contactus;
@Repository
@Qualifier("conRepo")

public interface ContactusRepository extends JpaRepository<Contactus, Integer> {
	@Query(value = "select * from contactus where emailid=:emailid and password=:password",nativeQuery = true)
	List<Contactus> findAllByEmailidAndPassword(String emailid,String password);

}
