package com.skillio;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class HomePageForGoIBIBO {
	@Test
	public void verifyOneStopFilteredFlights() throws InterruptedException {
		RemoteWebDriver driver=new FirefoxDriver();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.cssSelector("span.icClose")).click();
		driver.findElement(By.cssSelector("div.sc-12foipm-20:nth-child(1)")).click();
		driver.findElement(By.cssSelector("input[value]")).sendKeys("Mumbai");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("ul#autoSuggest-list>li:nth-child(1)")).click();
		driver.findElement(By.cssSelector("div.sc-12foipm-20:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div.sc-12foipm-20:nth-child(2) input")).sendKeys("Krakow");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("ul#autoSuggest-list>li:nth-child(1)")).click();
		driver.findElement(By.cssSelector("div.sc-12foipm-20:nth-child(3)")).click();
		driver.findElement(By.cssSelector("div.DayPicker-Month:nth-child(1)  div.DayPicker-Day--start")).click();
		driver.findElement(By.cssSelector("span.sc-12foipm-72")).click();
		//click on Got It button
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("span[data-testid='coachmark-overlay-button']")).click();
		driver.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.filterWrapper:nth-child(2)>div.filtersOuter:nth-child(1)>div>div.makeFlex:nth-child(1) label")).click();
		List<WebElement> stopinfolist=driver.findElements(By.cssSelector("div.stop-info p.flightsLayoverInfo font"));
		SoftAssert softly=new SoftAssert();
		for (WebElement stopInfo : stopinfolist) {
			softly.assertTrue(stopInfo.getText().contains("1 stop"));
		}
		softly.assertAll();
		//driver.close();
	}
	@Test
	public void mySecondTestCase() {
		System.out.println("Am second test case");
	}
}
