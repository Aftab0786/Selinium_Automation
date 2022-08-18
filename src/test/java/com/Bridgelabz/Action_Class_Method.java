package com.Bridgelabz;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Action_Class_Method {
	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
	@Test
	public void gmail_contextClickDemo_mailArchive() throws InterruptedException {
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("alam41976@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("munna0786");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);
		String xp =  "//h2[text()='Hello World']";
		Thread.sleep(2000);
		WebElement mail = driver.findElement(By.xpath(xp));
		System.out.print(mail.getText());
		Actions actions = new Actions(driver);
		actions.contextClick(mail).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='J-N-JX aDE aDD'])[1]")).click();
		
	}
	@Test
	public void test() throws InterruptedException, AWTException {
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.linkText("actiTime Inc"));
		Actions actions = new Actions(driver);
		actions.contextClick(link).perform();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		driver.quit();
		
	}
	@Test
	public void moveToElement() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("pass"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.id("email"));
		element1.click();
		
	}
	@Test
	public void dragDrop() throws InterruptedException {
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement element1 = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(element).perform();
		actions.moveToElement(element1).release().perform();
		Thread.sleep(2000);
			
	}
	public void keys() throws InterruptedException{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search =driver.findElement(By.xpath("//input[@name='q'"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).perform();
		Thread.sleep(4000);
		actions.sendKeys("qspiders").perform();
		Thread.sleep(4000);
		actions.keyUp(Keys.SHIFT).perform();
		Thread.sleep(4000);
		actions.doubleClick(search).perform();
		Thread.sleep(4000);
		actions.keyDown(Keys.CONTROL).sendKeys("x").perform();
		Thread.sleep(4000);
		actions.keyUp(Keys.CONTROL).perform();
		Thread.sleep(4000);
		actions.keyDown(Keys.CONTROL).sendKeys("v").perform();
		Thread.sleep(4000);
		actions.keyUp(Keys.CONTROL).perform();
		
	}


	
}
