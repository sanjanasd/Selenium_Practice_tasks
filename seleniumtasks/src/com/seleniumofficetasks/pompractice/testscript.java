package com.seleniumofficetasks.pompractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testscript {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		welcomePage wp=new welcomePage(driver);
		wp.getloginlink().click();
		loginPage lp=new loginPage(driver);
		lp.getEmail().sendKeys("san@gmail.com");
		lp.getPassword().sendKeys("");
		lp.getLogin().click();
		
		logoutPage lo=new logoutPage(driver);
		lo.getlogoutbutton().click();
		
	}

}
