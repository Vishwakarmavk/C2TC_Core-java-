package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		Student student = new Student();
		student.setName("Ravi");
		
		Address address = new Address();
		address.setStreet("MG Road");
		address.setCity("Bengaluru");
		address.setState("Karnataka");
		address.setZipcode("560107");
		
		//inject address to student table
		student.setAdderss(address);
		
		//persist
		em.persist(student);
		em.getTransaction().commit();
		em.clear();
		factory.close();
		System.out.println("The student details is saved successful");

	}

}

