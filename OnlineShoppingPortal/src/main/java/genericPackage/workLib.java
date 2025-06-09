package genericPackage;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class workLib {
	
	public void selectByVisibleText(WebElement dropdown,String text) {
		Select sel = new Select(dropdown);
		sel.selectByVisibleText(text);
		
	}
	
	public void selectByIndexNo(WebElement dropdown,int index) {
		Select sel = new Select(dropdown);
		sel.selectByIndex(index);
	

		
	}
	
	public void selectByValue(WebElement dropdown,String value) {
		Select sel = new Select(dropdown);
		sel.selectByValue(value);
	
	}
	
	public int randomNo() {
		Random random = new Random();
		int rn = random.nextInt(9);
		//int ranNo = random.nextInt(1111, 9999);
		System.out.println(rn);
		return rn;
		
	}




}
