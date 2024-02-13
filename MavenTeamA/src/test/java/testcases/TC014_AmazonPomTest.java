package testcases;

import org.testng.annotations.Test;

import pages.Page01_AmazonHomePage;
import pages.Page02_FirstResultPage;
import pages.Page03_AddToCart;
import pages.Page04_AmazonProceedtoBuy;
import testutils.BaseClass;
import testutils.Screenshot;
import testutils.WindowHandling;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TC014_AmazonPomTest extends BaseClass {
	Page01_AmazonHomePage hp ;
	Page02_FirstResultPage fp;
	Page03_AddToCart ap;
	Page04_AmazonProceedtoBuy pb;
	//Aslam Added
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
	  hp = new Page01_AmazonHomePage(driver, wait);
	  fp = new Page02_FirstResultPage(driver,wait);
	  ap = new Page03_AddToCart(driver,wait);
	  pb = new Page04_AmazonProceedtoBuy(driver,wait);
  }

  @AfterTest
  public void closeBrowser() throws IOException {
	  Screenshot.getScreenshot(driver, "finalpage"); 
	  driver.quit();
	  
	  
  }

}
