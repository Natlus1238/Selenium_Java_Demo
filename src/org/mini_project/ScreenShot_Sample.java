package org.mini_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_Sample {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Mohammad\\eclipse-workspace\\Mini Project\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://adactinhotelapp.com/index.php");
		TakesScreenshot ts = ((TakesScreenshot)w);
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Users\\Mohammad\\eclipse-workspace\\Mini Project\\Screenshot\\compete.png");
		FileUtils.copyFile(source, destination);
	}

}
