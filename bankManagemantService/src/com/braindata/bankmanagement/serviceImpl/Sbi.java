package com.braindata.bankmanagement.serviceImpl;


import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;



public class Sbi  implements Rbi {
	
	
	Account a=new Account();
	Scanner s1=new Scanner(System.in);
	public void createAccount()
	{
		
		System.out.println("enter account opening amount");
		double damt=s1.nextInt();
		
		if(damt>=500) {
			
		System.out.println("create Acccount");
		System.out.println("enter Account Number");
		int t=s1.nextInt();
		System.out.println("Enter Name");
		String y=s1.next();
		System.out.println("enter Mobile no");
		String l=s1.next();
		System.out.println("enter Age");
		int a1=s1.nextInt();
		System.out.println("enter gender");
		String d=s1.next();
		System.out.println("enter adhar no");
		long l1=s1.nextLong();
		System.out.println("Balance: "+damt);
		System.out.println("Create account Successfuly");
			
	
		
	    a.setAccNo(t);
		a.setName(y);
		a.setMobNo(l);
		a.setAdharNo(l1);
		a.setAge(a1);
		a.setGender(d);
		a.setBalance(damt);
	
			}
			else
			{
				System.out.println("insuficient fund please deposite greater than 500");
				createAccount();
			
			}
			
	}
		
	
	public void displayAllDetails()
	{
		System.out.println("Please enter your adhar number");
		long s=s1.nextLong();
		long s2=a.getAdharNo();
		if(s2==s) {
			
		System.out.println("Display account details");
		System.out.println("A/c No:"+a.getAccNo());
		System.out.println("Holder name:"+a.getName());
		System.out.println("mobile no:"+a.getMobNo());
		System.out.println("Adhar no:"+a.getAdharNo());
		System.out.println("Age:"+a.getAge());
		System.out.println("gender:"+a.getGender());
		System.out.println("Balance:"+a.getBalance());
	}
		else {
			
			System.out.println("**** data not found****enter correct number or create account");
			//System.out.println("please create account first");
			displayAllDetails();
		
			System.out.println("please crreate Account first");
		}
		
	
	while(true){
		System.out.println("Edit any details click 1 and confirm click 2");
		System.out.println("press 3 for receipt");
		int w=s1.nextInt();
		switch(w) {
		case 1:
			System.out.println("Edit Acccount Details");
			System.out.println("enter Account Number");
			int t=s1.nextInt();
			System.out.println("Enter Name");
			String y=s1.next();
			System.out.println("enter Mobile no");
			String l=s1.next();
			System.out.println("enter Age");
			int a1=s1.nextInt();
			System.out.println("enter gender");
			String d=s1.next();
			System.out.println("enter adhar no");
			
				
		
		case 2:
			System.out.println("create account successfully");
	//	}
		//break;
		
		case 3:
			System.out.println("please take a receipt");
			break;
			}
		break;

	}
	}
	
	
	
	
	
	public void depositeMoney()
	{
		
		System.out.println("enter deposite amount multiple of 500/-");
		double v1=s1.nextDouble();
		if(v1>=500)
		{
		System.out.println("old Balance");
		double d1=a.getBalance();
		System.out.println(d1);
		double Bal=v1+d1;
		System.out.println("Current Balance:"+Bal);
		a.setBalance(Bal);
		System.out.println("deposite Money successful ");
		}
		else
		{
			System.out.println("please deposite more than 500/-");
		     depositeMoney();
		     }
		
		
	
	}
	public void withdrawal()
	{
		
		System.out.println("enter withdrawal cash");
		double Amt=s1.nextDouble();
	
		
	System.out.println("old balance");
	double z=a.getBalance();
	System.out.println(z);
		double z2=z-Amt;
	
		if(Amt>=500&&Amt<=25000) { 
	 if(z2>=500)
		{
		System.out.println("Current Balance:"+z2);
		System.out.println(" withdrawal cash Successful");
		a.setBalance(z2);
		}
   else {
	    System.out.println("**insuficient fund or please maintain 500/-***");
	         }}
	 
	else{
		System.out.println(" Withrawal limit is only 25000/-per day."); 
	}
	}
		
	

	public void balanceCheck()
	{
		System.out.println("Available balance");
		double check=a.getBalance();
		System.out.println(check);
		
	}

}
