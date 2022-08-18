package com.Bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyhomepageUsingUniqueElement {
	@Test
	public void uniqueElement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("alam41976@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Aftab@0786");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		WebElement logoutBtn = driver.findElement(By.xpath("//a[.='Logout']"));
		if (logoutBtn.isDisplayed()) 
		{
		System.out.println("Home page is displayed");
		} 
		else{
		System.out.println("Home page is NOT displayed");
		}
	}

}
