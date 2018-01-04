package com.msn.atl.calculate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelenium {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Softwares\\MIsc\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\MIsc\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("Gopal");
		//driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("Gopal");
		
		//driver.findElement(By.xpath("//*[@id=\'u_0_6\']")).click();
		
		
		
		//driver.findElement(By.xpath("//*[@id=\\'u_0_9\\']")).sendKeys("Reddy");
		
		driver.findElement(By.xpath("//*[@id=\'u_0_r\']")).click();
		
		Select monSelect = new Select(driver.findElement(By.xpath("//*[@id=\'month\']")));
		
		monSelect.selectByIndex(3);
		
		
		Select daySelect = new Select(driver.findElement(By.xpath("//*[@id=\'day\']")));
		
		daySelect.selectByValue("10");
		
		Select yearSelect = new Select(driver.findElement(By.xpath("//*[@id=\'year\']")));
		
		yearSelect.selectByVisibleText("1965");
		
		
		driver.findElement(By.xpath("//*[@id=\'reg_pages_msg\']/a")).click();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		waitPeriod(5000);
		
		
		driver.navigate().back();
		
		//driver.findElement(By.xpath("//*[@id=\'u_0_7\']")).click();
		
		//driver.findElement(By.xpath("//*[@id=\'u_0_5\']")).submit();
		
		//driver.findElement(By.id("u_0_2")).submit();

	}

	
	public static void waitPeriod(long waitTime)
	{
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
