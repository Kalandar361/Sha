package com.mphasis.training.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
@Id
private int oid;
private double cost;
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}




}
