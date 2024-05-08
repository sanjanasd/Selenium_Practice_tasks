package com.practice.pomtasks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testscrpit1 {

	
		// TODO Auto-generated method stub
@Test
public void test() {
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationexercise.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Welcomepage1 wp= new Welcomepage1(driver);
		wp.getsigninlink().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Signin lp = new Signin(driver);
		lp.getemailpage().sendKeys("Str@gmail.com");
		lp.getpasswordpage().sendKeys("123456");
		lp.getloginpage().click();
		
		Logout lp1 = new Logout(driver);
		lp1.getlogout().click();
		
		


}


}
