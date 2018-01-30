                                                                                                                            
package com.browser.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser_Example {
	
	public static void Firefox(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.google.com");
		driver.navigate().to("http://facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("Firefox done\\\\");
		driver.quit();
	}
	public static void chrome(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.google.com");
		driver.navigate().to("http://redbus.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("Chrome done");
		driver.quit();
	}
	public static void ie(){
		System.setProperty("webdriver.ie.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\IEDriverServer.exe");
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(
		    InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
		    true);
		WebDriver driver = new InternetExplorerDriver(caps); 
		driver.get("http://www.google.com");
		driver.navigate().to("http://redbus.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("Internet explorer done");
		driver.quit();
	}
	public static void edge(){
		System.setProperty("webdriver.edge.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver(); 
		driver.get("http://www.google.com");
		driver.navigate().to("http://redbus.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("Edge done");
		driver.quit();
	}
}
