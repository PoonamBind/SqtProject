package com.auto.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_Element_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		WebElement obj = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)"));
		 System.out.println(obj.getAttribute("name"));
		 System.out.println(obj.getAttribute("id"));
		 System.out.println(obj.getLocation());
		 System.out.println(obj.getText());
		 System.out.println(obj.getRect());
		 System.out.println(obj.getTagName());
		 System.out.println(obj.getSize());
		 System.out.println(obj.isEnabled());
		 System.out.println(obj.isDisplayed());
		 
	}

}
