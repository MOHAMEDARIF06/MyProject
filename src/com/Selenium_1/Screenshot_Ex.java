package com.Selenium_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Ex {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srtaa\\eclipse-workspace-new\\Selenium_1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");

		// Thread.sleep(2000);

		TakesScreenshot js = (TakesScreenshot) driver; // DOWNCASTING

		File source = js.getScreenshotAs(OutputType.FILE); // JVM

		File destination = new File("C:\\Users\\srtaa\\eclipse-workspace-new\\Selenium_1\\screenshot.png");

		FileUtils.copyFile(source, destination);
		
		driver.findElement(By.name("email")).sendKeys("aarif12@gmail.com");
		
		TakesScreenshot js1 = (TakesScreenshot) driver;
		
		File source1 = js1.getScreenshotAs(OutputType.FILE);
		
		File destination1 = new File("C:\\Users\\srtaa\\Pictures\\Camera Roll.png");
		
		FileUtils.copyFile(source1, destination1);
		
		

	}

}
