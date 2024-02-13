package pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import testutils.Screenshot;
import testutils.WindowHandling;

public class Page02_FirstResultPage {
	WebDriver driver; // null
	WebDriverWait wait; // null
public Page02_FirstResultPage(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait=wait;

}
 public By firstresults = By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]");
 public By prodLinks = By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']");
 public By prodImages = By.xpath("//img[@class='s-image']");
 
 public void getTotalNoOfProdLinks() {
	  List<WebElement> links= new ArrayList<WebElement>(); 	
	  links = driver.findElements(prodLinks); 	
	  System.out.println("Total no:of links: "+links.size()); 	
	}
	
	public void getTotalNoOfProdImages() {
	  List <WebElement> images= new ArrayList<WebElement>(); 	
	  images = driver.findElements(prodImages);
	  System.out.println("Total no:of links: "+images.size());
	}
 
 public void clickOnFirstResult() {
	 driver.findElement(firstresults).click();
 }
 
}
