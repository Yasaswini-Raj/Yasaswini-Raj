package com;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Student_App")
public class StudentBean {
@Id
@Column(name="rollno")
private int studentRollno;

@Column(name="First Name")
private String fname;
@Column(name="Last Name")
private String lname;
@Column(name="mid")
private String studentMid;
public int getStudentRollno() {
	return studentRollno;
}
public void setStudentRollno(int studentRollno) {
	this.studentRollno = studentRollno;
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
public String getStudentMid() {
	return studentMid;
}
public void setStudentMid(String studentMid) {
	this.studentMid = studentMid;
}



}
