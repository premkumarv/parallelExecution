package com.guru.tesBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class test extends TestBase {

		@Test
		public void testLogin() {
			driver.get("http:www.google.co.in");
			//Reporter.log(driver.toString());
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//*[@id='form']/div/div[2]/input")).sendKeys("admin");
			//driver.findElement(By.xpath("//*[@id='form']/div/div[4]/input")).sendKeys("password");
			//driver.findElement(By.id("submitButton")).click();
		}
	}


