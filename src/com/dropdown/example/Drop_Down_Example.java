package com.dropdown.example;



import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Example {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
		driver = new FirefoxDriver(); 
		driver.get("http://www.facebook.com");
		WebElement day =  driver.findElement(By.cssSelector("#day"));
		WebElement month = driver.findElement(By.cssSelector("#month"));
		WebElement year  =  driver.findElement(By.cssSelector("#year"));
		Select oday = new Select(driver.findElement(By.cssSelector("#day")));
		Select omonth = new Select(month);
		Select oyear = new Select(year);
		oday.selectByIndex(7);
		omonth.selectByVisibleText("Jun");
		oyear.selectByVisibleText("2004");
		System.out.println("success");
		 multiSelect();
	}

	public static void multiSelect()throws InterruptedException{
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		WebElement multi = driver.findElement(By.cssSelector("#selenium_commands"));
		Select omulti = new Select(multi);
		omulti.selectByIndex(2);
		omulti.selectByIndex(3);
		omulti.selectByIndex(4);
		Thread.sleep(5000);
		omulti.deselectByIndex(4);
		omulti.deselectByIndex(3);
		omulti.deselectByIndex(2);
		
		 	System.out.println(omulti.isMultiple());
	}
	

}
