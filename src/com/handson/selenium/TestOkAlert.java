package com.handson.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOkAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		driver.manage().window().maximize();
		driver.findElement(By.id("alert")).click();
		driver.switchTo().alert().accept();
		System.out.println("Ok button of alert clicked succesfully");

	}

}
