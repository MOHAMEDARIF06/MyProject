package com.Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Method_Ex {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srtaa\\eclipse-workspace-new\\Selenium_1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(2000);

		driver.findElement(By.name("username")).sendKeys("MohamedAarif");
		Thread.sleep(1000);

		driver.findElement(By.id("password")).sendKeys("Aarif@1998");
		Thread.sleep(1000);

		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);

		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByValue("New York");
		Thread.sleep(1000);

		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Sunshine");
		Thread.sleep(1000);

		WebElement roomtype = driver.findElement(By.name("room_type"));
		Select s2 = new Select(roomtype);
		s2.selectByVisibleText("Super Deluxe");
		Thread.sleep(1000);

		WebElement numberofrooms = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(numberofrooms);
		s3.selectByVisibleText("1 - One");
		Thread.sleep(1000);

		WebElement date = driver.findElement(By.name("datepick_in"));
		date.clear();
		date.sendKeys("23/08/2020");
		Thread.sleep(1000);

		WebElement out = driver.findElement(By.id("datepick_out"));
		out.clear();
		out.sendKeys("25/08/2020");
		Thread.sleep(1000);

		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adult);
		s4.selectByValue("2");
		Thread.sleep(1000);

		WebElement child = driver.findElement(By.name("child_room"));
		Select s5 = new Select(child);
		s5.selectByVisibleText("0 - None");
		Thread.sleep(1000);

		driver.findElement(By.name("Submit")).click();

	}

}
