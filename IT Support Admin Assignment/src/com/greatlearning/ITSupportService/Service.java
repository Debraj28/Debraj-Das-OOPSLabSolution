package com.greatlearning.ITSupportService;

import java.util.Random;

import com.greatlearning.ITSupportPojo.Employee;

public class Service {
	
	public String generateEmail(Employee emp,  String department) {
		
		return emp.getFirstName()+emp.getLastName()+"@"+department+".greatlearning.com";
		

	}
	
	public char[] generatePassword() {
		String capLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String spcChar = "!@#$%^&*)-+=_";
		String values = capLetters + smallLetters + numbers + spcChar;
		
		Random random = new Random();
		char[] password = new char[8];
		
		for(int i=0;i<8;i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
			
		}
		return password;
		
	}
	public void showCredentials(Employee emp, String email) {
		System.out.println("Dear "+emp.getFirstName()+ " your generated credentials are as follows:");
		System.out.println("Email--> "+ email);
		System.out.println("Password--> "+ generatePassword());
	}
}
