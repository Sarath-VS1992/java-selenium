package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskFourNasComRegister {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://nasscom.in/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//div[@class='modal-list']//li[text()='register']")).click();
		driver.findElement(By.id("edit-field-fname-reg-0-value")).sendKeys("admin");
		driver.findElement(By.id("edit-field-lname-0-value")).sendKeys("pass");
		driver.findElement(By.id("edit-mail")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("edit-field-company-name-registration-0-value")).sendKeys("google");
		Select businessFocusDropDown = new Select(driver.findElement(By.id("edit-field-business-focus-reg")));
		businessFocusDropDown.selectByValue("51");
		driver.findElement(By.id("edit-submit--2"));
		System.out.println("Clicked on Register Button");
		driver.close();
		

	}

}
