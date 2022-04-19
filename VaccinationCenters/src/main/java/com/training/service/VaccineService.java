package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.entity.VaccineCentre;
import com.training.repository.VaccineRepository;

public class VaccineService {
	@Autowired
	VaccineRepository vaccineRepository;
	
	public List<VaccineCentre> getAll(){
		return (List<VaccineCentre>)vaccineRepository.findAll();
	}
	
	public List<VaccineCentre> getAllCenterByPincode(String pincode) {
		return vaccineRepository.findByPincode(pincode);
	}
	
	public List<VaccineCentre> getAllCenterByDistrict(String district){
		return vaccineRepository.findByDistrict(district);
	}

}
