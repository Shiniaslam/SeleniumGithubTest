package testutils;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class WindowHandling {
	
	public static void switchToParticularWindow(WebDriver driver, int index) throws InterruptedException {
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        Thread.sleep(2000);  // optional
        System.out.println("Switched to new tab");
    }

}
