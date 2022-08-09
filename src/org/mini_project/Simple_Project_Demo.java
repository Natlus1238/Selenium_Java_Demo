package org.mini_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Simple_Project_Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad\\eclipse-workspace\\Mini Project\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		Actions a = new Actions(w);
		JavascriptExecutor js = ((JavascriptExecutor) w);
		w.get("http://automationpractice.com/index.php");
		w.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement wm = w.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]"));
		a.moveToElement(wm).build().perform();
		w.findElement(By.linkText("T-shirts")).click();
		w.findElement(By.xpath(
				"//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ul[1]/li[2]/label[1]"))
				.click();
		w.findElement(By.xpath("//input[@id='layered_id_attribute_group_14']")).click();
		w.findElement(By.xpath("//input[@id='layered_id_feature_5']")).click();
		w.findElement(By.xpath("//input[@id='layered_id_feature_11']")).click();
		w.findElement(By.xpath("//input[@id='layered_id_feature_17']")).click();
		w.findElement(By.xpath("//input[@id='layered_quantity_1']")).click();
		w.findElement(By.xpath("//input[@id='layered_manufacturer_1']")).click();
		w.findElement(By.xpath("//input[@id='layered_condition_new']")).click();
		WebElement ct = w.findElement(By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]"));
		a.moveToElement(ct).build().perform();
		w.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		WebElement checkout = w.findElement(By.xpath("//a[@title ='Proceed to checkout']"));
//		a.moveToElement(checkout).build().perform();
//		Thread.sleep(7000);
//		checkout.click();
		js.executeScript("arguments[0].click();", checkout);
		w.navigate().refresh();
		for (int i = 0; i < 3; i++) {
			w.findElement(By.xpath("//i [@class = 'icon-plus']")).click();
			System.out.println("the number of time button clicked = " + i);
		}
		WebElement checkout1 = w.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]"));
		js.executeScript("arguments[0].click();", checkout1);
		WebElement signin = w.findElement(By.id("email"));
		signin.sendKeys("amsat1238@gmail.com");
		WebElement pass = w.findElement(By.id("passwd"));
		pass.sendKeys("Pass@123");
		w.findElement(By.id("SubmitLogin")).click();
		WebElement proceed = w
				.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]"));
//		js.executeScript("arguments[0].click();", proceed);
		proceed.click();
		w.findElement(By.xpath("//input[@id='cgv']")).click();
		WebElement proceed1 = w.findElement(
				By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]"));
		proceed1.click();

		
		
		
		
	}

}
