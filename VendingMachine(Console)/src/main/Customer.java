package main;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Customer 
{
	private ProductsDetails details=new ProductsDetails();
	private Validations valid=new Validations();
public void DisplayMessage()
{
try {
	System.out.println("\t  VENDING MACHINE\n"); 
	System.out.println("Item \t Code \t cost \nCoke \t 25 \t 15\nSoda \t 45 \t 5\nPepsi \t 35 \t 10\nSupplier 99 \t NA\n***Only 1,5,10,25 Coins accepted***\n");
	System.out.println("Please enter code from above:");
}catch(Exception e) {
	e.printStackTrace();
}
 
}


public int calculateChange(int amt,int code) 
{

List<Integer> Itemdetails=details.GetDetails(code);
	 int itemcost=Itemdetails.get(1);
    int change=itemcost-amt;
    return change;
}


public void processRequest() {
	try {
	 Scanner scan=new Scanner(System.in);
	 Validations isvalid=new Validations();
	 ProductsDetails details=new ProductsDetails();
     ProductsMap map=new ProductsMap();
     Map<String, List<Integer>> mp= map.myMap();
	 int code=0;
	 String code1="";
	 int amt=0;
	 
		int itemcost=0;
		int itemcode=0;
	 
	 Customer customer=new Customer();
	 
	 try {
		  code=Integer.parseInt(scan.next()); 
	 }catch(Exception e) {
		 
		 System.out.println("Invalid Code");
		 VendingMachine machine =new VendingMachine();
		 machine.reStart();
		 
	 }
	 
	 
		  if(code1!="") {
			  VendingMachine machine=new VendingMachine();
			  machine.reStart();
		  }
		  
		  
		  boolean is_valid_code = isvalid.IsValid_code(code);
		  
			if(!(is_valid_code))
	 		{
	 			System.out.println("Invalid code.Please enter from the above list");
	 			code=0;
	 		}
		  
		  if(code==99)
		  {
			  Supplier supplier=new Supplier();
			  System.out.println("Please enter passcode to reset");
			  String passcode=scan.next();
			  boolean validpass= supplier.passCode(passcode);
			 if (!validpass) {
				 System.out.println("Invalid passcode!! Try Again");
		 			passcode="";
			 }
				 
			 else {
				 System.out.println("Machine Restt in progress!! Updating inventory");
				 System.out.println("Current Inventory\n");
				 supplier.displayInventory();
				 supplier.resetMachine();
				 
			 }
			
			  
		 } else if(code==25 || code==45 || code==35) {
			 
		  List<Integer> Itemdetails=details.GetDetails(code);
		  itemcode=Itemdetails.get(0);
		  itemcost=Itemdetails.get(1);
		  System.out.println("Please enter Amount of the item from the above list");
	 		amt=amt+Integer.parseInt(scan.next());;
	 		boolean valid=isvalid.Isvalid_amount(amt);
	 	
	 		if(!(valid))
	 		{
	 			System.out.println("only 1,5,10,25 coins are acceptable.Please insert correct coin");
	 			amt=0;
	 		}


	 		
	 			boolean bul=false;
	 			int amt1=0;
	 			if(itemcost-amt==0) {
	 				System.out.println("Type Y and press Enterkey to confirm buying or X and Enterkey to cancel");
	 				String confirm = scan.next();
	 				if (confirm.equalsIgnoreCase("Y"))
	 				{		
	 						int avail_qty=details.getAvailQuantity(String.valueOf(code));
	 						details.updateQuantity(String.valueOf(code), avail_qty-1);
	 						System.out.println("Please Collect your item");
	 				}
	 				else if (confirm.equalsIgnoreCase("X"))
	 					System.out.println("Please Collect your refund of "+itemcost);
	 				
	 			}
	 			
	 			else if(itemcost-amt<0) {
	 				
	 				System.out.println("Type Y and press Enterkey to confirm buying or X and Enterkey to cancel");
	 				String confirm = scan.next();
	 				if (confirm.equalsIgnoreCase("Y"))
	 					{
	 						int cost=(itemcost-amt)*(-1);
	 						int avail_qty=details.getAvailQuantity(String.valueOf(code));
	 						details.updateQuantity(String.valueOf(code), avail_qty-1);
	 						System.out.println("Please Collect your item and change of \t"+cost);
	 					}else if (confirm.equalsIgnoreCase("X"))
	 						System.out.println("Please Collect your refund of "+amt); 
	 				} else if (itemcost-amt>0){
	 				
	 				while (itemcost-amt>0)
	 				{
	 					int p=itemcost-amt;
	 					System.out.println("Please enter remaining amount of "+p);
	 				
	 					amt1= Integer.parseInt(scan.next());
	 				 
	 					bul=isvalid.Isvalid_amount(amt1);	
	 						if (bul)
	 						{
	 							amt=amt+amt1;
	 						}else {
	 							System.out.println("only 1,5,10,25 coins are acceptable.Please insert correct coin");
	 							
	 							}
	 					
	 					
	 					p=customer.calculateChange(amt, code);
	 					
	 					if(p==0) {
	 						System.out.println("Type Y and press Enterkey to confirm buying or X and Enterkey to cancel");
	 		 				String confirm = scan.next();
	 		 				if (confirm.equalsIgnoreCase("Y"))
	 		 				{
	 		 					int avail_qty=details.getAvailQuantity(String.valueOf(code));
		 						details.updateQuantity(String.valueOf(code), avail_qty-1);	
	 		 					System.out.println("Please Collect your item");
	 		 				}
	 		 				else if (confirm.equalsIgnoreCase("X"))
	 		 					System.out.println("Please Collect your refund of "+itemcost);
	 						
	 					} else
	 					
	 					if(p<0) {
	 					
	 						
	 						System.out.println("Type Y and press Enterkey to confirm buying or X and Enterkey to cancel");
	 		 				String confirm = scan.next();
	 		 				if (confirm.equalsIgnoreCase("Y"))
	 		 				{
	 		 					int cost=p*(-1);
	 		 					int avail_qty=details.getAvailQuantity(String.valueOf(code));
		 						details.updateQuantity(String.valueOf(code), avail_qty-1);
	 		 					System.out.println("Please Collect your item and change of \t"+cost);
	 		 				}else if (confirm.equalsIgnoreCase("X"))
	 		 					System.out.println("Please Collect your refund of "+amt); 
	 						
	 					}else if (p>0)
	 					{
	 						
	 					continue;
	 						}
	 					 		 					
	 						}}
	 			
	                    } 
		  
	}
	catch(Exception e) {
		e.printStackTrace();
	}

                        }
                        }
