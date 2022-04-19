package com.training.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vaccine")
public class VaccineCentre {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String cName;
	private String cPincode;
	private String cDistrict;
	private String cState;
	
	public VaccineCentre() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public VaccineCentre(long id, String cName, String cPincode, String cDistrict, String cState) {
		super();
		this.id = id;
		this.cName = cName;
		this.cPincode = cPincode;
		this.cDistrict = cDistrict;
		this.cState = cState;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcPincode() {
		return cPincode;
	}

	public void setcPincode(String cPincode) {
		this.cPincode = cPincode;
	}

	public String getcDistrict() {
		return cDistrict;
	}

	public void setcDistrict(String cDistrict) {
		this.cDistrict = cDistrict;
	}

	public String getcState() {
		return cState;
	}

	public void setcState(String cState) {
		this.cState = cState;
	}

	@Override
	public String toString() {
		return "VaccineCentre [id=" + id + ", cName=" + cName + ", cPincode=" + cPincode
				+ ", cDistrict=" + cDistrict + ", cState=" + cState + "]";
	}
	
	
	
}

