package test;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.Validations;



public class ValidationsTest {
	
  @Test
  public void TC1_Validations_IsValid_code() {
	  
	  Validations val = new Validations();
	 
	  boolean is_valid = val.IsValid_code(25);
	  
	  Assert.assertEquals(is_valid,true);
	
  }

  @Test
  public void TC2_Validations_IsValid_code() {
	  
	  Validations val = new Validations();
	 
	  boolean is_valid = val.IsValid_code(30);
	  
	  Assert.assertEquals(is_valid,false);

  }
  
  @Test
  public void TC3_Validations_Isvalid_amount() {
	 
	  Validations valid = new Validations();
      
	  boolean is_valid = valid.Isvalid_amount(1);
	  
	  Assert.assertEquals(is_valid,true);
	  
	 

  }
  
  @Test
  public void TC4_Validations_Isvalid_amount() {
	 
	  Validations valid = new Validations();
      
	  boolean is_valid = valid.Isvalid_amount(4);
	  
	  Assert.assertEquals(is_valid,false);
	  
	  

  }
}
