package com.Bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClearField_Without_ClearMethod {
	@Test
	public void clearField() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Aftab Alam"); 
		Thread.sleep(2000); 
	 
	    String value = driver.findElement(By.id("username")).getAttribute("value"); 
	    System.out.println("Value present inside the text box is : "+value); 
	    driver.findElement(By.id("username")).clear(); 
	    Thread.sleep(2000); 
	    driver.findElement(By.id("username")).sendKeys("Aftab Alam"); 
	    Thread.sleep(2000); 
	    driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE); 
	    Thread.sleep(2000); 
		
	}

}
