package com.Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Ex1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srtaa\\eclipse-workspace-new\\Selenium_1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("aarif23@");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345");
		
		WebElement start = driver.findElement(By.name("login"));
		
		start.click();
		
		
		
		
	}

}
