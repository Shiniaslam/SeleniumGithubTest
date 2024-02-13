package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page01_AmazonHomePage {
	WebDriver driver; // null
	WebDriverWait wait; // null
public Page01_AmazonHomePage(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait=wait;
	}
public By booksList = By.id("searchDropdownBox");
public By searchField = By.name("field-keywords");


 public void selectCategory(String option) {
	 WebElement book =driver.findElement(booksList);
	  Select b1= new Select(book);
	  b1.selectByVisibleText(option);
	 
 }
 public void enterSearchItem(String value) throws InterruptedException {
		WebElement search = driver.findElement(searchField);
		search.sendKeys(value);
		for(int i=0;i<5;i++)
		  {
			  search.sendKeys(Keys.DOWN);
			  Thread.sleep(1000);
		  }
		  search.sendKeys(Keys.ENTER);
 
}

	

}
