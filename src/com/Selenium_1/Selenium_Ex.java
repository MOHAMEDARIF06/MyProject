package com.Selenium_1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Ex {
	public static void main(String[] args) {

		// System.set(String Key,String Values);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srtaa\\eclipse-workspace-new\\Selenium_1\\Driver\\chromedriver.exe");

		// Tool ObjectName = new classname(con); (webdriver = Interface,chrome=Class)

		WebDriver driver = new ChromeDriver(); // -----> upcasting

		driver.get("https://www.facebook.com/login/"); //----> go to log in page
		
		System.out.println(driver.getTitle()); //-----> give the title
		
		System.out.println(driver.getCurrentUrl()); //----> give the url

		driver.navigate().to("https://www.instagram.com/accounts/login/"); //----> go to next given log in page
		
		driver.navigate().back(); //----> back to previous page
		
		driver.navigate().forward(); //----> go to previous page
		
		driver.navigate().refresh(); //----> refresh the page
		
		driver.manage().window().maximize();
	
		Dimension size = driver.manage().window().getSize(); //----> it will give the size of page and retun type = dimension
		System.out.println(size);
		
		driver.manage().window().minimize();
		
		Dimension size2 = driver.manage().window().getSize();
		System.out.println(size2);

	}

}
