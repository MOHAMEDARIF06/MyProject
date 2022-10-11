package com.Selenium_1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Purchasing_Order {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srtaa\\eclipse-workspace-new\\Selenium_1\\Driver\\chromedriver.exe");

		 driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@class='header_user_info']//parent::a")).click();

		driver.findElement(By.xpath("//label//following-sibling::input[@name='email']")).sendKeys("srtaarif2020@gmail.com");

		driver.findElement(By.xpath("//span//child::input")).sendKeys("12345");

		driver.findElement(By.xpath("//span//child::i[@class='icon-lock left']")).click();

		WebElement women = driver.findElement(By.xpath("//ul/preceding-sibling::a[.='Women']"));
		Actions a = new Actions(driver);
		a.moveToElement(women).build().perform();

		driver.findElement(By.xpath("//a/preceding::a[@title='Casual Dresses' and .='Casual Dresses'][2]")).click();

		driver.findElement(By.xpath("//a[@class='product_img_link']//child::img")).click();
		WebElement iframe = driver.findElement(By.xpath("//div//child::iframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//button//child::span[.='Add to cart']")).click();

		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		driver.findElement(By.xpath("//a//child::span[.='Proceed to checkout']")).click();
		driver.findElement(By.xpath("//button//child::span[.='Proceed to checkout']")).click();
		driver.findElement(By.xpath("//span//child::input[@id='cgv']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//p//child::a[@title='Pay by check.']")).click();
		driver.findElement(By.xpath("//button//child::span[.='I confirm my order']")).click();
		driver.findElement(By.xpath("//div//child::a[@title='Log me out']")).click(); 

		driver.findElement(By.xpath("//div//child::input[@name='email']")).sendKeys("srtaarif2020@gmail.com");
		driver.findElement(By.xpath("//span//child::input")).sendKeys("12345");
		driver.findElement(By.xpath("//span//child::i[@class='icon-lock left']")).click();

		WebElement dresses = driver.findElement(By.xpath("(//li//child::a[.='Dresses'])[2]"));
		Actions b = new Actions(driver);
		b.moveToElement(dresses).build().perform();

		driver.findElement(By.xpath("(//li//child::a[.='Casual Dresses'])[2]")).click();
		driver.findElement(By.xpath("//a//child::img[@title='Printed Dress']")).click();
		WebElement iframe1 = driver.findElement(By.xpath("//div//child::iframe"));
		driver.switchTo().frame(iframe1);
		driver.findElement(By.xpath("//button//child::span[.='Add to cart']")).click();
		driver.findElement(By.xpath("//a//child::span[normalize-space()='Proceed to checkout']")).click();
		driver.findElement(By.xpath("//a//child::span[.='Proceed to checkout']")).click();
		driver.findElement(By.xpath("//button//child::span[.='Proceed to checkout']")).click();
		driver.findElement(By.xpath("//span//child::input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button//child::span[normalize-space()='Proceed to checkout']")).click();
		driver.findElement(By.xpath("//p//child::a[@class='cheque']")).click();
		driver.findElement(By.xpath("//button//child::span[.='I confirm my order']")).click();
		driver.findElement(By.xpath("//div//child::a[@class='logout']")).click(); 

	}

}
