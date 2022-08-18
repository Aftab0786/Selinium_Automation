package com.Bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_Frames {
	@Test 
	public void frames() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/alam4/OneDrive/Desktop/Page2.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("Aftab");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("Alam");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}

}
