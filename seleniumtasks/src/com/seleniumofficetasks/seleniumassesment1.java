package com.seleniumofficetasks;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.javatopics.throws1;

public class seleniumassesment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://magento.softwaretestingboard.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://practicesoftwaretesting.com/");
		List<String> handles = new ArrayList<>(driver.getWindowHandles());
		int si=handles.size();
		System.out.println(si);
		driver.switchTo().window(handles.get(0));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("check1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("check3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("radio1")).click();
		Thread.sleep(2000);

		List<String> handles1 = new ArrayList<>(driver.getWindowHandles());
		int si1=handles1.size();
		System.out.println(si1);
		driver.switchTo().window(handles1.get(1));
	   System.out.println(driver.getCurrentUrl());
	   System.out.println(driver.getTitle());
	   WebElement elem=driver.findElement(By.xpath("//div[@class=\"header content\"]/a/img"));
	   System.out.println(elem.getAttribute("src"));
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[@class=\"section-items nav-sections-items\"]/div[2]/nav/ul/li[2]/a/span[1]")).click();	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"narrow-by-list2\"]/dd/ol/li[1]/a")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[1]/a")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//span[@id=\'product-price-1396\']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\'narrow-by-list\']/div[3]/div[1]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//a[@href=\"https://magento.softwaretestingboard.com/women/tops-women.html?cat=23&price=30-40\"]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[1]")).click();
	   Thread.sleep(3000);	  
	   driver.findElement(By.xpath("//div[@class=\"sidebar sidebar-main\"]/div/div[2]/div[3]/div[3]")).click();
	   Thread.sleep(3000);	 
	   driver.findElement(By.xpath("//*[@id=\'narrow-by-list\']/div[3]/div[2]/div/div/a[1]/div")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[@class=\'product-item-info\']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[@class=\'swatch-attribute size\']/div/div[1]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[@class=\'swatch-attribute color\']/div/div[1]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//button[@id=\'product-addtocart-button\']/span")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//button[@id=\'top-cart-btn-checkout\']")).click();
	   Thread.sleep(3000);
	   
	    List<String> handles11 = new ArrayList<>(driver.getWindowHandles());
		int si11=handles11.size();
		System.out.println(si11);
		driver.switchTo().window(handles11.get(2));  
		driver.findElement(By.xpath("//a[@href=\'./profile.php#login\']")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.xpath("//button[@id=\'btn-login\']")).click();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.findElement(By.xpath("//div[@id=\'QuickLinks\']/a[5]")).click();
		driver.findElement(By.xpath("//a[@href=\'/actions/Catalog.action?viewProduct=&productId=AV-CB-01\']")).click();
		driver.findElement(By.xpath("//a[@href=\'/actions/Catalog.action?viewItem=&itemId=EST-18\']")).click();
		WebElement elem1=driver.findElement(By.xpath("//img[@src=\"../images/bird2.gif\"]"));
		System.out.println(elem1.getAttribute("src"));
		driver.findElement(By.xpath("//a[@href=\'/actions/Cart.action?addItemToCart=&workingItemId=EST-18\']")).click();
		driver.findElement(By.xpath("//div[@id=\'BackLink\']/a")).click();
		
		List<String> handles2 = new ArrayList<>(driver.getWindowHandles());
		int si2=handles2.size();
		System.out.println(si2);
		driver.switchTo().window(handles2.get(3));
		driver.findElement(By.xpath("//a[@class=\'nav-link dropdown-toggle\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\'#/category/power-tools\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h5[(text()=\' Sheet Sander \')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id=\'btn-add-to-cart\']")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());		
		
		
	}
	
}
