package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFBLogin {

	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 WebElement findEmail = driver.findElement(By.xpath("//input[@id='email']"));
		 findEmail.sendKeys("test@gmail.com");
		 WebElement findPassword = driver.findElement(By.id("pass"));
		 findPassword.sendKeys("test@007");
		 WebElement loginButton = driver.findElement(By.name("login"));				 
		 loginButton.click();
		 

	}

}
