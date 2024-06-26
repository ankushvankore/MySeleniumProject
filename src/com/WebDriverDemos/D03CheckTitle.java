package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D03CheckTitle {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		//if(title.contains("Selenium"))
		if(title.equals("Downloads | Selenium"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
		
		driver.close();
	}

}
