package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	//declaration
	
	@FindBy(xpath = "//input[@name='removefromcart']/../..//img[@alt='Picture of Smartphone']")private WebElement smartphonecarticon;
	@FindBy(xpath = "//input[@name='removefromcart']") private WebElement Checkboxforsmartphone;
	@FindBy(xpath = "//input[@name='updatecart']")private WebElement UpdateshoppingcartButton;
	@FindBy(xpath = "//div[@class='order-summary-content']")private WebElement Cartisempty;
	@FindBy(id = "termsofservice")private WebElement termNcond;
	@FindBy(id = "checkout")private WebElement checkOut;
	 //initialization
	
	
	

	

	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	 public WebElement getCheckOut() {
		return checkOut;
	}

	//Utilization
	public WebElement getSmartphonecarticon() {
		return smartphonecarticon;
	}

	public WebElement getCheckboxforsmartphone() {
		return Checkboxforsmartphone;
	}

	public WebElement getUpdateshoppingcartButton() {
		return UpdateshoppingcartButton;
	}

	public WebElement getCartisempty() {
		return Cartisempty;
	}

	public WebElement getTermNcond() {
		return termNcond;
	}
	
	
}
