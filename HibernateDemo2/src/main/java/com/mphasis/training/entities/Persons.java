package com.mphasis.training.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Persons {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="per_seq")
	@SequenceGenerator(sequenceName="person_seq",allocationSize=1,name="per_seq")
	private int pid;
	@Column(name="fname",length=20,unique=true,nullable=false)
	private String fname;
	@Column(name="lname",length=20,unique=true,nullable=false)
	private String lname;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="prcode")
	
	private Product pr=new Product();
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Product getPr() {
		return pr;
	}
	public void setPr(Product pr) {
		this.pr = pr;
	}
	
	

}
