package com.InsuranceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleData {
	WebDriver driver;

	public EnterVehicleData(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectMake(String make)
	{
		new Select(driver.findElement(By.id("make"))).selectByVisibleText(make);
	}
	public void setEnginePerformance(String ep)
	{
		driver.findElement(By.id("engineperformance")).sendKeys(ep);
	}
	public void setDateOfManif(String dt)
	{
		driver.findElement(By.id("dateofmanufacture")).sendKeys(dt);
	}
	public void selectNoOfSeats(String seats)
	{
		new Select(driver.findElement(By.id("numberofseats"))).selectByVisibleText(seats);
	}
	public void selectFuelType(String type)
	{
		new Select(driver.findElement(By.id("fuel"))).selectByVisibleText(type);
	}
	public void setListPrice(String price)
	{
		driver.findElement(By.id("listprice")).sendKeys(price);
	}
	public void setLicencePlateNo(String no)
	{
		driver.findElement(By.id("licenseplatenumber")).sendKeys(no);
	}
	public void setAnnualMilage(String milage)
	{
		driver.findElement(By.id("annualmileage")).sendKeys(milage);
	}
	public void nextButton()
	{
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}
	public void setPayLoad(String load)
	{
		driver.findElement(By.id("payload")).sendKeys(load);
	}
	public void setTotalWeight(String weight)
	{
		driver.findElement(By.id("totalweight")).sendKeys(weight);
	}

}
