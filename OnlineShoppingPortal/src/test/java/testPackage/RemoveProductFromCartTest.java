package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.baseTest;
import pomPackage.CellPhonespage;
import pomPackage.Electronicspage;
import pomPackage.ShoppingCartPage;
import pomPackage.welcomePage;
@Listeners(genericPackage.MyListener.class)  
public class RemoveProductFromCartTest extends baseTest {
	
	@Test
	public void removeProductTestCase() throws IOException, InterruptedException {
		
		
		welcomePage wp = new welcomePage(driver);
	    wp.getelectronicsLink().click();
	    
	     Electronicspage ep = new Electronicspage(driver);
	     ep.getPhones().click();
	    
	     CellPhonespage cp = new CellPhonespage(driver);
	     cp.getAddtocart().click();

	     wp.getshoppingcartLink().click();
	     
	     ShoppingCartPage sp = new ShoppingCartPage(driver);
	     
	     sp.getCheckboxforsmartphone().click();

         sp.getUpdateshoppingcartButton().click();
         
          String cartText = sp.getCartisempty().getText();
          
          System.out.println(cartText);
         
           
   
	}

}
