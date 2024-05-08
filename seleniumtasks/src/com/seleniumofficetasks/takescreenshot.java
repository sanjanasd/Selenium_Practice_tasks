package com.seleniumofficetasks;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takescreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
//				WebDriver driver=new ChromeDriver();
//				driver.get("https://www.demo.guru99.com/");
//				driver.manage().window().maximize();
//				TakesScreenshot scrshot = ((TakesScreenshot)driver);
//		        File sourceFile = scrshot.getScreenshotAs(OutputType.FILE);
//		        File destFile = new File("C:\\Users\\Moolya\\Desktop\\example\\demo.png");
//		        //FileUtils.copyFile(sourceFile,destFile);
//		        Files.copy(sourceFile, destFile);
//		        System.out.println("Screenshot taken");
//			}
		//The TakesScreenshot interface is provided by Selenium WebDriver specifically for capturing screenshots.
		//casts the WebDriver instance driver to TakesScreenshot
		//casting is the process of converting an object from one data type to another. Since driver is of type WebDriver,
		//and TakesScreenshot is an interface that extends WebDriver,
		//we can cast driver to TakesScreenshot to treat it as an instance of TakesScreenshot.	
		//it captures a screenshot of the current state of the browser window and stores it in a File object named sourceFile.
		//The getScreenshotAs method is used to capture the screenshot,	
		//OutputType.FILE it's an enumeration constant
		//When you use OutputType.FILE with getScreenshotAs,
		//it instructs Selenium WebDriver to return the screenshot as a File object.
		//creates a File object named destFile, representing the destination file where the screenshot will be saved.
		//the captured screenshot (sourceFile) to the destination file (destFile) using the copyFile method from the FileUtils class.
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://flipkart.com");
			driver.manage().window().maximize();
			TakesScreenshot ts = ((TakesScreenshot)driver);
			File fn = ts.getScreenshotAs(OutputType.FILE);
			File f = new File("C:\\Users\\Moolya\\Desktop\\sc\\san.png");
			Files.copy(fn, f);
			 
			
	
	}	

	}



