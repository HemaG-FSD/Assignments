package com.lockers.pl;

import java.util.Scanner;

import com.lockers.dto.User;
import com.lockers.service.LoginService;

public class CompanyLockers {
	
	public static void main(String args[]) {
		
		LoginService ls= new LoginService();
		System.out.println("Welcome to Company Lockers");
		System.out.println("1-> Register\n 2 -> Login");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		if(ch==1)
		{
			User u1=new User();
			String userName, password;
			System.out.println("Enter Your username");
			u1.setUserName(sc.next());
			System.out.println("Enter Your password");
			u1.setPassword(sc.next());
			ls.registerUser(u1);
			System.out.println("User Successfully Registered");
		}
		else if(ch==2) {
			User u1=new User();
			String userName, password;
			System.out.println("Enter Your username");
			u1.setUserName(sc.next());
			System.out.println("Enter Your password");
			u1.setPassword(sc.next());
			ls.login(u1);
			System.out.println("Logged in");
		}
		else {
			System.out.println("Enter a valid choice");
		}
	}
}
