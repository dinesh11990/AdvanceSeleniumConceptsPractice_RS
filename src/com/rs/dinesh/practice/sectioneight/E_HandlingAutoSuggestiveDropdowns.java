package com.rs.dinesh.practice.sectioneight;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_HandlingAutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		
		Thread.sleep(3000);
		
		//Generic CSS which extract all the options
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option:options) {
			
			if(option.getText().equalsIgnoreCase("India"))
			{
				
				option.click();
				//it will skip all the rest of the iterations
				break;
			}
		}
		
		
		
	}

}
