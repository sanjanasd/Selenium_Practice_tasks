package com.shopperstalkpomofficetask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.seleniumofficetasks.pompractice.loginPage;

public class Loginpage {
	
	@FindBy(id = "Email")
	private WebElement email;
	@FindBy(id = "Password")
	private WebElement pass;
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;
	
    public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getemail()
	{
	return email;
	}
	public WebElement getpassword()
	{
		return pass;
	}
	public WebElement getlogin()
	{
		return login;
	}

}
