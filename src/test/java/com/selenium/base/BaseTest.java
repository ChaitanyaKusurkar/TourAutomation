package com.selenium.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	 public static WebDriver driver;
	 public static WebDriverWait webDriverWait;
	
	
	// Before Test Annotation of TestNG
	@Parameters({"browser","url","wait"})
	@BeforeTest
	public void setup(String browser,String url,int wait) throws Exception{
		browser(browser);
		driver.get(url);
		driver.manage().window().maximize();
		wait(wait);
	}
	
	
	//initialize driver 
	public void browser(String browser){
		if (browser.equalsIgnoreCase("internetexplorer"))
		{
			driver=new InternetExplorerDriver();
		}
		
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println(driver + "driver ..");
			
		}
	}
	
	public void wait(int wait){
		try{
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public WebDriver getDriver(){
		return driver;
	}
	
	// After Test Annotation of TestNG
	@AfterTest
	public void teardown(){
		getDriver().close();
		getDriver().quit();
	}
}
