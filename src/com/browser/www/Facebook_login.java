package com.browser.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_login {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver(); 
			driver.get("http://facebook.com");
			WebElement login = driver.findElement(By.cssSelector("#email"));
			login.sendKeys("priya");
			login.getLocation();
			WebElement pass = driver.findElement(By.cssSelector("#pass"));
			pass.sendKeys("344126");
			driver.findElement(By.cssSelector("#u_0_2")).click();
	}
	public static void loginFacebook(WebDriver driver){
		driver.findElement(By.cssSelector("#email")).sendKeys("poonambind@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("9997uhg");
		driver.findElement(By.cssSelector("#u_0_2")).click();
	}
	public static void algo(WebDriver driver) throws InterruptedException{
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("#u_0_g")).sendKeys("priya");
		driver.findElement(By.cssSelector("#u_0_i")).sendKeys("singh");
		driver.findElement(By.cssSelector("#u_0_l")).sendKeys("priya@gmail.com");
		driver.findElement(By.cssSelector("#u_0_o")).sendKeys("priya@gmail.com");
		driver.findElement(By.cssSelector("#u_0_s")).sendKeys("priya");
		WebElement day = driver.findElement(By.cssSelector("#day"));
		WebElement month = driver.findElement(By.cssSelector("#month"));
		WebElement year  =  driver.findElement(By.cssSelector("#year"));
		Thread.sleep(5000);
		Select oday = new Select(day);
		Select omonth = new Select(month);
		Select oyear = new Select(year);
		oday.selectByIndex(7);
		omonth.selectByVisibleText("Jun");
		oyear.selectByVisibleText("2004");
		driver.findElement(By.xpath(".//*[@class='_5k_2 _5dba'][1]/label[@class='_58mt']")).click();
		//driver.findElement(By.cssSelector("#u_0_6")).click(); 
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#u_0_y")).click();
		//System.out.println("Sucessfully");
		//driver.close();

	}
}
