package com.myStore.womenPage;

import static org.testng.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;
import com.selenium.Nayilalibrary.BasePage;

import jxl.common.Logger;

public class YourAddressPage extends BasePage {
	final static Logger logger = Logger.getLogger(YourAddressPage.class);

	public YourAddressPage wait_ForPageLoadComplete() {
		try {
			logger.info("Step>Waiting For Page Load Complete");

			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(60, TimeUnit.SECONDS)
					.pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
			WebElement saveBtn = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.id("submitAddress"));
				}

			});
			assertNotNull(saveBtn);
		} catch (Exception e) {
			logger.error("Error!Waiting For Page Load is Failed");
		}
		return this;
	}
	
	public YourAddressPage edit_AddressOne() {
		logger.info("Step:>Edit Address One");
		try {
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(1000);
			driver.findElement(By.id("address1")).clear();
			driver.findElement(By.id("address1")).sendKeys("1212 Urumqi St");
			driver.findElement(By.id("city")).clear();
			driver.findElement(By.id("city")).sendKeys("Urumqi");
		} catch (Exception e) {
			logger.error("Error!! It Did Not Edit Address One on eone ");
		}
		return this;
	}
	public YourAddressPage click_OnSaveBtn() {
		logger.info("Step:>Click On Save Btn");
		try {
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1000);
			driver.findElement(By.id("submitAddress")).click();
		} catch (Exception e) {
			logger.error("Error!! It Did Not Click On Save Btn");
		}
		return this;
	}
	
	public YourAddressPage add_NewAddress() {
		logger.info("Step:>Add New Address Info");
		try {
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(1000);
			driver.findElement(By.id("address1")).clear();
			driver.findElement(By.id("address1")).sendKeys("1212 Hulja St");
			driver.findElement(By.id("city")).sendKeys("Hulja");
			WebElement state=driver.findElement(By.id("id_state"));
			Select sel=new Select(state);
			sel.selectByValue("3");
			driver.findElement(By.id("postcode")).sendKeys("54878");
			driver.findElement(By.id("phone_mobile")).sendKeys("3124569847");
			driver.findElement(By.id("alias")).clear();
			driver.findElement(By.id("alias")).sendKeys("new address");
			
		} catch (Exception e) {
			logger.error("Error!! It Did Not Add New Address Info");
		}
		return this;
	}
	
	
	
	

}
