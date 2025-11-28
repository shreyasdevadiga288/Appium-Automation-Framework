package com.dgcustomer.payload;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class SettingsPage {
	private AppiumDriver driver;
	private By logOutOpt=By.xpath("//android.widget.Button[@content-desc=\"Logout\"]\r\n"
			+ "");
	private By confirmLogOut=By.xpath("//android.widget.Button[@content-desc=\"Logout\"]\r\n"
			+ "");
	
		
	public SettingsPage(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void clickLogOut() {
		driver.findElement(logOutOpt).click();
	}
	
	public void clickConfirmLogOut() {
		driver.findElement(confirmLogOut).click();
	}
	
}
