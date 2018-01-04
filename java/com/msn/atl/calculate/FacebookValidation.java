package com.msn.atl.calculate;

import static org.junit.Assert.*;

import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FacebookValidation {

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	}
}
