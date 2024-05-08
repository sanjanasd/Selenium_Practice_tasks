package com.seleniumofficetasks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registenow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		driver.findElement(By.name("name")).sendKeys("Sandeep");
		driver.findElement(By.xpath("//div[@class=\"signup-form\"]/form/input[3]")).sendKeys("san123456@gmail.com");
		driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("password")).sendKeys("sandeep12345");
		WebElement sele=driver.findElement(By.id("days"));
		Select select = new Select(sele);
	    List<WebElement> lst = select.getOptions();
	    System.out.println("The dropdown options are:");
	    for(WebElement options: lst)
	    System.out.println(options.getText());
	    System.out.println("Select the Option by Index 4");
	    select.selectByIndex(4);
	    WebElement sele1=driver.findElement(By.id("months"));
	    Select select1 = new Select(sele1);
	    List<WebElement> lst1 = select1.getOptions();
	    System.out.println("The dropdown options are:");
	    for(WebElement options1: lst1)
	    System.out.println(options1.getText());
	    System.out.println("Select the Option by Index 4");
	    select1.selectByIndex(4);
	    WebElement sele11=driver.findElement(By.id("years"));
	    Select select11 = new Select(sele11);
	    List<WebElement> lst11 = select11.getOptions();
	    System.out.println("The dropdown options are:");
	    for(WebElement options1: lst11)
	    System.out.println(options1.getText());
	    System.out.println("Select the Option by Index 4");
	    select11.selectByIndex(4);
	    driver.findElement(By.id("newsletter")).click();
	    driver.findElement(By.id("optin")).click();
	    driver.findElement(By.id("first_name")).sendKeys("San");
	    driver.findElement(By.id("last_name")).sendKeys("San122");
	    driver.findElement(By.id("company")).sendKeys("MMMM");
	    driver.findElement(By.id("address1")).sendKeys("jp nagar");
	    driver.findElement(By.id("address2")).sendKeys("jp nagar 2nd stage");
	    WebElement sele111=driver.findElement(By.id("country"));
		Select select111 = new Select(sele111);
	    List<WebElement> lst111 = select111.getOptions();
	    System.out.println("The dropdown options are:");
	    for(WebElement options: lst111)
	    System.out.println(options.getText());
	    System.out.println("Select the Option by Index 2");
	    select111.selectByIndex(2);
	    driver.findElement(By.id("state")).sendKeys("karnataka");
	    driver.findElement(By.id("city")).sendKeys("Banglore");
	    driver.findElement(By.id("zipcode")).sendKeys("567008");
	    driver.findElement(By.id("mobile_number")).sendKeys("9999999999");
	    driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();
	    driver.findElement(By.xpath("//a[@data-qa=\"continue-button\"]")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
	    driver.findElement(By.xpath("//a[@data-qa=\"continue-button\"]")).click();



	    
	    
		
	}

}
