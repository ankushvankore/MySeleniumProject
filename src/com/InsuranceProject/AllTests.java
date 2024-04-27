package com.InsuranceProject;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AllTests {
	WebDriver driver;
	EnterVehicleData ed;
	SelectPriceOptions sp;
	
	@Test(dataProvider = "automobileData")
	public void automobileTests(String expPrice, String expClaim, String expDis, String expCover, String type) {
		driver.findElement(By.partialLinkText("Autom")).click();
		
		ed.selectMake("Audi");
		ed.setEnginePerformance("1000");
		ed.setDateOfManif("04/27/2024");
		ed.selectNoOfSeats("2");
		ed.selectFuelType("Petrol");
		ed.setListPrice("1000");
		ed.setLicencePlateNo("MH09GF1246");
		ed.setAnnualMilage("1000");
		ed.nextButton();
		
		
		sp.checkOptions(expPrice, expClaim, expDis, expCover, type);
		
	}
	
	@DataProvider
	public Object[][] automobileData() {
		return new Object[][] {
			new Object[] { "224.00", "No", "No", "No", "Silver" },
			new Object[] { "662.00", "Submit", "2", "Limited", "Gold" },
			new Object[] { "1,299.00", "Submit", "5", "Limited", "Platinum" },
			new Object[] { "2,475.00", "Submit", "10", "Unlimited", "Ultimate" },
		};
	}
	
	@Test
	public void truckTests()
	{
		driver.findElement(By.partialLinkText("Truck")).click();
		
		ed.selectMake("BMW");
		ed.setEnginePerformance("1500");
		ed.setDateOfManif("04/27/2024");
		ed.selectNoOfSeats("2");
		ed.selectFuelType("Gas");
		ed.setPayLoad("1000");
		ed.setTotalWeight("1000");
		ed.setListPrice("1000");
		ed.setLicencePlateNo("MH09GF1246");
		ed.setAnnualMilage("1000");
		ed.nextButton();
	}

	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sampleapp.tricentis.com/101/index.php");
		
		ed = new EnterVehicleData(driver);
		sp = new SelectPriceOptions(driver);
	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}
