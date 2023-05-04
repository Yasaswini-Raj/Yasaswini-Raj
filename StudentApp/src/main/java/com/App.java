package com;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		StudentDAO dao = new StudentDAO();
		
		System.out.println("Welcome....choose Your Option");
		System.out.println("1.Enter Student details\n2.View Student Details\n3.view All Students Data");
		Scanner s= new Scanner(System.in);
		int op=Integer.parseInt(s.nextLine());
		
		switch(op) {
		case 1:System.out.println("Enter Student RollNumber(ex:101,102...integer only)");
		     int rn=Integer.parseInt(s.nextLine());
		     System.out.println("Enter Student First Name");
		     String fn=s.nextLine();
		     System.out.println("Enter Student Last Name");
		     String ln=s.nextLine();
		     System.out.println("Enter Student Mail Id");
		     String md=s.nextLine();
			StudentBean sb = new StudentBean();
			sb.setStudentRollno(rn);
			sb.setFname(fn);
			sb.setLname(ln);
			sb.setStudentMid(md);
			
			dao.saveStudentData(sb);
			 
			
			break;
		case 2:
			System.out.println("Enter Student RollNumber");
			int r=s.nextInt();
			dao.getStudentData(r);
			break;
		case 3:
			dao.getStudentDataBasedonPrimaryKeys();
			break;
			default:System.out.println("Please enter Valid option");
		}
		
		
	
		
	}

		
}
