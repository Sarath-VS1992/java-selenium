package com.handson.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithPromtTextbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		driver.manage().window().maximize();
		driver.findElement(By.id("prompt")).click();
		
		driver.switchTo().alert().sendKeys("Sarath");
		Thread.sleep(9000);
		driver.switchTo().alert().accept();
		System.out.println("Send the text and have clicked OK");

	}

}
