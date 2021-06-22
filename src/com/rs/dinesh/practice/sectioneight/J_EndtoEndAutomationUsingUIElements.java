package com.rs.dinesh.practice.sectioneight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class J_EndtoEndAutomationUsingUIElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//1. Select From and To		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		
		//Parent-Child Mechanism
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		
		//2. One Way Trip - Only Departure Date:
		
		//One-way trip , return date is hidden
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		//3. Passengers dropdown
		
		driver.findElement(By.xpath("//div[@id='divpaxOptions']/div[2]/p/select/option[7]")).click();
		
		Thread.sleep(2000);
		
		//4. Select the Checkbox
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		Thread.sleep(2000);
		
		//5. Select the Currency
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        //WebElement staticDropdown = driver.findElement(By.xpath("//div[@id='flightSearchContainer']/div[7]/div/select/option[4]"));
		
		//You can see tagname is "Select" so its static dropdown
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(4);
		
		Thread.sleep(2000);
		
		//6. Select the search button
		
		//driver.findElement(By.id("ctl00$mainContent$btn_FindFlights")).click();
		
		driver.findElement(By.cssSelector("input[value='Search']")).click();
	}

}
