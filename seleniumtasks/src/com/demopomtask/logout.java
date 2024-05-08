package com.demopomtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	@FindBy(xpath = "/html/body/div[3]/form/input")
	private WebElement logout;
	
	public logout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getlogout()
	{
		return logout;
	}

}
