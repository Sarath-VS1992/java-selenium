package com.allianz.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demotabs {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://db4free.net");
		driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']//ul[1]//li[7]//a")).click();
		ArrayList<String> windows =new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windows.get(1));
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.id("input_username")).sendKeys("admin");
		driver.findElement(By.id("input_password")).sendKeys(("admin123"));
driver.findElement(By.xpath("//input[@type='submit']")).click();
//driver.close();
driver.quit();
	}

}