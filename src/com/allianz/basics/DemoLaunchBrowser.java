package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoLaunchBrowser {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String browser ="edge";
		
		if(browser.equalsIgnoreCase("ch"))
		{
			driver=new ChromeDriver();
		}
		else {
			driver=new EdgeDriver();
			
		}
		
		//WebDriver driver1 = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String url=driver.getCurrentUrl();
		System.out.println(url);

	}

}
