package com.seleniumclassPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
//		step1 :  create FIS object 
				FileInputStream FIS = new FileInputStream("./Testdata/testscriptdata.xls");
//				C:\Users\Moolya\eclipse-workspace\seleniumtasks\Testdata\testscriptdata.xls
//				step2: creatr respective file type object 
				Workbook workbook = WorkbookFactory.create(FIS);
				
//				step3: cal read methods
				String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
				String email = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
				String pass = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
				System.out.println(url);
				System.out.println(email);
				System.out.println(pass);
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
					driver.findElement(By.xpath("//a[text()='Log in']")).click();
					driver.findElement(By.id("Email")).sendKeys(email);
					driver.findElement(By.id("Password")).sendKeys(pass);
				
				
				}

}
