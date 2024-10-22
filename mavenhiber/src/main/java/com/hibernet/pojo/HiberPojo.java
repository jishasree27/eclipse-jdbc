package com.hibernet.pojo;

import javax.persistence.*;

@Entity
@Table(name="employee_profile")
public class HiberPojo {
	 	   @Id 
	 	   @GeneratedValue
		   public int id;
	 	   @Column(name="name")
		   public String name;
	 	   @Column(name="age")
		   public int age;
	 	   @Column(name="qualification")
		   public String qualification;
	 	   @Column(name="Email")
		   public String email;
	 	 
		   
		   public void setName(String name) {
			     this.name = name;
			 }

			 public String getName() {
			     return this.name;
			 }
			 public void setage(int age) {
			     this.age = age;
			 }

			 public int getage() {
			     return this.age;
			 }
			 public void setqualification(String qualification) {
			     this.qualification = qualification;
			 }

			 public String getqualification() {
			     return this.qualification;
			 }
			 public void setEmail(String email) {
			     this.email = email;
			 }

			 public String getEmail() {
			     return this.email;
			 }
			
		}

		 
