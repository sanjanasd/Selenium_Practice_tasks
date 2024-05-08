package com.seleniumofficetasks;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.javatopics.list;

public class Handlesalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		List<String> handles = new ArrayList<>(driver.getWindowHandles());
		int si=handles.size();
		System.out.println(si);
		driver.switchTo().window(handles.get(0));
		driver.findElement(By.xpath("//div[@class=\" nav nav-tabs\"]/div[2]/div[1]/button")).click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.dismiss();
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		Thread.sleep(3000);
		alert3.sendKeys("sanjanaa");
		alert3.accept();
		
		List<String> handles1 = new ArrayList<>(driver.getWindowHandles());
		int si1=handles1.size();
		System.out.println(si1);
		driver.switchTo().window(handles1.get(1));
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		Alert alr = driver.switchTo().alert();
		Thread.sleep(3000);
		alr.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		Alert alr1 = driver.switchTo().alert();
		Thread.sleep(3000);
		alr1.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alr2 = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alr2.getText());
		Thread.sleep(3000);
		alr2.sendKeys("Sanjana");
		alr2.accept();
		
		Thread.sleep(6000);
		List<String> handles11 = new ArrayList<>(driver.getWindowHandles());
		int si11=handles11.size();
		System.out.println(si11);
		driver.switchTo().window(handles1.get(2));
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(3000);
		Alert alr11 = driver.switchTo().alert();
		Thread.sleep(3000);
		alr11.accept();
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
		
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		int si12 = 0;
//		driver.switchTo().window(handles1.get(si12));
//		List<String>handles2 = new ArrayList<String>(driver.getWindowHandles());
//		int si22 = handles2.size();
//		System.out.println(si22);
//		driver.findElement(By.xpath("//button[text()='Alert']")).click();
//		Thread.sleep(3000);
//		Alert al = driver.switchTo().alert();
//		Thread.sleep(3000);
//		al.accept();
//		driver.findElement(By.xpath("//button[@onclick=\"myDesk()\"]")).click();
//		Thread.sleep(3000);
		Alert al2 = driver.switchTo().alert();
		Thread.sleep(3000);
		al2.accept();
		driver.findElement(By.xpath("//button[@onclick=\"myPromp()\"]")).click();
		Thread.sleep(3000);
		Alert al3 = driver.switchTo().alert();
		Thread.sleep(3000);
		al3.sendKeys("sanjana");
		System.out.println(al3.getText());
		Thread.sleep(7000);
		al3.accept();
		
		
		


		

	}

}
