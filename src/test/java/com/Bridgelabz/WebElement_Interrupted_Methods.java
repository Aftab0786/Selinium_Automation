package com.Bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WebElement_Interrupted_Methods {
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String expectedError = "The email address or mobile number you enterred isn't connected to an account. Find your account and log in. ";
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("alam41976@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Aftab@0786");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.name("pass"));
		element.clear();
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Aftab@0786");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(2000);
		WebElement errorMsg = driver.findElement(By.linkText("Find your account and log in"));
		String actualError = errorMsg.getText();
		System.out.print("Error msg is:" +actualError);
		driver.close();
		
	}
	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("alam41976@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aftab@0786");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("// a[text()='Forgotten password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id ='identify_email']")).sendKeys("alam41976@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@name='did_submit']")).click();
//		Thread.sleep(2000);
		}
		@Test
		public void facebook_signup() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();
			driver1.get("https://www.facebook.com/");
			Thread.sleep(4000);
			driver1.manage().window().maximize();
			Thread.sleep(2000);
			driver1.findElement(By.xpath("//a[text()='Create new account']")).click();
			Thread.sleep(2000);
			driver1.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aftab");
			Thread.sleep(2000);
			driver1.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Alam");
			Thread.sleep(2000);
			driver1.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("alam41976@gmail.com");
			Thread.sleep(2000);
			driver1.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("alam41976@gmail.com");
			Thread.sleep(2000);
			driver1.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Aftab@123");
			Thread.sleep(2000);
			WebElement dateElement= driver1.findElement(By.xpath("//*[@id='day']"));
			Thread.sleep(2000);
			WebElement monthElement = driver1.findElement(By.xpath("//*[@id='month']"));
			Thread.sleep(2000);
			WebElement yearElement = driver1.findElement(By.xpath("//*[@id='year']"));
			Thread.sleep(2000);
			
			
			Select dateDropdown = new Select(dateElement); 
			Select monthDropdown = new Select(monthElement);
			Select yearDropdown = new Select(yearElement);
			
			dateDropdown.selectByVisibleText("25");
			monthDropdown.selectByVisibleText("Aug");
			yearDropdown.selectByVisibleText("1998");
			Thread.sleep(2000);
			driver1.findElement(By.xpath("//label[text()='Male']")).click();
			Thread.sleep(2000);
			driver1.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
			Thread.sleep(2000);
			//driver1.close();
		}
		 

}
