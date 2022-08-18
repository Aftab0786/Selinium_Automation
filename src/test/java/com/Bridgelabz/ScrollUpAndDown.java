package com.Bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollUpAndDown {
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.print(driver.getTitle());
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Login"));
		action.moveToElement(element).click().perform();
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0, -1000)");
		Thread.sleep(4000);
		
	}

}
