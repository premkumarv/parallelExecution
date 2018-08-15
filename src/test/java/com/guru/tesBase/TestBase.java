package com.guru.tesBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

	
	
	
	
	
public class TestBase {

	public WebDriver driver;


	@BeforeTest
	// Parameter will get browser from testng.xml on which browser test to run
	@Parameters("myBrowser")
	public void getBrowser(String myBrowser) {
		if (System.getProperty("os.name").contains("Window")) {
			if (myBrowser.equalsIgnoreCase("firefox")) {
				// https://github.com/mozilla/geckodriver/releases
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.gecko.driver","C:\\Users\\PREAM\\workspace\\parallel\\src\\test\\resources\\runner\\geckodriver.exe");
				driver = new FirefoxDriver();
		
			} else if (myBrowser.equalsIgnoreCase("chrome")) {
				// https://chromedriver.storage.googleapis.com/index.html
				System.setProperty("webdriver.chrome.driver","C:\\Users\\PREAM\\workspace\\parallel\\src\\test\\resources\\runner\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}
		
}
	}}