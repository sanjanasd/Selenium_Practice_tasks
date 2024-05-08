package com.seleniumofficetasks;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.bidi.Input;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.yahoo.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
//		driver.switchTo().newWindow(WindowType.TAB);

		List<String> handles = new ArrayList<>(driver.getWindowHandles());
		int si=handles.size();
		System.out.println(si);
		driver.switchTo().window(handles.get(2));
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println("https://www.facebook.com");
		WebElement emailtextfield= driver.findElement(By.id("email"));
	    emailtextfield.sendKeys("sanjanasd@gmail.com");
	    WebElement passwordtextfield= driver.findElement(By.id("pass"));
	    passwordtextfield.sendKeys("sanjanasd@gmail.com");
	    Thread.sleep(2000);
		driver.switchTo().window(handles.get(1));
		Thread.sleep(2000);
		WebElement searchtextfield= driver.findElement(By.id("ybar-sbq"));
		searchtextfield.sendKeys("Mobiles");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.switchTo().window(handles.get(0));
		driver.getCurrentUrl();
		System.out.println("https://www.facebook.com");
		Thread.sleep(2000);
		driver.quit();
		WebElement searchtextfield1=
				driver.findElement(By.cssSelector("input[type='submit']"));
		searchtextfield1.click();
		//xpath:-//input[@type='submit']
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
