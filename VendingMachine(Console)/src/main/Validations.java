package main;
import java.util.List;
import java.util.Map;

public class Validations {
	ProductsMap map=new ProductsMap();
    Map<String, List<Integer>> mp= map.myMap();
    
     
    
public boolean IsValid_code(int code)
{
	
	if(!(code==25 || code==45 || code==35 || code==99))
	{
		
		return false;
	}
return true;
}



public boolean IsValid_code(String code)
{
if(!(Integer.parseInt(code)==mp.get("Coke").get(0) || Integer.parseInt(code)==mp.get("Soda").get(0) || Integer.parseInt(code)==mp.get("Pepsi").get(0)))
{
	return false;
}
return true;
}



public boolean Isvalid_amount(int amount)
{
	
	
	if(!(amount==5 || amount==10 || amount==25 || amount==1)) {
		return false;
	}
	else {
		return true;
	}
	
}
}
