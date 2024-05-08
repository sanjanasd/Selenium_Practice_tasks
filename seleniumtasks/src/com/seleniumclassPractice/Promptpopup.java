package com.seleniumclassPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promptpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert promptpopup = driver.switchTo().alert();
		Thread.sleep(7000);
		driver.switchTo().alert().sendKeys("SW Test Academy");    
		driver.switchTo().alert().accept();
		promptpopup.sendKeys("San");
		System.out.println(promptpopup.getText());
		promptpopup.accept();

	}

}
