package com.Goibibo;

import java.awt.AWTException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Goibibo.base.Baseclass;
import com.Goibibo.pom.PageObjectManager;


public class TestRunner extends Baseclass{

	public WebDriver driver;
	PageObjectManager pom = new PageObjectManager();
	
	@BeforeSuite
	private void launchBrowser() {
		launchBrowser("chrome");
	}
	
	@BeforeTest
	private void launchurl() throws InterruptedException  {
		launchurl("https://www.goibibo.com/");
		Thread.sleep(50000);
	}
	
	@Parameters(value = "mobileno")
	@Test(priority = -2)
	private void Login(String mobileno) throws InterruptedException {
		inputValue(pom.getLogIn().getMobilenumber(),mobileno);
		Thread.sleep(5000);
		clickOnElement(pom.getLogIn().getIllDoLater());
		Thread.sleep(5000);
	}
	
	@Parameters(value = {"from","to"})
	@Test(priority = -1)
	private void FlightSearch(String from, String to) throws AWTException {
				
		clickOnElement(pom.getFlightSearch().getRoundtrip());
				
				implicitWait(5);
		clickOnElement(pom.getFlightSearch().getFrom());
				implicitWait(2);
		inputValue(pom.getFlightSearch().getText(),from);
		pom.getFlightSearch().getText().sendKeys(Keys.ARROW_DOWN);
				implicitWait(2);
		pom.getFlightSearch().getText().sendKeys(Keys.ENTER);
				implicitWait(5);
								
		inputValue(pom.getFlightSearch().getText(),to);
				
				implicitWait(3);
				
				//pom.getFlightSearch().getText().sendKeys(Keys.ARROW_DOWN);
				//wait(2);
		pom.getFlightSearch().getText().sendKeys(Keys.ENTER);
				implicitWait(5);
				//clickButton(pom.getFlightSearch().getDepature());
		clickOnElement(pom.getFlightSearch().getdate1());
				
		clickOnElement(pom.getFlightSearch().getReturntab());

		clickOnElement(pom.getFlightSearch().getdate2());

		clickOnElement(pom.getFlightSearch().getdone());
				
				implicitWait(5);
				
				
				
		clickOnElement(pom.getFlightSearch().getTravellerclass());
		clickOnElement(pom.getFlightSearch().getAdult());
		clickOnElement(pom.getFlightSearch().getChildren());
		clickOnElement(pom.getFlightSearch().getdone1());

				
				implicitWait(5);
		clickOnElement(pom.getFlightSearch().getsearchfight());

				
	}
	
	@AfterSuite
	private void closeBrowser() {
		exit();
	}
}	
