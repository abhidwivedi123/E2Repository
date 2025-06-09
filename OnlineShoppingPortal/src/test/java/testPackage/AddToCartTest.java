package testPackage;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.baseTest;
import pomPackage.CellPhonespage;
import pomPackage.Electronicspage;
import pomPackage.ShoppingCartPage;
import pomPackage.welcomePage;
@Listeners(genericPackage.MyListener.class)  
public class AddToCartTest extends baseTest {
	@Test
	public  void addToCartTC_001() throws IOException, InterruptedException {
     welcomePage wp = new welcomePage(driver);
     wp.getelectronicsLink().click();
     Thread.sleep(1000);

     Electronicspage ep = new Electronicspage(driver);
     ep.getPhones().click();
    
     Thread.sleep(1000);
    
     CellPhonespage cp = new CellPhonespage(driver);
     cp.getAddtocart().click();
     Thread.sleep(1000);
     
     
     wp.getshoppingcartLink().click();
     Thread.sleep(2000);
     
     ShoppingCartPage sp = new ShoppingCartPage(driver);
     Thread.sleep(1000);
     
     if(sp.getSmartphonecarticon().isDisplayed())
     {
    	 Reporter.log("Product is added to cart !!!",true);
     }
     else
     {
    	 Reporter.log("Product is not added to cart !!!",true);
    	 
	 }
 }

}
