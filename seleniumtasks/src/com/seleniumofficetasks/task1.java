package com.seleniumofficetasks;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {

	private static String a;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.get("https://practicetestautomation.com/practice/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://demoqa.com/text-box");
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		
//		List<String> handles = new ArrayList<>(driver.getWindowHandles());
//		int sis=handles.size();
//		System.out.println(sis);
//		driver.switchTo().window(handles.get(1));
//		WebElement fullnametextfield= driver.findElement(By.id("userName"));
//	    fullnametextfield.sendKeys("sanjanasd");
//	    Thread.sleep(4000);
//		WebElement emailtextfield= driver.findElement(By.id("userEmail"));
//	    emailtextfield.sendKeys("sanjana@gmail.com");
//	    Thread.sleep(4000);
//		WebElement currentaddresstextfield= driver.findElement(By.id("currentAddress"));
//		currentaddresstextfield.sendKeys("Jp nagar");
//		Thread.sleep(4000);
//		WebElement permanentaddresstextfield= driver.findElement(By.id("permanentAddress"));
//		permanentaddresstextfield.sendKeys("tarikere");
//		Thread.sleep(4000);
//		
//		driver.switchTo().window(handles.get(2));
//		System.out.println(driver.getTitle());
//		Thread.sleep(4000);
//		WebElement userNametextfield= driver.findElement(By.name("username"));
//		userNametextfield.sendKeys("sanjanadayanand");
//		Thread.sleep(4000);
//		WebElement passwordtextfield= driver.findElement(By.name("password"));
//		passwordtextfield.sendKeys("sanjana12345");
//		Thread.sleep(4000);
//		
//		driver.switchTo().window(handles.get(3));
//		driver.getCurrentUrl();
//		System.out.println("https://rahulshettyacademy.com/AutomationPractice/");
//		Thread.sleep(4000);
//		System.out.println(driver.getTitle());
//		Thread.sleep(4000);
//		
//		driver.switchTo().window(handles.get(0));
//		Thread.sleep(4000);
//		driver.manage().window().minimize();
//		Thread.sleep(4000);
//		WebElement searchtextfield= driver.findElement(By.name("q"));
//		searchtextfield.sendKeys("Mobiles");
//		Thread.sleep(4000);
//		driver.switchTo().window(handles.get(1));
//		driver.close();
//		Thread.sleep(4000);
//		driver.switchTo().window(handles.get(2));
//		driver.close();
//		Thread.sleep(4000);
//		driver.switchTo().window(handles.get(3));
//		driver.close();
//		Thread.sleep(4000);
//		driver.switchTo().window(handles.get(0));
//		driver.close();
//		Thread.sleep(4000);
//		
//		WebElement Createnewaccount = driver.findElement(By.xpath("//a[@data-testid=\'open-registration-form-button\']"));
//		 String Creatnewcolor=Createnewaccount.getCssValue("background-color");
//		 System.out.println(Creatnewcolor);
//		//String hexadecimal=Color.fromString(Creatnewcolor).asHex();
//		String hex =org.openqa.selenium.support.Color.fromString(Creatnewcolor).asHex();
//		System.out.println(hex);
	     
	
		
//	     String href;
//		
//		driver.findElement(By.linkText("Test Exceptions")).click();
//		driver.findElement(By.partialLinkText("Test")).click();
//		driver.findElement(By.xpath("//div[@ class='wp-block-columns is-layout-flex wp-container-core-columns-layout-2 wp-block-columns-is-layout-flex']/div/p/a").click();
//		
//		


	
	}
}
