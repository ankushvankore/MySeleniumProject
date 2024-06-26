package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		WebElement range = driver.findElement(By.xpath("//*[@id=\"a\"]"));
		Actions act = new Actions(driver);
		
		//act.moveToElement(range).clickAndHold(range).moveByOffset(range.getLocation().x+1, range.getLocation().y).release().perform();
		//act.dragAndDropBy(range, range.getLocation().x+5, range.getLocation().y).build().perform();
		System.out.println(range.getAttribute("value"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', '80')",range);
		System.out.println(range.getAttribute("value"));
		
		for(int i = 1; i <= 10; i++)
			range.sendKeys(Keys.RIGHT);
		
		System.out.println(range.getLocation().x);
		
	}

}
