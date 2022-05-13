package com.baseclass.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm {
	public WebDriver driver;
		

		
		
		@FindBy(id="my_itinerary")
		private WebElement itinerary;
		
		public BookingConfirm(WebDriver driver6) {
			this.driver=driver6;
			PageFactory.initElements(driver6, this);
		}

		public WebElement getItinerary() {
			return itinerary;
		}
		
		
		
		
	

}
