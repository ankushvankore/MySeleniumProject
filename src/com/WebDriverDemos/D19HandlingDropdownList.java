package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D19HandlingDropdownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//WebElement drpList = driver.findElement(By.id("country"));
		//Select countries = new Select(drpList);
		Select countries = new Select(driver.findElement(By.id("country")));
		
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		List<WebElement>countryList = countries.getOptions();
		System.out.println("Total countries in the list: " + countryList.size());
		
		/*int i = 0;
		for(WebElement c : countryList)
		{
			System.out.println(i + ". " + c.getText());
			i++;
		}*/
		
		//countries.selectByVisibleText("Spain");
		//countries.selectByValue("196");
		countries.selectByIndex(193);
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		//driver.close();
	}

}
