package main;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Supplier {
	ProductsDetails pd = new ProductsDetails();
	ProductsMap pmap= new ProductsMap();
	Scanner scan=new Scanner(System.in);
	Validations isvalid=new Validations();
	Map<String,List<Integer>> mp=pmap.myMap();
public boolean passCode(String passcode) {
	String password="1234";
	
	if(password.equals(passcode)) {
		return true;
	}
	return false;
}

public void displayInventory()
{
	System.out.println("Item Code\tItem Name\tAvailble Quanity");
	
		System.out.println(mp.get("Coke").get(0)+"\t\tCoke\t\t"+pd.getAvailQuantity(String.valueOf(mp.get("Coke").get(0))));
		System.out.println(mp.get("Soda").get(0)+"\t\tSoda\t\t"+pd.getAvailQuantity(String.valueOf(mp.get("Soda").get(0))));
		System.out.println(mp.get("Pepsi").get(0)+"\t\tPepsi\t\t"+pd.getAvailQuantity(String.valueOf(mp.get("Pepsi").get(0))));
  
}

public void resetMachine()
{
	
	String cont = "Y";
	while(cont == "Y") {
		System.out.println("Enter the code to reset item");
		String code = scan.next();
		boolean is_valid_code = isvalid.IsValid_code(Integer.parseInt(code));
		if(!(is_valid_code))
		{
			System.out.println("Invalid code.Please enter from the above list!!!");
			System.out.println("Enter Y to continue");
			cont = scan.next();
		}
	else {
		pd.updateQuantity(code, 125);
		System.out.println("Updated Inventory for code "+code+ "successfully");

		System.out.println("Type Y and press Enterkey to continue");
		cont = scan.next();
	}
	}
	
	
	System.out.println("Machine Reset Succesfully!! all the inventory updated");
}

}
