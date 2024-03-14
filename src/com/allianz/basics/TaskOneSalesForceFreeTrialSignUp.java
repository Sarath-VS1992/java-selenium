package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskOneSalesForceFreeTrialSignUp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver.findElement(By.xpath("//input[contains (@id,'UserFirstName')]")).sendKeys("John");
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		//UsingSelect class to select necessary data from a drop down
		Select jobTitle = new Select(driver.findElement(By.name("UserTitle")));
		jobTitle.selectByValue("IT_Manager_AP");
		
		driver.findElement(By.name("CompanyName")).sendKeys("Allianztest");
		
		Select numberOfEmployees = new Select(driver.findElement(By.name("CompanyEmployees")));
		numberOfEmployees.selectByVisibleText("101 - 200 employees");		
		
		
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']//following-sibling::div[@class='checkbox-ui']")).click();
		Select companyCountry = new Select(driver.findElement(By.name("CompanyCountry")));
		companyCountry.selectByValue("GB");
		
		
		driver.findElement(By.name("start my free trial")).click();
		WebElement errorMessage = driver.findElement(By.xpath("//input[@name='UserPhone']//following-sibling::span"));
		System.out.println(errorMessage.getText());
		driver.close();
		

	}

}
