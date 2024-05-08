package com.seleniumofficetasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class selecttopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;	
		//Select class is used to interact with dropdown elements or select elements on a webpage.
		//Dropdown elements are those HTML elements
		//where you can select one or more options from a list.
		//selectByIndex(int index): Selects an option by its index.
		//selectByValue(String value): Selects an option by its value attribute.
		//selectByVisibleText(String text): Selects an option by its visible text.
		//Deselect an Option (Applicable for multi-select dropdowns):
		//deselectByIndex(int index): Deselects an option by its index.
		//deselectByValue(String value): Deselects an option by its value attribute.
		//deselectByVisibleText(String text): Deselects an option by its visible text.
		//deselectAll(): Deselects all selected options.
		//getFirstSelectedOption(): Gets the first selected option.
		//getAllSelectedOptions(): Gets all selected options.
		//getOptions(): Gets all available options in the dropdown.
				driver=new EdgeDriver();
			//Step#2- Launching URL
		    driver.get("https://demoqa.com/select-menu");
		    //Maximizing window
		    driver.manage().window().maximize();
		    WebElement sele=driver.findElement(By.id("oldSelectMenu"));
		    //Step#3- Selecting the dropdown element by locating its id
		    Select select = new Select(sele);
		    //Step#4- Printing the options of the dropdown
		    //Get list of web elements
		    List<WebElement> lst = select.getOptions();
		    //Looping through the options and printing dropdown options
		    System.out.println("The dropdown options are:");
		    for(WebElement options: lst)
		        System.out.println(options.getText());
		    //Step#5- Selecting the option as 'Purple'-- selectByIndex
		    System.out.println("Select the Option by Index 4");
		    select.selectByIndex(4);
		    System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
		    //Step#6- Selecting the option as 'Magenta'-- selectByVisibleText
		    System.out.println("Select the Option by Text Magenta");
		    select.selectByVisibleText("Magenta");
		    System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
		    //Step#7- Selecting an option by its value
		    System.out.println("Select the Option by value 6");
		    select.selectByValue("6");
		    System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
			
			
			

		Select select1 = new Select(driver.findElement(By.id("cars")));
		System.out.println("The dropdown options are -");
		if(select.isMultiple()){
		    //Selecting option as 'Opel'-- ByIndex
		    System.out.println("Select option Opel by Index");
		    select1.selectByIndex(2);
		    //Selecting the option as 'Saab'-- ByValue
		    System.out.println("Select option saab by Value");
		    select1.selectByValue("saab");
		    // Selecting the option by text
		    System.out.println("Select option Audi by Text");
		    select1.selectByVisibleText("Audi");
			
			List<WebElement> selectedOptions = select.getAllSelectedOptions();
		    for(WebElement selectedOption: selectedOptions)
		        System.out.println(selectedOption.getText());
		    // Deselect the value "Audi" by Index
		    System.out.println("DeSelect option Audi by Index");
		    select1.deselectByIndex(3);
		    //Deselect the value "Opel" by visible text
		    System.out.println("Select option Opel by Text");
		    select1.deselectByVisibleText("Opel");
		    //Validate that both the values are deselected
		    System.out.println("The selected values after deselect in the dropdown options are -");
		    List<WebElement> selectedOptionsAfterDeselect = select.getAllSelectedOptions();
		    for(WebElement selectedOptionAfterDeselect: selectedOptionsAfterDeselect)
		        System.out.println(selectedOptionAfterDeselect.getText());
		    //Step#8- Deselect all values
		    select1.deselectAll();
		
		}

	}
}

