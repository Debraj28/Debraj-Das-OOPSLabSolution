package com.greatlearning.ITSupportMain;

import java.util.Scanner;


import com.greatlearning.ITSupportPojo.Employee;
import com.greatlearning.ITSupportService.Service;

public class Driver {

	public static void main(String[] args) {
		String department = "";
		Employee emp = new Employee("Debraj","Das");
		System.out.println("Please Enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide an appropriate option:");
		int option = sc.nextInt();
		Service ser = new Service();
		
		switch(option) {
		case 1: department = "technical";
		break;
		
		case 2: department = "admin";
		break;
		
		case 3: department = "HR";
		break;
		
		case 4: department = "legal";
		break;
		
		default: System.out.println("Invalid Option");
		break;
		
		}
		String email = ser.generateEmail(emp, department);
		ser.showCredentials(emp, email);
	}

}