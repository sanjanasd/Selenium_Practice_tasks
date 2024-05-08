package com.seleniumofficetasks.pompractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomePage {
	@FindBy(linkText = "Log in")
	private WebElement san;
	@FindBy(linkText = "Register")
	private WebElement deep;
	
	public welcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getloginlink()
	{
		return san;
	}
	public WebElement getregisterlink()
	{ 
		return deep;
	}
	 


	}


