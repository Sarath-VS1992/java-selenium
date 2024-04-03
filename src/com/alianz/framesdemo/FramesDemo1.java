package com.alianz.framesdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("jack123");
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//After doing necessary action in Frame we have to switch to Main HTML
		driver.switchTo().defaultContent();

	}

}
