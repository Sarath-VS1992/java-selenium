package com.handson.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTestConfirm {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		driver.manage().window().maximize();
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().accept();
		System.out.println("Ok Clicked");
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("cancel clicked");
		driver.findElement(By.id("confirm")).click();
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);		
		

	}

}
