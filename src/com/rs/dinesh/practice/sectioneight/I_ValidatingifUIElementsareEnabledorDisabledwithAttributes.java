package com.rs.dinesh.practice.sectioneight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_ValidatingifUIElementsareEnabledorDisabledwithAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("Div1")).getAttribute("style");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		driver.findElement(By.id("Div1")).getAttribute("style");
		
		//We can't validate using "Isenabled"
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("It is Enabled");
			//Assert.assertTrue(true);
		}
		else {
			
			//Assert.assertFalse(false);
		}
		
		
		
		
	}

}
