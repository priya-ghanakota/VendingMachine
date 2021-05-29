package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsMap {

public Map<String, List<Integer>> myMap() {
		
		List<Integer> cokelist=new ArrayList<Integer>();
		cokelist.add(25);
		cokelist.add(15);
		
		
		List<Integer> sodalist=new ArrayList<Integer>();
		sodalist.add(45);
		sodalist.add(5);
		
		List<Integer> pepsilist=new ArrayList<Integer>();
		pepsilist.add(35);
		pepsilist.add(10);

				
		
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		map.put("Coke", cokelist);
		map.put("Soda", sodalist);
		map.put("Pepsi", pepsilist);
		
		return map;
	}

}
