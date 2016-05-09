package com.example.seleniumdemo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SomeSiteTest {

	private static WebDriver driver;
	WebElement element;

	@BeforeClass
	public static void driverSetup() {
		// ChromeDrirver, FireforxDriver, ...
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@Test
	public void tipsPage(){
		driver.get("http://pclab.pl");
		driver.findElement(By.xpath("/html/body/div[@id='container']/div[@id='contentcontainer']/div[@id='contenttabwrapper']/div[@id='contentwrapper']/div[@id='headerwrapper']/div[@id='header']/div[@class='left']/div[@class='menu']/ul/li[4]/a[@class='tips']")).click();
		element = driver.findElement(By.xpath("/html/body/div[@id='container']/div[@id='contentcontainer']/div[@id='contenttabwrapper']/div[@id='contentwrapper']/div[@id='headerwrapper']/div[@id='header']/div[@class='left']/div[@class='menu']/ul/li[4]/a[@class='tips']"));
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    assertNotNull(screenshot);

		try {
			FileUtils.copyFile(screenshot, new File("D:\\driver\\scrren.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertTrue(true);
	}
	
	@Test
	public void checkArtPage(){
		driver.get("http://pclab.pl");
		element = driver.findElement(By.className("articles"));
		element.click();
		assertTrue(driver.getTitle().contains("Artykuły :: PCLab.pl"));
	}
	
	@Test
	public void checkLogin(){
		driver.get("http://pclab.pl");
	
		driver.findElement(By.xpath("/html/body/div[@id='container']/div[@id='contentcontainer']/div[@id='contenttabwrapper']/div[@id='contentwrapper']/div[@id='headerwrapper']/div[@id='header']/div[@class='right']/div[@class='login']/form/div[@class='name']/input")).sendKeys("testUser13");
		driver.findElement(By.xpath("/html/body/div[@id='container']/div[@id='contentcontainer']/div[@id='contenttabwrapper']/div[@id='contentwrapper']/div[@id='headerwrapper']/div[@id='header']/div[@class='right']/div[@class='login']/form/div[@class='pass']/input")).sendKeys("testUser#");
		element = driver.findElement(By.xpath("/html/body/div[@id='container']/div[@id='contentcontainer']/div[@id='contenttabwrapper']/div[@id='contentwrapper']/div[@id='headerwrapper']/div[@id='header']/div[@class='right']/div[@class='login']/form/div[@class='go']/input"));
		element.click();
		
		WebElement loggedIn = driver.findElement(By.xpath("/html/body/div[@id='container']/div[@id='contentcontainer']/div[@id='contenttabwrapper']/div[@id='contentwrapper']/div[@id='headerwrapper']/div[@id='header']/div[@class='right']/div[@class='info']/form/div[@class='go']/input"));
		
		assertNotNull(loggedIn);
	}

	@AfterClass
	public static void cleanp() {
		driver.quit();
	}
}
