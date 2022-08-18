package com.Bridgelabz;

import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PopUps {
public static WebDriver driver;
@BeforeTest
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam4\\Downloads\\chromedriver_win32\\chromedriver.exe");
 driver = new ChromeDriver();
}	
	 @Test
	 public void simpleAlertPopUp() throws InterruptedException {
		 driver.get("https://demoqa.com/alerts");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.id("alertButton")).click();
		 Thread.sleep(2000);
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 
		 
	 }
	 @Test
	 public void conformationPopUp() throws InterruptedException {
		 driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.name("confirmalertbox")).click();
		 Thread.sleep(2000);
		 Alert conformationAlert = driver.switchTo().alert();
		 String alertText = conformationAlert.getText();
		 System.out.print("The alert test is: " +alertText);
		 conformationAlert.accept();
		 
		 
	 }
	 @Test
	 public void promptPopUP() throws InterruptedException {
		 driver.get("https://demoqa.com/alerts");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.id("promtButton")).click();
		 Thread.sleep(2000);
		 Alert promptAlert = driver.switchTo().alert();
		 Thread.sleep(2000);
		 promptAlert.sendKeys("Aftab");
		 Thread.sleep(2000);
		 promptAlert.accept();
		 
	 }
	 @Test
	 public void file_Upload() throws InterruptedException {
		 driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("file:///C:/Users/alam4/OneDrive/Desktop/samsad%20from.pdf");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@ng.click=\"item.upload()\"]")).click();
		 Thread.sleep(2000);
		 
	 }
	 @Test
	 public void autoIt_uploadFile() throws InterruptedException, IOException {
		 driver.get("https://www.freepdfconvert.com/pdf-to-word");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		
		 driver.findElement(By.linkText("Choose PDF file")).click();
		 Thread.sleep(2000);
		 Runtime.getRuntime().exec("C:/Users/alam4/OneDrive/Desktop/samsad%20from.exe");
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
