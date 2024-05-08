package com.orangewebsitepomtask;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testscrpit {

@Test
public void test() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Login lp = new Login(driver);
		lp.getusername().sendKeys("Admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		lp.getpassword().sendKeys("admin123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		lp.getlogin().click();
		
		Logout lo = new Logout(driver);
		Thread.sleep(5000);
		lo.getlogout().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		lo.getlogoutbutton().click();

}	

}
