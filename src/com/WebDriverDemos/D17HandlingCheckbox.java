package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D17HandlingCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement altMail = driver.findElement(By.cssSelector("input[name^=\"chk\"]"));
		
		System.out.println("Before Clicking...");
		System.out.println("Selected: " + altMail.isSelected());
		System.out.println("Visible : " + altMail.isDisplayed());
		System.out.println("Enabled : " + altMail.isEnabled());
		
		//if(altMail.isSelected() == false)
			//altMail.click();
		
		if(!altMail.isSelected())
			altMail.click();
		
		System.out.println("After Clicking...");
		System.out.println("Selected: " + altMail.isSelected());
		System.out.println("Visible : " + altMail.isDisplayed());
		System.out.println("Enabled : " + altMail.isEnabled());
	}

}
