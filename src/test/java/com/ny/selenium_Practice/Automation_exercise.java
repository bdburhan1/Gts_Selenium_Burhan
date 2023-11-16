package com.ny.selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_exercise {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Signup / Login")).click();
		driver.findElement(By.name("name")).sendKeys("Md burhan uddin");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("burhandevops@gmail.com");
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		//driver.close();
	}

}
