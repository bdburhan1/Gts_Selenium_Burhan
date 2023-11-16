package com.ny.selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Luma_loging {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.linkText("Sign In")).click(); 
        driver.findElement(By.partialLinkText("Sign In")).click();
        driver.findElement(By.id("email")).sendKeys("burhandevops@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Burhan@123");
        driver.findElement(By.id("send2")).click();
        //driver.close();
        

	}
	

}
