package com.demopomtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class Register {
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;
	@FindBy(id = "user_title")
	private WebElement title;
	@FindBy(id = "user_firstname")
	private WebElement fn;
	@FindBy(id = "user_surname")
	private WebElement surname;
	@FindBy(id = "user_phone")
	private WebElement phno;
	@FindBy(xpath = "//*[@id=\"licencetype_f\"]")
	private WebElement radiobutton;
	@FindBy(id = "user_address_attributes_street")
	private WebElement adress;
	@FindBy(id = "user_address_attributes_city")
	private WebElement city;
	@FindBy(id = "user_address_attributes_county")
	private WebElement country;
	@FindBy(id = "user_address_attributes_postcode")
	private WebElement code;
	@FindBy(id = "user_user_detail_attributes_email")
	private WebElement email;
	@FindBy(id = "user_user_detail_attributes_password")
	private WebElement pass;
	@FindBy(id = "user_user_detail_attributes_password_confirmation")
	private WebElement confirmpass;
	@FindBy(name = "submit")
	private WebElement createbutton;
	
	
	public Register(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickdrop() {
		register.click();
		Select se=new Select(title);
		se.selectByVisibleText("Miss");
	}
	public WebElement gettitle()
	{
		return title;
	}
	public WebElement getfirstname()
	{
		return fn;
	}
	public WebElement getsurname()
	{
		return surname;
	}
	public WebElement getphonenumber()
	{
		return phno;
	}
	public WebElement getradiobutton()
	{
		return radiobutton;
	}
	public WebElement getaddress()
	{
		return adress;
	}
	public WebElement getcity()
	{
		return city;
	}
	public WebElement getcountry()
	{
		return country;
	}
	public WebElement getcode()
	{
		return code;
	}
	public WebElement getemail()
	{
		return email;
	}
	public WebElement getpassword()
	{
		return pass;
	}
	public WebElement getconfirmpass()
	{
		return confirmpass;
	}
	public WebElement getcreate()
	{
		return createbutton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
