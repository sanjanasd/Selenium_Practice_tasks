package com.shopperstalkpomofficetask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hommepage {
	@FindBy(id = "loginBtn")
	private WebElement loginbutton;
    @FindBy(xpath = "//span[text()='Create Account']")
    private WebElement createaccount1;
    @FindBy(id = "First Name")
    private WebElement firstname;
    @FindBy(id = "Last Name")
    private WebElement lastname;
    @FindBy(id = "Female")
    private WebElement female;
    @FindBy(id = "Phone Number")
    private WebElement phno;
    @FindBy(id = "Email Address")
    private WebElement email;
    @FindBy(id = "Password")
    private WebElement Pass;
    @FindBy(id = "Confirm Password")
    private WebElement confipass;
    @FindBy(id = "Terms and Conditions")
    private WebElement checkbox;
    @FindBy(xpath ="//*[contains(text(),'Register')]")
    private WebElement register;
    
    public Hommepage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);	
    }
    public WebElement getloginbutton()
    {
    	return loginbutton;
    }
    public WebElement getCreataccount1()
    {
    	return createaccount1;
    }
    public WebElement getfirstname()
    {
    	return firstname;
    }
    public WebElement getlastname()
    {
    	return lastname;
    }
    public WebElement getgender()
    {
    	return female;
    }
    public WebElement getphonenumber()
    {
    	return phno;
    }
    public WebElement getemailadress()
    {
    	return email;
    }
    public WebElement getpassword()
    {
    	return Pass;
    }
    public WebElement getconfirmpassword()
    {
    	return confipass;
    }
    public WebElement getcheckboxbutton()
    {
    	return checkbox;
    }
    public WebElement getregisterbutton()
    {
    	return register;
    }
    
    
    
    

}
