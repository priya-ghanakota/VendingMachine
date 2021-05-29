package test;
import main.ProductsDetails;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsDetailsTest {

  @Test
  public void TC5_Product_Details_GetDetails() {
	  
	  ProductsDetails pd= new ProductsDetails();
	  List<Integer> pd_list;
	  pd_list = pd.GetDetails(25);
	  Assert.assertEquals(pd_list.isEmpty(),false);
	  Assert.assertEquals(pd_list.get(0).intValue(),25);
	  Assert.assertEquals(pd_list.get(1).intValue(),15);
	  
    
  }
  
  @Test
  public void TC6_Product_Details_GetDetails() {
	  
	  ProductsDetails pd= new ProductsDetails();
	  List<Integer> pd_list;
	  pd_list = pd.GetDetails(70);
	  Assert.assertEquals(pd_list.isEmpty(),true);
	  
	  
    
  }

  @Test
  public void TC7_Product_Details_getAvailQuantity() {
	  ProductsDetails pd= new ProductsDetails();
	  int avail_qty = pd.getAvailQuantity("25");
	  int avail_qty_from_prop_file = 120;
	  Assert.assertEquals(avail_qty,avail_qty_from_prop_file);
	  
  }
  
  @Test
  public void TC8_Product_Details_getAvailQuantity() {
	  ProductsDetails pd= new ProductsDetails();
	  int avail_qty = pd.getAvailQuantity("25");
	  int avail_qty_from_prop_file = 12;
	  Assert.assertNotEquals(avail_qty,avail_qty_from_prop_file);
	  
  }
}
