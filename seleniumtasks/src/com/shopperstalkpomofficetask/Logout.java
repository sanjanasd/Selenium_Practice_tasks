package com.shopperstalkpomofficetask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	@FindBy(xpath = "//div[@id=\"root\"]/section[1]/article/div[3]/div[1]/button/span[1]/span")
	private WebElement logout;
	@FindBy(xpath = "//*[@id=\"account-menu\"]/div[3]/ul/li[7]")
	private WebElement logoutclick;

	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getlogout()
	{
		return logout;
	}
	public WebElement getlogoutcl()
	{
		return logoutclick;
	}

}
