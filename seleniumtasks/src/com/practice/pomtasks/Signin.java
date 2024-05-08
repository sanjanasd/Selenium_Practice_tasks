package com.practice.pomtasks;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	@FindBy(name = "email")
	private WebElement email;
	@FindBy(name = "password")
	private WebElement password;
	@FindBy(xpath = "(//*[contains(text(),'Login')])[4]")
	private WebElement login;
	
	public Signin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getemailpage()
	{
		return email;
	}
	public WebElement getpasswordpage()
	{
		return password;
	}
	public WebElement getloginpage()
	{
		return login;
	}

}
