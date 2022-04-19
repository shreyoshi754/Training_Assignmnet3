package com.training.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.VaccineCentre;
import com.training.repository.VaccineRepository;
import com.training.service.VaccineService;

@RestController
public class VaccineController {
	@Autowired
	VaccineService vaccineService;
	
	@Autowired
	VaccineRepository vaccineRepository;
	
	
	@RequestMapping("/")
	public ModelAndView homepage() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value= "/addcenters",method = RequestMethod.POST)
	public void newEmployee(@RequestBody VaccineCentre vaccineCentre) {
		vaccineRepository.save(vaccineCentre);
	}
	
	@RequestMapping(value="/api/v1/all", method=RequestMethod.GET)
	 public ModelAndView viewAll(){ 
		ModelAndView m = new ModelAndView();
        List<VaccineCentre> list=vaccineService.getAll(); 
        System.out.print(list);
        m.addObject("list",list);
        m.setViewName("allCentres");
        return m;
	}
	
	//Opening Search by district page
	@RequestMapping(value="api/v1/dist")
	public ModelAndView searchByDist() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("districtCentres");
		return mv;
	}
	
	//Search By district
	@PostMapping("/district/dis")
	public ModelAndView districtList(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("allCentres");
		String district = request.getParameter("district");
		List<VaccineCentre> list = vaccineService.getAllCenterByDistrict(district);
		mav.addObject("list",list);
		return mav;
	}
	
	//Opening Search by pincode page
	@RequestMapping(value="/api/v1/pin")
	public ModelAndView searchByPin() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("pinCentres");
		return mv;
	}
	
	//Search by Pincode
	@PostMapping("/pincode/pin")
	public ModelAndView pincodeList(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("allCentres");
		String pincode = request.getParameter("pincode");
		List<VaccineCentre> list = vaccineService.getAllCenterByPincode(pincode);
		mav.addObject("list",list);
		return mav;
	
	}

}
