package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Highlight {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad\\eclipse-workspace\\Java Selenium Assignment\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=486457318205&hvpos=&hvnetw=g&hvrand=6733092387588572620&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061946&hvtargid=kwd-298187295805&hydadcr=5657_2175734&gclid=EAIaIQobChMIi6SVpczk-AIVKZNmAh0EvQsYEAAYASAAEgKMXPD_BwE");

		WebElement high = driver.findElement(By.xpath("//h2[text()='Pay your credit card bills on Amazon']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", high);

		/*
		 * for (int i = 1; i > 0; i++) { js.
		 * executeScript("arguments[0].setAttribute('style','background:red; font-size:50px')"
		 * , high);
		 * 
		 * js.
		 * executeScript("arguments[0].setAttribute('style','background:blue; font-size:50px')"
		 * , high); }
		 */

		js.executeScript("arguments[0].setAttribute('style','background:red; font-size:50px')", high);
		
		
		WebElement text = driver.findElement(By.id("twotabsearchtextbox"));
		
		js.executeScript("arguments[0].setAttribute('value','shiva kumar')", text);
		
		Object text1 = js.executeScript("return arguments[0].getAttribute('value')", text);
		
		System.out.println(text1);
	}

}
