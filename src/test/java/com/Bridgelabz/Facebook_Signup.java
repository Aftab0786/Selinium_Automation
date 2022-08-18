package com.Bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook_Signup {
	@Test
	public void signup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Aftab");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Alam");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("alam41976@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("alam41976@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Aftab@0786");
		Thread.sleep(2000);
		WebElement dateElement= driver.findElement(By.name("birthday_day"));
		Thread.sleep(2000);
		WebElement monthElement = driver.findElement(By.name("birthday_month"));
		Thread.sleep(2000);
		WebElement yearElement = driver.findElement(By.name("birthday_year"));
		Thread.sleep(2000);

		Select d_Dropdown = new Select(dateElement); 
		Select m_Dropdown = new Select(monthElement);
		Select y_Dropdown = new Select(yearElement);

		d_Dropdown.selectByVisibleText("15");
		m_Dropdown.selectByVisibleText("May");
		y_Dropdown.selectByVisibleText("2002");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
	}
}
