package com.seleniumofficetasks;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.WorkbookDocumentImpl;

public class datadriven1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream FIS = new FileInputStream("./Testdata/testscriptdata.xls");
		
		Workbook workbook = WorkbookFactory.create(FIS);
		
	       String url = workbook.getSheet("sheet1").getRow(2).getCell(0).getStringCellValue();
	       String name = workbook.getSheet("sheet1").getRow(2).getCell(1).getStringCellValue();
	       String password = workbook.getSheet("sheet1").getRow(2).getCell(2).getStringCellValue();
	       System.out.println(url);
	       System.out.println(name);
	       System.out.println(password);
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get(url);
	       Thread.sleep(3000);
	       driver.findElement(By.name("username")).sendKeys(name);
	       Thread.sleep(3000);
	       driver.findElement(By.name("password")).sendKeys(password);
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	       
		
	}

	
}
