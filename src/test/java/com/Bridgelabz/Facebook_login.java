package com.Bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_login {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("alam41976@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("sadam@1234");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);

	}

}
