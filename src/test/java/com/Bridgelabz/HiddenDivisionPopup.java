package com.Bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HiddenDivisionPopup {
	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
		Thread.sleep(2000);
		ChromeOptions option = new ChromeOptions();
		Thread.sleep(2000);
		option.addArguments("--disable-notifications");
		Thread.sleep(2000);
		option.addArguments("--disable-geolocation");
		Thread.sleep(2000);
		option.addArguments("--ignore-certificate-errors");
		Thread.sleep(2000);
		WebDriver driver = new ChromeDriver(option);
		Thread.sleep(2000);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@placeholder='7/30/2022'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("24")).click();

		
	}

}
