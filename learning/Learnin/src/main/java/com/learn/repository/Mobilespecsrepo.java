package com.learn.repository;

import java.util.List;

import org.hibernate.type.TrueFalseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.learn.model.MobileSpecs;


@Repository("Mobilespecsrepo")
public interface Mobilespecsrepo  extends JpaRepository<MobileSpecs, String>{
	
	
	@Query(value = " select * from mobilespecs ", nativeQuery = true)
	List<MobileSpecs> getallspecs();

}
