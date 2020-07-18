package com.mphasis.training.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Departments {
	
	@Id
	private int deptcode;
	@Column(length=12)
	private String dname;
	
	@ManyToOne
	@JoinColumn(name="lcode")
	private Locations loc=new Locations();

	public int getDeptcode() {
		return deptcode;
	}

	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Locations getLoc() {
		return loc;
	}

	public void setLoc(Locations loc) {
		this.loc = loc;
	}
	
	

}
