package main;

import java.util.Scanner;

public class VendingMachine 
{
	
	public  void StartVendingMachine(String start) {
		try {
		 Customer customer=new Customer();
		 
		 if(!(start.equalsIgnoreCase("Y") || start.equalsIgnoreCase("N"))) {
			 reStart();
		 }
		 
while(start.equalsIgnoreCase("Y"))
		 {
		 
		 customer.DisplayMessage();
		 customer.processRequest();
		 System.out.println("Type Y and press Enterkey to continue or N to exit");
		 Scanner scan=new Scanner(System.in);
		 start=scan.next();
		 
		 }
		 
		 if (start.equalsIgnoreCase("N")) {System.out.println("Good Bye!!!");}
		 else if(!(start.equalsIgnoreCase("N") || start.equalsIgnoreCase("Y"))) {
			 reStart();
		 }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}//end of StartVendingMachine class
	
	public void reStart() {
		try {
		String start="N";
		
		  System.out.println("Type Y and press Enterkey to start the vending machine or N and Enterkey to exit");
		  Scanner scan=new Scanner(System.in);
			 start=scan.next();
			 StartVendingMachine(start);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		try {
		String start="N";
		
		  System.out.println("Type Y and press Enterkey to start the vending machine or N to exit");
		  Scanner scan=new Scanner(System.in);
			 start=scan.next();
	
	 
	 VendingMachine vendingmachine =new VendingMachine();
	 
	 
	 if(start.equalsIgnoreCase("N")) {
		 System.out.println("Good Bye!!!");
		 
	 }
	 else if(start.equalsIgnoreCase("y")) {
		
		 vendingmachine.StartVendingMachine(start);
	 }
	 else {
		 vendingmachine.reStart();
	 }
		}catch(Exception e) {
			e.printStackTrace();
		}

}//end of main

}
