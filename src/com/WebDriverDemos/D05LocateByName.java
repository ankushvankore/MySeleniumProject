package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05LocateByName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//EMail ID
		WebElement email = driver.findElement(By.name("email"));
		//Please find the control on this page whose name is "email"
		//and store that control in email object
		//In another word object email is referring to Email Id Text box on FB
		email.sendKeys("ankushvankore@gmail.com");
		
		//Password Text Box
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("test@123");
		
		//Login Button
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}

}
