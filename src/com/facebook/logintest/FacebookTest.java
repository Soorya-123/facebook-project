package com.facebook.logintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FacebookTest 
{
	@Test
	public void fbtest()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
	}

}
