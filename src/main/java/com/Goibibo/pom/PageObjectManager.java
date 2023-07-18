package com.Goibibo.pom;

public class PageObjectManager {
	
	public LogIn login;
	
	public FlightSearch flightsearch;
	
	public LogIn getLogIn() {
		
		if(login == null) {
			login = new LogIn();	
		}          
        return login;
	
	}
	
	public FlightSearch getFlightSearch() {
		if(flightsearch == null)
		{
			flightsearch = new FlightSearch();
		}
        return flightsearch;
	
	}

}
