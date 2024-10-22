package com.project.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class PojoEmployee {
    
	@Id
	@GeneratedValue
	public int id;
	@Column(name="empname")
	public String name;
	@Column(name="empage")
	public String age;
	
	
	

	public void setName(String name) {
	     this.name = name;
	 }

	 public String getName() {
	     return this.name;
	 }
	 public void setage(String age) {
	     this.age = age;
	 }

	 public String getage() {
	     return this.age;
	 }

	@Override
	public String toString() {
		return "PojoEmployee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	 
	
}
