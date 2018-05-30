package com.selenium.testscripts;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.selenium.sessions.BaseClass;
public class GoogleScript extends BaseClass
{
	 //public WebDriver driver;
	@Test
public void googleSearch()
{
	getDriver().findElement(By.name("q")).sendKeys("sunitha");
}
}
