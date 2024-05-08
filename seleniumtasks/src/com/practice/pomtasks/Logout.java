package com.practice.pomtasks;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	@FindBy(xpath = "//header[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	private WebElement logout;
	
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public WebElement getlogout() {
		return logout;
	}
	}

