package org.gmailacc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Acc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad\\eclipse-workspace\\Gmail_Acc\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		WebElement createacc = driver.findElement(By.xpath("//span[contains(text(),'Create an account')][1]"));
		createacc.click();
		driver.findElement(By.id("firstName")).sendKeys("Mohammad");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Sultan");
		driver.findElement(By.name("Username")).clear();
		driver.findElement(By.name("Username")).sendKeys("sultan12381238");
		driver.findElement(By.name("Passwd")).sendKeys("Sultan1238");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Sultan1238");
		WebElement showpasss = driver.findElement(By.xpath("//div[contains(text(),'Show password')]"));
		showpasss.click();
		WebElement next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		next.click();
		
		
		
	}

}
