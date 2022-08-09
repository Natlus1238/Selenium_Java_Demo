package com.basesampleproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testWeb_Testing extends Base_class_Projects {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = gettingBrowser("chrome");
		gettingurl("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		WebElement username = driver.findElement(By.name("txtUsername"));
		sendText(username, "Admin");

		WebElement password = driver.findElement(By.name("txtPassword"));
		sendText(password, "admin123");

		WebElement loginbtn = driver.findElement(By.name("Submit"));
		clickOnElement(loginbtn);

	}

}
