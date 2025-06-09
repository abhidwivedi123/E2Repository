package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.Flib;
import genericPackage.baseTest;
import genericPackage.workLib;
import pomPackage.CellPhonespage;
import pomPackage.CheckoutPage;
import pomPackage.Electronicspage;
import pomPackage.ShoppingCartPage;
import pomPackage.welcomePage;

public class BuyProductTest extends baseTest {
	@Test
	public  void buyProductTestCase () throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		welcomePage wp = new welcomePage(driver);
		
	     Flib flib = new Flib();
	     wp.getelectronicsLink().click();
	     Thread.sleep(1000);
	     Electronicspage ep = new Electronicspage(driver);
	     ep.getPhones().click();
	     Thread.sleep(1000);
	     CellPhonespage cp = new CellPhonespage(driver);
	     cp.getAddtocart().click();

	     wp.getshoppingcartLink().click();
	     Thread.sleep(1000);
	     ShoppingCartPage scp = new ShoppingCartPage(driver);
	     scp.getCheckboxforsmartphone().click();
	     scp.getTermNcond().click();
	     scp.getCheckOut().click();
	     
	    
	     String city=flib.readExcelData(TEST_EXCEL_PATH, BPD, 1, 0);
	     String address1 = flib.readExcelData(TEST_EXCEL_PATH, BPD, 1, 1);
	     String pincode = flib.readNumbricExcelData(TEST_EXCEL_PATH, BPD, 1, 2);
	     String phone = flib.readNumbricExcelData(TEST_EXCEL_PATH, BPD, 1, 3);
	     
	     workLib wl = new workLib();
	     int rn = wl.randomNo();
	     String phoneNo = phone+rn;
	     
	    CheckoutPage checkop = new CheckoutPage(driver);
	     checkop.buyProductMethod(city, address1, pincode, phoneNo);
	     
	     
	     
	     
	}

}
