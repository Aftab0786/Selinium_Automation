package com.Bridgelabz;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Download_PopUps {
	public static WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
	@Test
	public void File_Download_PopUP() {
		
		 HashMap <String,Object> chromePrefs = new HashMap<String,Object>();
		 chromePrefs.put("profile.default_content_settings.popups",0);
		 chromePrefs.put("download.default_directory","C:\\Users\\alam4\\OneDrive\\Documents\\File Download");
		 ChromeOptions options = new ChromeOptions();
		 options.setExperimentalOption("prefs", chromePrefs);	
		 DesiredCapabilities cap =  new DesiredCapabilities();
		 cap.setCapability(ChromeOptions.CAPABILITY,options);
		 driver= new ChromeDriver(cap);
		 driver.get("https://www.selenium.dev/downloads/");
		 driver.findElement(By.linkText("4.3.0")).click();
		 driver.close();
		 }
	 @Test
	 public void close_Parent_Window() {
		 driver.get("https://www.naukri.com/");
		 driver.manage().window().maximize();
		 String parentId = driver.getWindowHandle();
		 System.out.print("parent id:" +parentId);
		 driver.findElement(By.linkText("Register")).click();
		 Set<String> allWindow = driver.getWindowHandles();
		 int count = allWindow.size();
		 System.out.print("Number of window open by the selenium:" +count);
		 for(String windowHandle :  allWindow) {
			 driver.switchTo().window(windowHandle);
			 if(windowHandle.equals(parentId)) {
				 driver.close();
			 }
		 }
	 }
	 @Test
	 public void close_All_Child_Windows() {
		 driver.get("https://www.naukri.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 String parentId = driver.getWindowHandle();
		 System.out.print("parent id:" +parentId);
		 driver.findElement(By.linkText("Register")).click();
		 Set<String> allWindow = driver.getWindowHandles();
		 int count = allWindow.size();
		 System.out.print("Number of window open by the selenium:" +count);
		 for(String windowHandle :  allWindow) {
			 driver.switchTo().window(windowHandle);
			 if(!windowHandle.equals(parentId)) {
				 driver.close();
			 }
		 }
		 
	 }
	 @Test
	 public void childBrowserPopupsextendsBaseClass() {
		 driver.get("https://www.naukri.com/");
		//using getWindowHandles(), get a set of window handle IDs
		Set<String> allWindowHandles = driver.getWindowHandles();
		//using size(), get the count of total number of browser windows
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		for (String windowHandle : allWindowHandles) {
		//switch to each browser window
		driver.switchTo().window(windowHandle);
		String title = driver.getTitle();
		//print the window handle id of each browser window
		System.out.println("Window handle id of page -->"+ title +" --> is : "+windowHandle);
		//close all the browsers one by one
		driver.close();
	 }
}

}
