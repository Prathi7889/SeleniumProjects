 package com.baseclass.selenium;

import graphql.language.Value;

public class LoginPage extends BaseClass{

	public static void main(String[] args) throws Exception {
		browserLaunch("chrome");
		get("http://adactinhotelapp.com/");
		
		Pom_Login pl = new Pom_Login(driver);
		
		sendKeys(pl.getName(), "Prathibha7");
		sendKeys(pl.getPassword(), "Thanvika");
		click(pl.getButton());
		
		PomAdactinSearch ps = new PomAdactinSearch(driver);
		
		dropDown(ps.getLocation(), "London");
		dropDown(ps.getHotel(), "Hotel Sunshine");
		dropDown(ps.getRoom(), "Standard");
		sendKeys(ps.getNumber(), "1 - One");
		sendKeys(ps.getCheckin(), "11/04/2022");
		sendKeys(ps.getCheckout(), "12/04/2022");
		sendKeys(ps.getAdultroom(), "1 - One");
		sendKeys(ps.getChildroom(), "0 - None");
		click(ps.getSubmit());
		
		SelectHotel sh =new SelectHotel(driver);
		
		click(sh.getRadiobutton());
		click(sh.getContinuebutton());
		
		Book_A_Hotel bah = new Book_A_Hotel(driver);
		
		sendKeys(bah.getFirstname(), "Prathi");
		sendKeys(bah.getLastname(), "N");
		sendKeys(bah.getBillingaddress(), "England");
		sendKeys(bah.getCreditcard(), "1234567891011121");
		sendKeys(bah.getCardtype(), "VISA");
		sendKeys(bah.getExpirymonth(), "August");
		sendKeys(bah.getExpiryyear(), "2023");
		sendKeys(bah.getcvv(), "567");
		click(bah.getBook());
		
		BookingConfirm bc = new BookingConfirm(driver);
		Thread.sleep(2000);
		click(bc.getItinerary());
		
		
		
		
		
		
		
	}

}
