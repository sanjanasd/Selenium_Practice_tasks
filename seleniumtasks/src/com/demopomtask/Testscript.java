package com.demopomtask;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testscript {

	@Test
	public void test() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Register re=new Register(driver);
		re.clickdrop();
		re.getfirstname().sendKeys("sanjana");
		re.getsurname().sendKeys("sd");
		re.getphonenumber().sendKeys("7898655678");
		re.getradiobutton().click();
		re.getaddress().sendKeys("jp nagar");
		re.getcity().sendKeys("naglore");
		re.getcountry().sendKeys("india");
		re.getcode().sendKeys("234244");
		re.getemail().sendKeys("san1@gmail");
		re.getpassword().sendKeys("123456");
		re.getconfirmpass().sendKeys("123456");
		re.getcreate().click();
		
		login lp = new login(driver);
		lp.getemailaddress().sendKeys("san1@gmail");
		lp.getpassword().sendKeys("123456");
		lp.getcreate().click();
		String ki=lp.getemailtext().getText();
		System.out.println(ki);
		logout lp1 = new  logout(driver);
		lp1.getlogout().click();
		
	}

}
