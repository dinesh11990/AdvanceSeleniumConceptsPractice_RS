package com.rs.dinesh.practice.sectioneight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//You need to import testng in order to use Assertion
//import org.testng.Assert

 //In this topic we saw 3 types of assert
//1. assertTrue 2. assertFalse 3. assertEquals
//Assertion is only used for validation purpose

public class G_Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Assert.assertFalse()
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected();
		
		//When you give false statement - The test will fail
		//Assert.assertTrue()
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//Count number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
