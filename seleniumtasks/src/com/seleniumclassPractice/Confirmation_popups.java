package com.seleniumclassPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		Alert confPopup = driver.switchTo().alert();
		System.out.println(confPopup.getText());
		Thread.sleep(3000);
		confPopup.accept();
		Thread.sleep(3000);
//		confPopup.dismiss();
		confPopup.accept();

	}

}
