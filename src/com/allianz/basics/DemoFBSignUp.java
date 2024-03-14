package com.allianz.basics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoFBSignUp {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.facebook.com/");
		 
		 //driver.findElement(By.linkText("Sign up for Facebook")).click();
		 driver.findElement(By.linkText("Create new account")).click();
		 
		 driver.findElement(By.name("firstname")).sendKeys("Sarath");
		 driver.findElement(By.name("lastname")).sendKeys("master");
		 driver.findElement(By.id("password_step_input")).sendKeys("test123");
		 Select daySelect = new Select(driver.findElement(By.id("day")));
		 daySelect.selectByValue("14");
		 
		 Select monthSelect = new Select(driver.findElement(By.id("month")));
		 monthSelect.selectByIndex(3);
		 Select yearSelect = new Select(driver.findElement(By.id("year")));
		 yearSelect.selectByVisibleText("1970");
		 
		 
		 driver.findElement(By.xpath("//input[@value='-1']")).click();

	}

}