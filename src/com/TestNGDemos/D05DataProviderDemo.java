package com.TestNGDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05DataProviderDemo {
	WebDriver driver;
	String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;

	@Test(dataProvider = "getLoginDetails")
	public void loginToOHRM(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		actUrl = driver.getCurrentUrl();
		
		//Assert.assertEquals(actUrl, expUrl);
		//Assert.assertTrue(actUrl.equals(expUrl));
		Assert.assertTrue(actUrl.contains("dashboard"));
	}
	@AfterMethod
	public void Logout() {
		if (expUrl.equals(actUrl)) {
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.partialLinkText("Log")).click();
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
		}
	}
	@DataProvider
	public Object[][] getLoginDetails() {
		return new Object[][] {
			new Object[] { "admin", "admin123" },
			new Object[] { "spandana", "spandana123" },
			new Object[] { "chetan", "chetan123" },
			new Object[] { "admin", "admin123" },
		};
	}
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
