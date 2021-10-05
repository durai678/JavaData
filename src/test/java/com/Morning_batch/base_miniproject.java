package com.Morning_batch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class base_miniproject extends pom_miniproject {
	//webDriver
	public static WebDriver driver;

	public static void getdriverr(String type) {
		if (type.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\win 10\\eclipse-workspace\\Selinium_Practice\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}
		

	}
	//thread.sleep

	public static void sleep(long value) throws InterruptedException {
		Thread.sleep(value);

	}
	//URL

	public static void browserr(String url) {
		driver.get(url);

	}
	//SENDKEYS

	public static void parameter(WebElement element, String value) {
		element.sendKeys(value);

	}
	//click

	public static void clickk(WebElement element) {
		element.click();

	}
	//FRAME
	public static void frames(WebElement element) {
		driver.switchTo().frame(element);

	}
	//drop down
	public static  void slect(WebElement element) {
		Select s=new Select(element);
		s.selectByValue("3");

	}
	//java Script Executer
	public static void javascript(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");

	}
	//screenshot
	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\win 10\\eclipse-workspace\\Morning_batch\\target\\screenshott\\"+name+".png");
		FileUtils.copyFile(source, destination);

	}

}
