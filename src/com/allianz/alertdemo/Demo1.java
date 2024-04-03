package com.allianz.alertdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://netbanking.hdfcbank.com/IpinResetUsingOTP.htm");
		driver.findElement(By.xpath("//img[@alt ='Go']")).click();
		
		//To give wait for alert we can use Explicit wait 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		
		//Switching to Alert 
		String actualAletrText = driver.switchTo().alert().getText();
		
		System.out.println(actualAletrText);
		
		//To Click OK in Alert pop Up
		driver.switchTo().alert().accept();

	}

}
