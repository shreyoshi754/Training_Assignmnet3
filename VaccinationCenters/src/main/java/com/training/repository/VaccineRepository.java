package com.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.training.entity.VaccineCentre;
@Repository
public interface VaccineRepository extends JpaRepository<VaccineCentre,Long>{
	@Query("select a from VaccineCentre a where a.cPincode=?1")
	List<VaccineCentre> findByPincode(String pincode);
	
	@Query("select d from VaccineCentre d where d.cDistrict=?1")
	List<VaccineCentre> findByDistrict(String district);

}
