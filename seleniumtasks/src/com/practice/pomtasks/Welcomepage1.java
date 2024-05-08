package com.practice.pomtasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage1 {
	@FindBy(xpath = "//header[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	private WebElement sign;
	
	public Welcomepage1 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getsigninlink()
	{
		return sign;
		
	}
// this refers to current class object 	
	
	
	
	
	
	
	

	}


