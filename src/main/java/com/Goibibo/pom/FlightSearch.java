package com.Goibibo.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Goibibo.base.Baseclass;

public class FlightSearch extends Baseclass {
	
public FlightSearch() {
		
		
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath = "//span[text()='Round-trip']")
private WebElement Roundtrip;


@FindBy(xpath = "(//p[text()='Enter city or airport'])[1]")
private WebElement from;

@FindBy(css = "[type='text']")
private WebElement Text;


@FindBy(xpath = "(//p[text()='Enter city or airport'])[2]")
private WebElement To;


public WebElement getText() {
	return Text;
}


public WebElement getDate1() {
	return date1;
}


public WebElement getDate2() {
	return date2;
}


public WebElement getReturn1() {
	return return1;
}


public WebElement getDone1() {
	return done1;
}


public WebElement getSearchfight() {
	return searchfight;
}

@FindBy(xpath = "//p[@class='sc-jlwm9r-1 dRQhOp']")
private WebElement QR;

@FindBy (xpath = "//p[text()='10'][1]")

private WebElement date1;

@FindBy (xpath = "//p[text()='20'][1]")

private WebElement date2;

@FindBy (xpath = "//span[text()='Done']")

private WebElement done;


@FindBy(xpath = "(//span[@class='sc-12foipm-21 lerOcM fswDownArrow'])[1]")
private WebElement depature;



@FindBy(xpath = "(//p[@class='fswFld__title'])[2]")
private WebElement return1;

@FindBy(xpath = "//div[@class=\"sc-12foipm-68 kUIrKQ\"]")
private WebElement travellerclass;

@FindBy(xpath = "(//span[@class='sc-12foipm-63 ePVCFi'])[2]")
private WebElement adult;

@FindBy(xpath = "(//span[@class='sc-12foipm-63 ePVCFi'])[4]")
private WebElement kid;

@FindBy(xpath = "//a[text()='Done']")
private WebElement done1;

@FindBy(xpath = "//span[text()='SEARCH FLIGHTS']")
private WebElement searchfight;


public WebElement getdone() {
	return done;
}


public WebElement getsearchfight() {
	return searchfight;
}


public WebElement getdone1() {
	return done1;
}

public WebElement getQR() {
	return QR;
}


public WebElement getChildren() {
	return kid;
}


public WebElement getRoundtrip() {
	return Roundtrip;
}



public WebElement getFrom() {
	return from;
}



public WebElement getTo() {
	return To;
}



public WebElement getDepature() {
	return depature;
}



public WebElement getReturntab() {
	return return1;
}


public WebElement getTravellerclass() {
	return travellerclass;
}


public WebElement getAdult() {
	return adult;
}


public WebElement getKid() {
	return kid;
}



public WebElement getDone() {
	return done;
}



public WebElement getdate1() {
	return date1;
}


public WebElement getdate2() {
	return date2;
}


}
