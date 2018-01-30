package com.browser.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.google.com");
	
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.id("identifierId")).sendKeys("poonambind5979@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='password']/div")).sendKeys("bbscet2006");
		driver.findElement(By.xpath(".//*[@class='RveJvd snByac']")).click();
	}

}
