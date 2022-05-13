package com.baseclass.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	public WebDriver driver;

	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	
	@FindBy(id="continue")
	private WebElement continuebutton;
	
	 public SelectHotel(WebDriver driver4) {
	   this.driver=driver4;
	   PageFactory.initElements(driver4, this);
	 }

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}
	
	
}

