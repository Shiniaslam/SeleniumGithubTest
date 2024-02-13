package testcases;

import org.testng.annotations.Test;

import pages.Page01_AmazonHomePage2;
import pages.Page02_FirstResultPage2;
import pages.Page03_AddToCart2;
import pages.Page04_AmazonProceedtoBuy2;
import testutils.BaseClass;
import testutils.Screenshot;
import testutils.WindowHandling;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TC015_AmazonPFTest extends BaseClass {
	Page01_AmazonHomePage2 hp ;
	Page02_FirstResultPage2 fp;
	Page03_AddToCart2 ap;
	Page04_AmazonProceedtoBuy2 pb;
	
  @Test (priority = 1)
  public void amazonHomePageTest() throws InterruptedException {
	  String actual = driver.getTitle();
	  String expected ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	  Assert.assertEquals(actual, expected);
	  hp.selectCategory("Books");
	  hp.enterSearchItem("comic books");
	  
  }
  
  @Test (priority = 2)
  public void firstResultPaageTest() {
	  fp.getTotalNoOfProdLinks();
	  fp.getTotalNoOfProdImages();
	  fp.clickOnFirstResult();
	  
  }
  
  @Test (priority = 3)
  public void addToCartTest() throws InterruptedException, IOException {
	  WindowHandling.switchToParticularWindow(driver, 1);
	  Screenshot.getScreenshot(driver, "resultsPage");
	  ap.clickOnAddToCart();
  }
  
  @Test(priority = 4)
  public void proceedToBuyTest() {
	  pb.clickOnProceedToBuy();
	  
  }
  

  @BeforeTest
  public void launchBrowser() {
	  browserInitialization("https://www.amazon.in/");
	  hp = new Page01_AmazonHomePage2(driver, wait);
	  fp = new Page02_FirstResultPage2(driver,wait);
	  ap = new Page03_AddToCart2(driver,wait);
	  pb = new Page04_AmazonProceedtoBuy2(driver,wait);
  }

  @AfterTest
  public void closeBrowser() throws IOException {
	  Screenshot.getScreenshot(driver, "finalpage"); 
	  driver.quit();
	  
	  
  }

}
