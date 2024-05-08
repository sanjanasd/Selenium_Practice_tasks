package com.orangewebsitepomtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")
	private WebElement logout;
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutbutton;
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getlogout()
	{
		return logout;
	}
	public WebElement getlogoutbutton()
	{
		return logoutbutton;
	}
}
