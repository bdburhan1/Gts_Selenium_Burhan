package com.ny.selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practce_page {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
		driver.findElement(By.id("firstname")).sendKeys("md burhan");
		driver.findElement(By.id("surname")).sendKeys("burhanuddin");
		driver.findElement(By.id("age")).sendKeys("26");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.close();
		
		
		
	}

}
