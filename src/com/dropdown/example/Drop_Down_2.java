package com.dropdown.example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http:/toolsqa.wpengine.com/automation-practice-form");
		WebElement continent = driver.findElement(By.id("continents"));
		Select ocontinent = new Select(continent);
		ocontinent.selectByVisibleText("Asia");
		Thread.sleep(2000);
		//ocontinent.selectByIndex(2);
		List<WebElement> oSize = ocontinent.getOptions();
		int listSize = oSize.size();
		System.out.println(listSize);
		for(int i=0;i<listSize;i++){
			String continentname = ocontinent.getOptions().get(i).getText();
			System.out.println(continentname);
			if(continentname.equals("Africa")){
				ocontinent.selectByIndex(i);
				break;
			}
		}
		driver.close();

	}

}
