package com.Selenium_1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationpractice {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srtaa\\eclipse-workspace-new\\Selenium_1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("srtaarif2020@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='submit']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//div[normalize-space()='Mr.']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("mohamed");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("aarif");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("12345");
		Thread.sleep(2000);
		
		WebElement days = driver.findElement(By.id("days"));
		Select s = new Select(days);
		s.selectByValue("6");
		Thread.sleep(2000);
		
		WebElement months = driver.findElement(By.id("months"));
		Select s1 = new Select(months);
		s1.selectByValue("10");
		Thread.sleep(2000);
		
		WebElement years = driver.findElement(By.id("years"));
		Select s2 = new Select(years);
		s2.selectByValue("1998");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("PUMA");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("south street");
		Thread.sleep(2000);
		
		driver.findElement(By.name("city")).sendKeys("America");
		Thread.sleep(2000);
		
		WebElement states = driver.findElement(By.id("id_state"));
		Select s3 = new Select(states);
		s3.selectByValue("32");
		
		driver.findElement(By.id("postcode")).sendKeys("34221");
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select s4 = new Select(country);
		s4.selectByValue("21");
		Thread.sleep(2000);
		
		driver.findElement(By.id("other")).sendKeys("hello");
		Thread.sleep(2000);
		
		driver.findElement(By.name("phone_mobile")).sendKeys("9876543210");
		Thread.sleep(2000);
		
		driver.findElement(By.name("alias")).sendKeys("srtaarif1010@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='submitAccount']")).click();
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\srtaa\\Pictures\\Camera Roll.png");
		FileUtils.copyFile(source, destination);
		
		
		
		
	}

}
