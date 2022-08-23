package com.cg.jpastart.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student implements Serializable{
	 private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int student_id;
	
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address adderss;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdderss() {
		return adderss;
	}

	public void setAdderss(Address adderss) {
		this.adderss = adderss;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}

