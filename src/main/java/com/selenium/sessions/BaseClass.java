package com.selenium.sessions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
public class BaseClass {
private WebDriver driver;
@BeforeTest
public void setUp()
{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
public WebDriver getDriver()
{
	return this.driver;
}
}
