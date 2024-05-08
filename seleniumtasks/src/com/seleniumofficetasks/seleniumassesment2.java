package com.seleniumofficetasks;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class seleniumassesment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[@class=\'cart-header-navlink\'][2]")).click();
		Thread.sleep(3000);
		List<String> handles = new ArrayList<>(driver.getWindowHandles());
		int si=handles.size();
		System.out.println(si);
		driver.switchTo().window(handles.get(1));
		driver.findElement(By.xpath("//*[@id=\"hlnkholidaypacks\"]/span[2]")).click();
		driver.findElement(By.xpath("//div[@class=\'middle-cont color-f0efef hide-xs hide-sm\']/div[1]/div/div[2]/a[1]/span[2]")).click();
		List<String> handles1 = new ArrayList<>(driver.getWindowHandles());
		int si1=handles1.size();
		System.out.println(si1);
		driver.switchTo().window(handles1.get(2));
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//table[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td[2]/input")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		driver.switchTo().window(handles.get(0));
		driver.findElement(By.xpath("//*[contains(text(),'Top Deals')]")).click();
		List<String> handles11 = new ArrayList<>(driver.getWindowHandles());
		int si11=handles11.size();
		System.out.println(si11);
		driver.switchTo().window(handles11.get(3));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='row']/div[2]/ul/li[4]/a")).click();
		driver.switchTo().window(handles11.get(0));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[3]/button")).click();
		

	}

}
