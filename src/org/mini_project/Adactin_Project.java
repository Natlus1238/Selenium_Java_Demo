package org.mini_project;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Project {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Mohammad\\eclipse-workspace\\Mini Project\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://adactinhotelapp.com/index.php");
		w.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		w.findElement(By.id("username")).sendKeys("Sultan1238");
		w.findElement(By.id("password")).sendKeys("Pass@123");
		w.findElement(By.id("login")).click();
		WebElement Locations = w.findElement(By.id("location"));
		Select loc = new Select(Locations);
		
		loc.selectByVisibleText("Melbourne");
		WebElement hotel = w.findElement(By.id("hotels"));
		Select selhotel = new Select(hotel);
		selhotel.selectByVisibleText("Hotel Sunshine");
		WebElement room = w.findElement(By.id("room_type"));
		Select selroom = new Select(room);
		selroom.selectByVisibleText("Deluxe");
		WebElement roomcount = w.findElement(By.id("room_nos"));
		Select selroomcount = new Select(roomcount);
		selroomcount.selectByVisibleText("2 - Two");
		WebElement datein = w.findElement(By.id("datepick_in"));
		datein.clear();
		datein.sendKeys("09/03/1997");
		WebElement dateout = w.findElement(By.id("datepick_out"));
		dateout.clear();
		dateout.sendKeys("12/03/1997");
		WebElement adult = w.findElement(By.id("adult_room"));
		Select seladult = new Select(adult);
		seladult.selectByVisibleText("4 - Four");
		WebElement child = w.findElement(By.id("child_room"));
		Select selchild = new Select(child);
		selchild.selectByVisibleText("0 - None");
		w.findElement(By.id("Submit")).click();
		w.findElement(By.id("radiobutton_0")).click();
		w.findElement(By.id("continue")).click();
		w.findElement(By.id("first_name")).sendKeys("Mohammad");
		w.findElement(By.id("last_name")).sendKeys("Sultan");
		w.findElement(By.id("address")).sendKeys("Pattalam,Tambaram");
		w.findElement(By.id("cc_num")).sendKeys("1245124585963574");
		WebElement card = w.findElement(By.id("cc_type"));
		Select selcard = new Select(card);
		selcard.selectByVisibleText("Master Card");
		WebElement expirymonth = w.findElement(By.id("cc_exp_month"));
		Select selexpmon = new Select(expirymonth);
		selexpmon.selectByVisibleText("March");
		WebElement expiryyear = w.findElement(By.id("cc_exp_year"));
		Select selexpyr = new Select(expiryyear);
		selexpyr.selectByVisibleText("2021");
		w.findElement(By.id("cc_cvv")).sendKeys("584");
		w.findElement(By.id("book_now")).click();
		TakesScreenshot ts = (TakesScreenshot)w;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Mohammad\\eclipse-workspace\\Mini Project\\Screenshot\\complete.png");
		FileUtils.copyFile(source, destination);
		
		
		
	}

}
