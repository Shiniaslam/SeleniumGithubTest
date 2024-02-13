package testutils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {
	public static void getScreenshot(WebDriver driver,String title) throws IOException {
		 File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String fileName = getFileName(title); // Google
		 File destFile = new File(fileName);
		 System.out.println("Screenshot captured in the location: "+fileName);
		 FileHandler.copy(srcFile, destFile); // FileUtils apache.commons.io
	 }
	public static String getFileName(String title) { // Google
		 String fileName = title+"_"+new Date().toString(); // Google_
		 String destFileName = fileName.replaceAll("[^A-Za-z0-9]", "_"); // replace all chars except alphanumeric chars
		 return "screenshots\\"+destFileName+".png";
	 }
}