package com.baseclass.selenium;

public class Facebook extends BaseClass{

	public static void main(String[] args) {
		browserLaunch("chrome");
		get("https://www.facebook.com/");
	}

}
