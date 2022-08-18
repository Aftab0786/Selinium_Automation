package com.Bridgelabz;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Take_Screenshot {
	@Test
	public void screenshot() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("alam41976@gmail.com");
		Thread.sleep(2000);
		TakesScreenshot ts =(TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("./ScreenShot/"+"FBscreenshort"+".png"); 
		FileHandler.copy(srcFile, destFile);
	}


}
