package com.mphasis.training.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Locations {
	
	@Id
	private String lcode;
	@Column(length=10,unique=true)
	private String lname;
	@OneToMany(mappedBy="loc",fetch=FetchType.EAGER)
	private List<Departments> deps=new ArrayList<>();
	@Transient
	private int pincode;
	public String getLcode() {
		return lcode;
	}
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<Departments> getDeps() {
		return deps;
	}
	public void setDeps(List<Departments> deps) {
		this.deps = deps;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}