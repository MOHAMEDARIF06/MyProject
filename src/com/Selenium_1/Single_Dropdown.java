package com.Selenium_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srtaa\\eclipse-workspace-new\\Selenium_1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");

		WebElement fruit = driver.findElement(By.xpath("//select[@id ='fruits']"));

		Select s = new Select(fruit);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

		s.selectByVisibleText("Orange");
		
		WebElement lang = driver.findElement(By.xpath("//select[@id = 'lang']"));
		Select s1 = new Select(lang);
		s1.selectByValue("java");
		
		List<WebElement> options = s1.getOptions();
		for (WebElement alloptions : options) {
			System.out.println(alloptions.getText());
			
		}
		
		WebElement country = driver.findElement(By.xpath("//select[@id ='country']"));
		Select s2 = new Select(country);
		s2.selectByVisibleText("Argentina");
		
		List<WebElement> allSelectedOptions = s2.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			System.out.println(allSelectedOptions.get(i).getText());
			
		}
		
		
		
		
		

	}

}
