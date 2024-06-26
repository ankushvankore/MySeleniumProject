package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01EchoTrakAssignment {

	public static void main(String[] args) {
		String expMsg = "Invalid Username/Password", actMsg;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement userName = driver.findElement(By.className("form-control"));
		userName.sendKeys("chetan");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("chetan123");
		WebElement loginBtn = driver.findElement(By.className("btn"));
		loginBtn.click();
		
		WebElement error = driver.findElement(By.id("lblMsg"));
		actMsg = error.getText();
		System.out.println("Error Message: " + actMsg);
		
		if(expMsg.equals(actMsg))
			System.out.println("Error message matching. Test Case Pass");
		else
			System.out.println("Error message not matching. Test Case Fail");
		
		driver.close();
	}

}
