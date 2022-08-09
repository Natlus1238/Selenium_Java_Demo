package com.iframe;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Sample_Testing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad\\eclipse-workspace\\Iframe Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// JavascriptExecutor js = ((JavascriptExecutor)driver);
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		// driver.findElement(By.xpath("//li[@id='iFrame']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("globalSqa");
		Thread.sleep(2000);
		WebElement Home = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
		// js.executeScript("arguments[0].click()", Home);
		Home.click();
		Thread.sleep(3000);
		driver.navigate().to("http://demo.automationtesting.in/Frames.html");
		WebElement singleframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(singleframe);
		Thread.sleep(2000);
		WebElement testbox = driver.findElement(By.xpath("//input[@type='text'][1]"));
		testbox.sendKeys("testing using java");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement multipleframe = driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]"));
		multipleframe.click();
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Done");

	}

}
