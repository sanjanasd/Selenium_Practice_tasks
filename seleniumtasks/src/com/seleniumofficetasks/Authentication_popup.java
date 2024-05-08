package com.seleniumofficetasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String username="foo";
		String password="bar";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(7000);
		
		driver.get("http://"+username+":"+password+"@"+"httpbin.org/basic-auth/foo/bar");
		Thread.sleep(5000);
	}
	

}
