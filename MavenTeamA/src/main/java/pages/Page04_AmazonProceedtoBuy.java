package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Page04_AmazonProceedtoBuy {
	
	WebDriver driver; 
	WebDriverWait wait; 
public Page04_AmazonProceedtoBuy(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait=wait;

}
 public By proceedtobuys = (By.name("proceedToRetailCheckout"));
 
  public void clickOnProceedToBuy() {
  WebElement proceedtobuy = driver.findElement(proceedtobuys);
  Assert.assertTrue(proceedtobuy.isEnabled());
  proceedtobuy.click();


}
}
