package com.seleniumofficetasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//Implicit Wait directs the Selenium WebDriver to wait for a certain measure of time before throwing an exception.
			//Explicit Wait command, the WebDriver is directed to wait until a
			//certain condition occurs before proceeding with executing the code.	
			//it can only be applied for specified elements.
			//Fluent Wait commands are most useful when interacting with web elements that can take longer durations to load.	
			//pageloadtimeout
			//This command establishes the time WebDriver must wait for a page to completely load before triggering an error.
				WebDriver driver;
			
			
				driver=new EdgeDriver();
			//Step#2- Launching URL
			driver.get("https://demo.guru99.com/insurance/v1/index.php");
			//pageloadtime
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			//Maximizing window
			driver.manage().window().maximize();
			//explicit wait
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='register.php']")));
			driver.findElement(By.xpath("//a[@href='register.php']")).click();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("user_firstname")).sendKeys("example");
			driver.findElement(By.id("user_surname")).sendKeys("example2");
			//fluentwait
			FluentWait<WebDriver> wai=new FluentWait<WebDriver>(driver);
			wai.withTimeout(Duration.ofSeconds(10));
			wai.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("resetform")));
			driver.findElement(By.id("resetform")).click();
			}
				}

