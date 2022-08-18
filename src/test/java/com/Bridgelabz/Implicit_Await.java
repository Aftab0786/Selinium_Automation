package com.Bridgelabz;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import com.google.common.base.Stopwatch;

public class Implicit_Await {
	@Test
	public void implicit() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://sellglobal.ebay.in/seller-center/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Stopwatch Watch=null;
		try {
			Watch=Stopwatch.createStarted();
			
			driver.findElement(By.linkText("wrong SELLING")).click();
			
		}
		catch(Exception e) {
			Watch.stop();
			System.out.print(e);
			System.out.print(Watch.elapsed(TimeUnit.SECONDS) + "seconds");
		}
	}

}

