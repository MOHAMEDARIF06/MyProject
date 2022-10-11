package com.Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_method {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srtaa\\eclipse-workspace-new\\Selenium_1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// WEB ELEMENT METHODS
		
		driver.get("https://open.spotify.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-username")).sendKeys("srtaarif1010@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("Aarif Syed");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[text()='Log In']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		
		
		
		
		
	}

}
