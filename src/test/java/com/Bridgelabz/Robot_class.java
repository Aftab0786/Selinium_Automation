package com.Bridgelabz;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Robot_class {
	@Test
	public void mouseKey() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("alam41976@gmail.com");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.mouseMove(200, 300);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ALT);
	    r.keyPress(KeyEvent.VK_F);
	    
	    r.keyPress(KeyEvent.VK_F);
	    r.keyRelease(KeyEvent.VK_ALT);
	    Thread.sleep(3000);
	    r.keyRelease(KeyEvent.VK_W);
	    Thread.sleep(3000);
	    driver.close();
	}

}
