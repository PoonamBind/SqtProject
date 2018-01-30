package com.auto.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class Web_Elements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.google.com");
		WebElement signin = driver.findElement(By.cssSelector("#gb_70"));
		 System.out.println(signin.getAttribute("id"));
		 System.out.println(signin.getCssValue("font-family"));
		 System.out.println(signin.getSize());
		 System.out.println(signin.getTagName());
		 System.out.println(signin.getText());
		 System.out.println(signin.getRect());
		 System.out.println(signin.getLocation());
		 System.out.println(signin.isEnabled());
		 System.out.println(signin.isDisplayed());
		 String gmail = driver.findElement(By.cssSelector("")).getText();
		 System.out.println(gmail);
		 if(gmail.contentEquals("Gmail")){
			 System.out.println("pass");
			 
		 }else{
			 System.out.println("fail");
			 
		 }
		 driver.quit();
	
	}

}
