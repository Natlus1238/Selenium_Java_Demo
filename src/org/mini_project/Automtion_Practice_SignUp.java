package org.mini_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automtion_Practice_SignUp {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad\\eclipse-workspace\\Mini Project\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("http://automationpractice.com/index.php");
		w.findElement(By.xpath("//a[contains(@title, 'Log in to your customer account')]")).click();
		w.findElement(By.id("email_create")).sendKeys("amsat1238@gmail.com");
		w.findElement(By.id("SubmitCreate")).click();
//		w.findElement(By.id("uniform-id_gender1")).click();
		Thread.sleep(4000);
		w.findElement(By.id("customer_firstname")).sendKeys("Mohammad");
		w.findElement(By.id("customer_lastname")).sendKeys("Sultan");
		w.findElement(By.id("passwd")).sendKeys("Pass@123");
		WebElement day = w.findElement(By.id("days"));
		WebElement month = w.findElement(By.id("months"));
		WebElement year = w.findElement(By.id("years"));
		Select selday = new Select(day);
		Select selmonth = new Select(month);
		Select selyear = new Select(year);
		selday.selectByValue("9");
		Thread.sleep(4000);
		selmonth.selectByIndex(3);
		selyear.selectByValue("1997");
		w.findElement(By.id("firstname")).sendKeys("Mohammad");
		w.findElement(By.id("lastname")).sendKeys("Sultan");
		w.findElement(By.id("address1")).sendKeys("935 Technology Dr, Ann Arbor, MI 48108, United States");
		w.findElement(By.id("city")).sendKeys("Michigen");
		w.findElement(By.id("postcode")).sendKeys("48108");
		WebElement state = w.findElement(By.id("id_state"));
		Select selstate = new Select (state);
		selstate.selectByIndex(11);
		w.findElement(By.id("phone_mobile")).sendKeys("1234567890");
		WebElement alias = w.findElement(By.id("alias"));
		alias.clear();
		alias.sendKeys("TamilNadu, India");
//		a.moveToElement(alias).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
//		.keyDown(Keys.DELETE).keyUp(Keys.DELETE).sendKeys("TamilNadu, India").build().perform();
		w.findElement(By.id("submitAccount")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
