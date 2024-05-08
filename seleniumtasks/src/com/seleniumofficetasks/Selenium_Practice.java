package com.seleniumofficetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Practice {
	 public static void main(String[] args) {
    	 WebDriver driver = new ChromeDriver();
    	 driver.get("https://practice.automationtesting.in/my-account/");
    	 driver.manage().window().maximize();
//    	 WebElement forgotpassword=driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/initiate/?privacy')]"));
//    	 System.out.println("forgot password text:"+forgotpassword.getText());
//    	 WebElement checkbox=driver.findElement(By.name("rememberme"));
//    	 if(checkbox.isSelected()) {
//    		 System.out.println("the checkbox is selected");
//    	 }
//    	 else {
//    		 checkbox.click();
//    	 }
    	 
	 
	 }
}
