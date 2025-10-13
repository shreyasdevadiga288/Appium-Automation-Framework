package com.dgcustomer.utilities;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;

public class WaitUtils {
	
	    public static WebElement waitForElementVisible(AppiumDriver driver, By locator, int seconds) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
	        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }

	    public static WebElement waitForElementClickable(AppiumDriver driver, By locator, int seconds) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
	        return wait.until(ExpectedConditions.elementToBeClickable(locator));
	    }

	    public static void waitForSeconds(int seconds) {
	        try {
	            Thread.sleep(seconds * 1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}


