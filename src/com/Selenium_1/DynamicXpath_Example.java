package com.Selenium_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicXpath_Example {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srtaa\\eclipse-workspace-new\\Selenium_1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@id='username_span']//preceding-sibling::input")).sendKeys("MohamedAarif");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form[@name='login_form']//descendant::input[@name='password']")).sendKeys("Aarif@1998");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//table[@class='login']//descendant::input[@type='Submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@name='location']//child::option[@value='Melbourne']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//select[@id='hotels']//child::option[@value='Hotel Sunshine']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//select[@class='search_combobox']//child::option[@value='Deluxe']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//select[@name='room_nos']//child::option[@value='1']")).click();
	    Thread.sleep(2000);
	    
	    WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	    checkin.clear();
	    checkin.sendKeys("10/09/2022");
	    
	    WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
	    checkout.clear();
	    checkout.sendKeys("12/09/2022");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//select[@name='adult_room']//child::option[@value='2']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@id='child_room']//child::option[.='1 - One']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='Reset']//preceding::input[@name='Submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td//child::input[@id='radiobutton_0']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='cancel']//preceding::input[@id='continue']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='reg_error']//following::input[@name='first_name']")).sendKeys("Mohamed");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='reg_error']//following::input[@name='last_name']")).sendKeys("Aarif");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@id='address_span']//preceding-sibling::textarea")).sendKeys("South America");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td//descendant::input[@name='cc_num']")).sendKeys("1234567890321323");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@name='cc_type']//child::option[.='Master Card']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@name='cc_exp_month']//child::option[@value='1']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@name='cc_exp_year']//child::option[@value='2022']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td//child::input[@id='cc_cvv']")).sendKeys("456");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td//child::input[@name='book_now']")).click();
		
	}

}
