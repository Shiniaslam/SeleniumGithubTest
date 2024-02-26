package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestUtils.BaseClass;

public class LoginPage extends BaseClass {

	@Test(priority=1,description="This TC willperform valid login ")
	public void title() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		}
	@Test(priority=2,description="Mouse hovering to Admin")
	public void Admin() {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.cssSelector("aside[class='oxd-sidepanel'] li:nth-child(1)"));
		action.click(element).perform();
	}
	@Test(priority=3,description="Select usermgt")
	public void Usermangt() {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.cssSelector("aside[class='oxd-sidepanel'] li:nth-child(1))"));
	     action.moveToElement(element).perform();
	}
		

 @BeforeTest
 public void setup(){
	   browserInitialization("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
   }
}