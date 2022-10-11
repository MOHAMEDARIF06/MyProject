package com.Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_EX {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srtaa\\eclipse-workspace-new\\Selenium_1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		           //input       [        @aria-req        =  //'true'  ]            //index
		//---->("//tagname[@attributename='attributevalue'][1]")
		
		driver.findElement(By.xpath("//input[@aria-required='true'][1]")).sendKeys("aarif123@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("12344");
		
		Thread.sleep(2000);
		
		// (//input[text()='value'])
		
		driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		
		Thread.sleep(2000);
		
		// (//input[contains(text(),'text')]
		
		driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
		
		
		
		
		
		
		
		

	}

}
