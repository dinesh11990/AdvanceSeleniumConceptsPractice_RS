package com.rs.dinesh.practice.sectioneight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_DropdownLoopingUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		
		/*//Using While Loop
		int i=1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
			driver.findElement(By.id("btnclosepaxoption")).click();*/
		
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//Using For Loop
			
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
			driver.findElement(By.id("btnclosepaxoption")).click();
			
			//Use assertEquals in order to check whether you have 5 Adults or not
			//Don't need to wait until console output, just put asserion and verify
			//In the loop if you give 4 , the test will fail	
			
			//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
			
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
