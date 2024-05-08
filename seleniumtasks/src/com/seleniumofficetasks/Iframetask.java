package com.seleniumofficetasks;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframetask {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	WebElement scroll = driver.findElement(By.xpath("//div[@class='block large-row-spacer'][5]/fieldset/iframe"));
		Actions act = new Actions(driver);
		act.scrollToElement(scroll).build().perform();
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id=\"courses-iframe\"]"));
		driver.switchTo().frame(iframe);
//		WebElement text=driver.findElement(By.xpath("//ul[@class='clearfix']/li"));
//		System.out.println(text.getText());
//		WebElement text=driver.findElement(By.xpath("//ul[@class='navigation clearfix']/li[3]/a"));
//		System.out.println(text.getText());
//		WebElement text=driver.findElement(By.xpath("//ul[@class='navigation clearfix']/li[3]/a"));
//		text.click();
		Actions acti = new Actions(driver);
		Thread.sleep(7000);
		WebElement et=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		acti.moveToElement(et).build().perform();
	    driver.findElement(By.xpath("//div[@class='nav-outer clearfix']//nav[@class='main-menu']//div[@class='navbar-collapse collapse clearfix']//ul[@class='navigation clearfix']//li[@class='dropdown']//ul[@class='dropdown-menu']//li//a[@href='about-my-mission'][normalize-space()='About us']")).click();
	
	}
		
	

}
