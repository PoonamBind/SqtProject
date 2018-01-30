package com.dropdown.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_3 {
	private static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
		driver = new FirefoxDriver(); 
		driver.get("http://www.facebook.com");
		Select oyear = new Select(driver.findElement(By.cssSelector("#year")));
		List<WebElement> oSize = oyear.getOptions();
		int listSize = oSize.size();
		System.out.println(listSize);
		for(int i=0;i<listSize;i++){
			String continentname = oyear.getOptions().get(i).getText();
			System.out.println(continentname);
			
		}
		Select omonth = new Select(driver.findElement(By.cssSelector("#month")));
		List<WebElement> month = omonth.getOptions();
		int monthList = month.size();
		System.out.println(monthList);
		for(int i=0;i<monthList;i++){
			String monthNames = omonth.getOptions().get(i).getText();
			System.out.println(monthNames);
			
		}
		driver.close();
	}

}
