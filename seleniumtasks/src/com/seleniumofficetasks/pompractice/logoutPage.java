package com.seleniumofficetasks.pompractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutPage {
	@FindBy(linkText = "Log out")
	private WebElement logoutbutton;
	
	public logoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getlogoutbutton()
	{
		return logoutbutton;
	}

}
