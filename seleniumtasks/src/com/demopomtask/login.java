package com.demopomtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	@FindBy(id = "email")
	private WebElement email;
	@FindBy(id = "password")
	private WebElement pass;
	@FindBy(name = "submit")
	private WebElement login;
	
	@FindBy(xpath="//div[@class='content']/h4")
	private WebElement text;


	public login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getemailaddress()
	{
		return email;
	}
	public WebElement getpassword()
	{
		return pass;
	}
	public WebElement getcreate()
	{
		return login;
	}
	
	public WebElement getemailtext()
	{
		return text;
	}
	
	
	
	}
	
	
