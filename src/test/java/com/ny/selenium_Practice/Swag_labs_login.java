package com.ny.selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swag_labs_login {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("burhandevops@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Burhan@123");
		driver.findElement(By.id("login-button")).click();
		//driver.quit();
		

	}

}
