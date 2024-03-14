package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskThreeMediBuddyLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.medibuddy.in/");
		//driver.findElement(By.xpath("//div[@class='wzrkPPwarp']//a[@class='wzrkClose']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//form[@name='loginform']//div[@class='coperate']")).click();
		driver.findElement(By.xpath("//form[@name='submitCorpPhoneForm']//a[text()='Learn More']")).click();
		driver.findElement(By.linkText("skip")).click();
		driver.findElement(By.xpath("//form[@name='submitCorpEmailForm']//a[text()='Login using Username & Password']")).click();
		driver.findElement(By.xpath("//form[@name='submitCorpUsernameForm']//input[@id='username']")).sendKeys("john");
		driver.findElement(By.xpath("//form[@name='submitCorpUsernameForm']//button")).click();
		driver.findElement(By.xpath("//form[@name='submitCorpUsernamePasswordForm']//input[@id='password']")).sendKeys("john123");
		//Need to add Show password
		driver.findElement(By.xpath("//form[@name='submitCorpUsernamePasswordForm']//button")).click();
		WebElement errorMessage = driver.findElement(By.xpath("//form[@name='submitCorpUsernamePasswordForm']//div[@ng-if='isPasswordWrong']"));
		System.out.println(errorMessage.getText());
		driver.close();

	}

}
