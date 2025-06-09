package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomePage {

	
	@FindBy(linkText = "Register") private WebElement registerLink;
	@FindBy(linkText = "Log in") private WebElement loginLink;
	@FindBy(partialLinkText  = "Wishlist") private WebElement wishlistLink;
	@FindBy(partialLinkText  = "Shopping cart") private WebElement shoppingcartLink;
	@FindBy(partialLinkText  = "Books") private WebElement booksLink;
	@FindBy(partialLinkText  = "Computers") private WebElement computersLink;
	@FindBy(partialLinkText  = "ELECTRONICS") private WebElement electronicsLink;
	@FindBy(linkText = "Log out")private WebElement logOutLink;
	


	public WebElement getlogOutLink() {
		return logOutLink;
	}
	
	
	public welcomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getloginLink() {
		return loginLink;
	}
	
	public WebElement getwishlistLink() {
		return wishlistLink;
	}
	
	public WebElement getshoppingcartLink() {
		return shoppingcartLink;
	}
	
	public WebElement getregisterLink() {
		return registerLink;
	}
	
	public WebElement getbooksLink() {
		return booksLink;
	}
	
	public WebElement getcomputersLink() {
		return computersLink;
	}
	
	public WebElement getelectronicsLink() {
		return electronicsLink;
	}
	
	
}
