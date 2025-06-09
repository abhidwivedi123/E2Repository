package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 //declaration
	@FindBy(id = "Email") private WebElement emailTB;
	@FindBy(id = "Password") private WebElement pwdTB;
	@FindBy(id = "RememberMe")private WebElement remembermecheckbox;
	@FindBy(linkText ="Forgot password?" )private  WebElement  forgotpasswordlink;
	@FindBy(xpath = "//input[@value='Log in']")private WebElement loginbutton;
	
	//initialization 
	public LoginPage(WebDriver driver)
	{
	
		PageFactory.initElements( driver,this);
	
	}
     
	//Utilization
	
	public WebElement getEmailTB() {
		return emailTB;
	}

	public WebElement getPwdTB() {
		return pwdTB;
	}

	public WebElement getRemembermecheckbox() {
		return remembermecheckbox;
	}

	public WebElement getForgotpasswordlink() {
		return forgotpasswordlink;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	//operation methoda /Business Logic
	public void validLoginMethod(String Email,String Password) throws InterruptedException
	{
	  emailTB.sendKeys(Email);
	  Thread.sleep(500);
	  pwdTB.sendKeys(Password);
	  loginbutton.click();	
	}	
	
	//operation methoda /Business Logic
	public void invalidLoginMethod(String Email,String Password) throws InterruptedException
	{
		emailTB.sendKeys(Email);
		Thread.sleep(500);
		pwdTB.sendKeys(Password);
		loginbutton.click();	
		
		Thread.sleep(1000);
		emailTB.clear();
        pwdTB.clear();
        Thread.sleep(500);
	
	}
}
