package com.Bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Print_Id {
	@Test
	public void print_WH() {
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		//get the window handle id of the browser 
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}
	//public void child
	

}
