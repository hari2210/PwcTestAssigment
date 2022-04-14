package com.qa.lib;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends TestBase{
	
	@FindBy(xpath= "//div//input[@class='_3704LK']")
	
	WebElement txtSearchField;
	
	@FindBy(xpath ="//div//button[@class='L0Z3Pu']")
	
	WebElement btnSearch;
	
	
	@FindBy(xpath= "//div[@class='_4rR01T' and contains(text(),'SAMSUNG Galaxy F12')]")
	WebElement linkMobile;
	
	@FindBy(xpath="//div//button[@class='_2KpZ6l _2doB4z']")
	WebElement BtnClose;
	
	@FindBy(xpath="//div//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement BtnaddTocart;
	
	@FindBy(xpath="//div[@class='Ob17DV _3X7Jj1']//span")
	WebElement valTotalAmnt;
	
	@FindBy(xpath="(//div[@class='_30jeq3 _1_WHN1'])[1]")
	WebElement amtMobile;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		
		BtnClose.click();
		return driver.getTitle();
	}
	
public void SearchMobile() {
		
	
	BtnClose.click();
		txtSearchField.sendKeys("mobiles");
		btnSearch.sendKeys(Keys.RETURN);
		
		String amntPhone=amtMobile.getText();
		
		String oldTab = driver.getWindowHandle();
		linkMobile.click();
		
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0));
		
		
			BtnaddTocart.click();
			
	
		String finalCartval= valTotalAmnt.getText();		
		Assert.assertEquals(amntPhone, finalCartval);
		System.out.println("Product value and and cart value is Matched"+ finalCartval);
	
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
