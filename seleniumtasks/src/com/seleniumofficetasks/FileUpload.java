package com.seleniumofficetasks;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://the-internet.herokuapp.com/upload");
//	    WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
//	    Thread.sleep(6000);
//	    fileInput.sendKeys("C:\\Users\\Moolya\\Documents\\BitDelta.docx");
//	    driver.findElement(By.id("file-submit")).click();
//	   // WebElement fileName = driver.findElement(By.id("uploaded-files"));
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(6000);
		WebElement upload = driver.findElement(By.name("upfile"));
		upload.sendKeys("C:\\Users\\Moolya\\Desktop\\capturescreen.PNG");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		
		
		
	    
	}
	

	
}
