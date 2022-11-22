package com.auto.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	//Static variable are outside of methods and inside the class
		public static WebDriver driver;
		public static Properties property;
		public static Logger logger;
		
		public Base() {
			logger = Logger.getLogger("Automation"); //this suite name is from testng.xml
			PropertyConfigurator.configure("src/test/resources/Log4j.properties");		
		} 
		
		
		//for properties file
		public static void initializeProperties()      {	
			
			try {
				property = new Properties();
				InputStream ip = new FileInputStream("src/test/resources/config.properties");
				property.load(ip);
			} catch (IOException error) {	
				error.printStackTrace();
				System.out.println("Can't find the file");		
			} catch (Exception error) {
				error.getMessage();
			} finally {
				System.out.println("This code will always run");
			}
		}
		
		public static void setUp(){
			if(property.getProperty("BrowserType").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			} else if (property.getProperty("BrowserType").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (property.getProperty("BrowserType").equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();	//This will delete all  the user session information	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.saucedemo.com/"); //This goes the to URL of the application
			
}

//		public void onTestStart(ITestResult result) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		public void onTestSuccess(ITestResult result) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		public void onTestFailure(ITestResult result) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		public void onTestSkipped(ITestResult result) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		public void onStart(ITestContext context) {
//			// TODO Auto-generated method stub
//			
//		} 
		
}


