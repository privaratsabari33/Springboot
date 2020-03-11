package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="firstin")
	private String firstin;
	
	@Column(name="lastout")
	private String lastout;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstin() {
		return firstin;
	}

	public void setFirstin(String firstin) {
		this.firstin = firstin;
	}

	public String getLastout() {
		return lastout;
	}

	public void setLastout(String lastout) {
		this.lastout = lastout;
	}
	
	
}
