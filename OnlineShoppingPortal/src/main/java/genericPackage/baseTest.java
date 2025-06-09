package genericPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomPackage.LoginPage;
import pomPackage.welcomePage;

public class baseTest implements IAutoConstant {
	
	
	
	public static WebDriver driver;
	
	@BeforeClass
	public void browserSetup() throws IOException {
		
		Flib flib = new Flib();
		 String browserValue = flib.readpropertydata(MAIN_PROP_PATH, "chrome");
		 String url = flib.readpropertydata(MAIN_PROP_PATH, "url");
		
		if(browserValue.equalsIgnoreCase("chrome")) {
			driver =new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox")){
			driver =new FirefoxDriver();
		}
		else if (browserValue.equalsIgnoreCase("edge")) {
			driver =new EdgeDriver();
		}
		else {
			 System.out.println("Invalid Browser !!!");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
	}
	@AfterClass
	public void browserTearDown() {
		driver.quit();
	}
	@BeforeMethod
	public void login() throws InterruptedException, EncryptedDocumentException, IOException {
		welcomePage wp = new welcomePage(driver);
		wp.getloginLink().click();
		Flib flib=new Flib();
		String email = flib.readExcelData(MAIN_EXCEL_PATH, VALIDCREDS, 1, 0);
		String password = flib.readExcelData(MAIN_EXCEL_PATH, VALIDCREDS, 1, 1);
		Thread.sleep(1000);
		
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(email, password);
		Thread.sleep(1000);
		}
	@AfterMethod
	public void logout() throws InterruptedException {
		welcomePage wp = new welcomePage(driver);
		wp.getlogOutLink().click();
		Thread.sleep(4000);
	}

}
