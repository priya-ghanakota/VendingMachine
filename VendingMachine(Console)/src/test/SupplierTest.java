package test;

import main.Supplier;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SupplierTest {
	
	Supplier sup = new Supplier();

  @Test
  public void TC9_Supplier_Valid_passCode() {
	  
	  boolean valid = sup.passCode("1234");
	  Assert.assertEquals(valid, true);
	
  }
  
  @Test
  public void TC10_Supplier_inValid_passCode() {
	  boolean valid = sup.passCode("1235");
	  Assert.assertEquals(valid, false);
  }

 
}
