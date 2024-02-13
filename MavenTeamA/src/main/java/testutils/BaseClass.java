package testutils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public WebDriver driver;
	public WebDriverWait wait;
	public void browserInitialization(String url) {
		driver = new ChromeDriver();
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get(url);
		System.out.println("Opening url: "+url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
