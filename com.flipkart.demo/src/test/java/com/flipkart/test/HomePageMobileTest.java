package com.flipkart.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.lib.HomePage;
import com.qa.lib.TestBase;

public class HomePageMobileTest extends TestBase{
	
	HomePage homePage;
	
	public HomePageMobileTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 homePage =new HomePage();
				
	}
	
	
	@Test
public  void SearchMobile()   {
		
		homePage.SearchMobile();
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
}
	
	

