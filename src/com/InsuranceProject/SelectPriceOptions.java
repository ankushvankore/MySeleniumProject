package com.InsuranceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectPriceOptions {

	WebDriver driver;

	public SelectPriceOptions(WebDriver driver) {
		this.driver = driver;
	}

	public void checkOptions(String expPrice, String expClaim, String expDis, String expCover, String type) {
		String actPrice, actClaim, actDis, actCover;

		switch (type) {
		case "Silver":
			actPrice = driver.findElement(By.xpath("//span[@id='selectsilver_price']")).getText();

			if (expPrice.equals(actPrice))
				System.out.println("Price Matching");
			else
				System.out.println("Price Not Matching");
			
			driver.findElement(By.id("selectsilver")).click();
			
			break;
			
		case "Gold":
			actPrice = driver.findElement(By.xpath("//span[@id='selectgold_price']")).getText();

			if (expPrice.equals(actPrice))
				System.out.println("Price Matching");
			else
				System.out.println("Price Not Matching");
			
			driver.findElement(By.id("selectsilver")).click();
			
			break;
		}

	}

}
