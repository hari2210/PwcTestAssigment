package com.qa.lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase(){
		
		try {
			
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/apple/eclipse-workspace/com.flipkart.demo/src/main/java/com/qa/config/config.properties");
			prop.load(ip);			
		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		
		String bname = prop.getProperty("browser");
		
		if(bname.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/apple/eclipse-workspace/com.flipkart.demo/src/test/resources/Drivers/chromedriver");
			driver = new ChromeDriver();
		}
		     driver.manage().window().maximize();
		     driver.manage().deleteAllCookies();
		     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     
		     driver.get(prop.getProperty("url"));
		           
	}

}
