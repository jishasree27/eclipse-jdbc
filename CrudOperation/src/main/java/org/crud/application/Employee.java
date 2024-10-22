package org.crud.application;

public class Employee {
private String id;
private String name;
private String age;
private String email;
private String address;

public void setId(String id) {
	this.id=id;
}
public String getId() {
	return this.id;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	 return this.name;
}
public void setAge(String age) {
	this.age=age;
}
public String getAge() {
	return this.age;
}
public void setEmail(String email) {
	this.email=email;
}
public String getEmail() {
	return this.email;
}
public void setAddress(String address) {
	this.address=address;
}
public String getAddress() {
	return this.address;
}
}