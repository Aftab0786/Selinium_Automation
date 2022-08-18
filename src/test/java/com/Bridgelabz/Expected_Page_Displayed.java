package com.Bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Expected_Page_Displayed {
	@Test
	public void expectedPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String expectedTitle ="Facebook";
		String actualTitle =driver.getTitle();
		System.out.print("Actual Title is:" +actualTitle);
		Thread.sleep(2000);
		if(actualTitle.contains(expectedTitle)) {
			System.out.print("expected page is displayed");
		
		}
		else {
			System.out.print("expected page is not displayed");
		}
		
	}

}
