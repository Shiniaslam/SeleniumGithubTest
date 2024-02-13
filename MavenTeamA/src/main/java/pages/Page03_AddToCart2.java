package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Page03_AddToCart2 {
	
		WebDriver driver; // null
		WebDriverWait wait; // null
	public Page03_AddToCart2(WebDriver driver,WebDriverWait wait) {
			this.driver=driver;
			this.wait=wait;

}
	public By addtocarts = By.xpath("//*[@id='add-to-cart-button']");
	
	
	public void clickOnAddToCart() {
		 WebElement addtocart= driver.findElement(addtocarts);
		 Assert.assertTrue(addtocart.isEnabled());
		 addtocart.click();
		 }
	//public void switchtoNewwindow()
	//WindowHandling.switchToParticularWindow(driver, 1);
	// Screenshot.getScreenshot(driver, "firstresult");
	
	
	}
	
	
	
	
