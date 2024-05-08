package com.seleniumofficetasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.shoppersstack.com/products_page/6");
					Thread.sleep(10000);
					Thread.sleep(3000);
					driver.findElement(By.id("compare")).click();
					
					Set<String> lk=driver.getWindowHandles();
					int hu=lk.size();
					System.out.println(hu);
					List<String> lo=new ArrayList<String>(driver.getWindowHandles());
					
					driver.switchTo().window(lo.get(1));
					System.out.println(driver.getTitle());
					
					driver.switchTo().window(lo.get(2));
					System.out.println(driver.getTitle());
					
					driver.switchTo().window(lo.get(3));
					System.out.println(driver.getTitle());
					
					
					
					
					
					
					
					
				}
			
	}

