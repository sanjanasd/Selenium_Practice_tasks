package com.orangewebsitepomtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(name = "username")
	private WebElement user;
	@FindBy(name = "password")
	private WebElement pass;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement login;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getusername()
	{
		return user;
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
