package com.baseclass.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Login {

		public WebDriver driver;
		
		@FindBy(id="username")
		private WebElement name;
		
		@FindBy(id="password")
		private WebElement password;
		
		@FindBy(id="login")
		private WebElement button;
		
		public Pom_Login(WebDriver driver2) {

			this.driver=driver2;
			PageFactory.initElements(driver2, this);
					
		}

		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getName() {
			return name;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getButton() {
			return button;
		}

		
		

	
	}


