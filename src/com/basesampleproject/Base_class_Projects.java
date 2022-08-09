package com.basesampleproject;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_class_Projects {
	public static WebDriver driver;

	public static void gettingurl(String url) {
		driver.get(url);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void sendText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void moveToElement(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public static void scrolldown_action() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,500)");
	}

	public static void scrollup_action() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,-500)");
	}
	
	public static void javascriptclicking(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}

	public static WebDriver gettingBrowser(String type)

	{
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Mohammad\\eclipse-workspace\\Base Class Project\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} 
		else if (type.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Mohammad\\eclipse-workspace\\Base Class Project\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}
		return driver;
	}

	public static void closebrowser() {
		driver.close();
	}

	public static void quitbrowser() {
		driver.quit();

	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void backward() {
		driver.navigate().back();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void select_dropdown(WebElement element, String type, String value) 
	{
		Select s = new Select(element);
		List<WebElement> alloptions = s.getOptions();
		if(type.equalsIgnoreCase("By Index")) {
			int num = Integer.parseInt(value);
			s.selectByIndex(num);
		}
		else if(type.equalsIgnoreCase("By value")){
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("By Visible text")) {
			s.selectByVisibleText(value);
		}
		
	}

	public static void action_functions(WebElement element, String type) {
		Actions act = new Actions(driver);
		 if (type.equalsIgnoreCase("mouse over")) 
		 {
			 act.moveToElement(element).build().perform();
		 }
		 else if (type.equalsIgnoreCase("move by offset location")) 
		 {
			 int X = element.getLocation().getX();
			 int y = element.getLocation().getY();
			 act.moveByOffset(X, y);
		 }
		 else if (type.equalsIgnoreCase("double click")) {
		 act.moveToElement(element).doubleClick().build().perform();
		 }
		 else if (type.equalsIgnoreCase("right click")) {
			act.moveToElement(element).contextClick().build().perform();
		}
		 
	}
	public static void enableornot(WebElement element) {
		element.isEnabled();
	}
	
	public static void displayedornot(WebElement element) {
		element.isDisplayed();
	}
	
	public static void selectedornot(WebElement element) {
		element.isSelected();
	}
	public static void gettingweburl() {
		driver.getCurrentUrl();

	}
	public static void gettingtext(WebElement element) {
		element.getText();

	}
	
	public static void gettingtitle() {
		driver.getTitle();
	}
	public static void gettingattribute(WebElement element, String value) {
		element.getAttribute(value);
	}
	public static void taking_screenshot(String value) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		String p = value;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File (p);
		FileUtils.copyFile(source, destination);
	}
	
	
	
	
	
	
	
	
	
	
}
