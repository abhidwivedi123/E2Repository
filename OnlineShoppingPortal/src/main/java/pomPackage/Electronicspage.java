package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronicspage {
	
	//declaration

	@FindBy(xpath = "//img[@title='Show products in category Camera, photo']")private WebElement camera;
	@FindBy(xpath = "//img[@alt='Picture for category Cell phones']")private WebElement phones;
	
	
	 
	//initialization
	public  Electronicspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
    }

	//Utilization
	public WebElement getCamera() {
		return camera;
	}


	public WebElement getPhones() {
		return phones;
	}


	
	
	
	 

	
	
	
	
	
	
	
	
}