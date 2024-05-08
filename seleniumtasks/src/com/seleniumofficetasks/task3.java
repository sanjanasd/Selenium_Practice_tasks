package com.seleniumofficetasks;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 	driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
 	Thread.sleep(2000);
 	//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.flipkart.com");
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(2000);
//		
//		List <String> handles= new ArrayList<>(driver.getWindowHandles());
//		int si= handles.size();
//		System.out.println(si);
//		driver.switchTo().window(handles.get(0));
//		driver.getCurrentUrl();
//		System.out.println("https://www.yahoo.com");
//		Thread.sleep(2000);
////		go to 2nd tab and search mob and print title of the page
//		driver.switchTo().window(handles.get(1));
//	    WebElement searchtextfield= driver.findElement(By.name("q"));
//	    searchtextfield.sendKeys("mobiles");
//	    Thread.sleep(2000);
//	    driver.switchTo().window(handles.get(1));
//	    System.out.println(driver.getTitle());
//	    Thread.sleep(2000);
////	    go to 3rd tab and print title and print url and add details in the text box
//	    driver.switchTo().window(handles.get(2));
//	    System.out.println(driver.getTitle());
//	    Thread.sleep(2000);
//	    driver.getCurrentUrl();
//	    Thread.sleep(2000);
//	    System.out.println("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	    Thread.sleep(2000);
//	    By by;
//		WebElement usernametextfield = driver.findElement(By.name("username"));
//	    usernametextfield.sendKeys("sanjanadayanand");
//	    Thread.sleep(2000);
//	   WebElement passwordtextfield = driver.findElement(By.name("password"));
//	   passwordtextfield.sendKeys("12345678");
//	   Thread.sleep(2000);
//	   driver.quit();
//	   
	   WebElement emailtextfield =driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/div[1]/label"));
	   Thread.sleep(2000);
	   int yaxis = emailtextfield.getLocation().getY();
	   System.out.println(yaxis);
	   
	   
	   
	    
	    
	    
	   
		
		
		
		
	}

}
