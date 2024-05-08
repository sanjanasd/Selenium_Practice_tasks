package com.seleniumofficetasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertconfirm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(3000);
		Alert alr = driver.switchTo().alert();
		Thread.sleep(3000);
		alr.accept();
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(3000);
		Alert confi = driver.switchTo().alert();
		Thread.sleep(3000);
		confi.accept();
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(3000);
		Alert prompt = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(confi.getText());
		Thread.sleep(3000);
		prompt.accept();
	}

}
