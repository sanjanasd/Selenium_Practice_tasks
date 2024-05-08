package com.shopperstalkpomofficetask;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testscript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Hommepage hp = new Hommepage(driver);
		hp.getloginbutton().click();
		hp.getCreataccount1().click();
		hp.getfirstname().sendKeys("sanjana");
		hp.getlastname().sendKeys("sds");
		hp.getgender().click();
		hp.getphonenumber().sendKeys("9900235445");
		hp.getemailadress().sendKeys("sale@gmail.com");
		hp.getpassword().sendKeys("4E@xamplet");
		hp.getconfirmpassword().sendKeys("4E@xamplet");
		hp.getcheckboxbutton().click();
		hp.getregisterbutton().click();
		Thread.sleep(7000);
		hp.getloginbutton().click();
		Loginpage lp = new Loginpage(driver);
		lp.getemail().sendKeys("sale@gmail.com");
		lp.getpassword().sendKeys("4E@xamplet");
		lp.getlogin().click();
		
		Logout lp1 = new Logout(driver);
		lp1.getlogout().click();
		Thread.sleep(5000);
		lp1.getlogoutcl().click();
	}

}
