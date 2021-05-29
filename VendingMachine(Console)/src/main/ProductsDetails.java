package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
public class ProductsDetails {
	ProductsMap map=new ProductsMap();
	Map<String,List<Integer>> mp=map.myMap();
	List<Integer> l1=new ArrayList<Integer>();
    InputStream inputStream;
    Properties p=new Properties();
    String ItemInventory_propFileName="ItemInventory.properties";
    public List<Integer> GetDetails(int code) {
	
Set<String> keys = mp.keySet();
for(Object key: keys)
{
	if(code==25) {
		if(mp.containsKey("Coke")) {
			List<Integer> cokelist=mp.get("Coke");
			return cokelist;
		}
	}
	if(code==45){
		if(mp.containsKey("Soda")) {
			return mp.get("Soda");
		}
	}
	if(code==35) {
		if(mp.containsKey("Pepsi")) {
			return mp.get("Pepsi");
		}
	}
}
	return l1;
	}
	
	public int getMaxQuantity(String code) {
		
		int max_quantity=0;
		

		
		try {
			
			  
			inputStream = getClass().getClassLoader().getResourceAsStream(ItemInventory_propFileName);
			p.load(inputStream);
		    String property_name = code+"_max_quantity";
		    max_quantity = Integer.parseInt(p.getProperty(property_name));
		    inputStream.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		 return max_quantity;
	}

	public int getAvailQuantity(String code) {
		int avail_quantity=0;
		try {
		  
		inputStream = getClass().getClassLoader().getResourceAsStream(ItemInventory_propFileName);
		p.load(inputStream);
	    String property_name = code+"_available_quantity";
	    avail_quantity = Integer.parseInt(p.getProperty(property_name));
	    
	    inputStream.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	} 
        return avail_quantity;
	}

	public int resetQuantity(String code, int qty) { //This is for supplier
		try {
			inputStream = getClass().getClassLoader().getResourceAsStream(ItemInventory_propFileName);
			p.load(inputStream);
			inputStream.close();
			String property_name = code+"_max_quantity";
			   
		   
		   OutputStream out = new FileOutputStream("ItemInventory_propFileName");
		   p.setProperty(property_name,String.valueOf(qty));
		   p.store(out, null);
		  
		   out.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		} 
		return qty;
	}

	public void updateQuantity(String code, int qty) { //This is for supplier
		
		try {
			inputStream = getClass().getClassLoader().getResourceAsStream(ItemInventory_propFileName);
			p.load(inputStream);
			inputStream.close();
			String property_name = code+"_available_quantity";
			
           OutputStream out = new FileOutputStream("./src/ItemInventory.properties");
		   p.setProperty(property_name,String.valueOf(qty));
		   p.store(out, null);
		  
		   out.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
	
	}
}
