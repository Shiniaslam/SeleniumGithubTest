package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page01_AmazonHomePage2 {
	WebDriver driver; // null
	WebDriverWait wait; // null
public Page01_AmazonHomePage2(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait=wait;
		PageFactory.initElements(driver, this); 
	}
public	@FindBy (id="searchDropdownBox") 
WebElement booksList ;

public	@FindBy (name="field-keywords") 
WebElement searchField ;

public void selectCategory(String option) {
	  Select b1= new Select(booksList);
	  b1.selectByVisibleText(option);
	 
 }
 public void enterSearchItem(String value) throws InterruptedException {
		
	 searchField.sendKeys(value);
		for(int i=0;i<5;i++)
		  {
			searchField.sendKeys(Keys.DOWN);
			  Thread.sleep(1000);
		  }
		searchField.sendKeys(Keys.ENTER);
 
}

	

}
