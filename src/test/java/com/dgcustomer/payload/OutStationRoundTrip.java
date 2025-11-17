package com.dgcustomer.payload;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class OutStationRoundTrip {
	
	private AppiumDriver driver;
	private By outStationBtn=By.xpath("//android.widget.ImageView[@content-desc=\"Out Station\"]");
	private By oneWayFromLocation = By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText");
	private By currentLocation = By.xpath("//android.view.View[@content-desc=\"Current Location\"]");
	private By oneWayDestination = By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText");
	private By sugg = By.xpath("(//android.widget.Button)[1]");
	private By scheduleRideBtn = By.xpath("//android.widget.Button[@content-desc=\"Schedule Ride\"]");
	
	private By selectDateAndTime = By.xpath("//android.view.View[@content-desc=\"Select Date & Time\"]");
	private By selectTodayDate = By.xpath("//android.view.View[@content-desc=\"Sun, 23 November 2025\"]");
	private By selectDateBtn = By.xpath("//android.widget.Button[@content-desc=\"Select Date\"]");
	private By selectTimeBtn = By.xpath("//android.widget.Button[@content-desc=\"Select Time\"]\r\n"
			+ "");
	private By driverUsage = By.xpath("//android.view.View[@content-desc=\"Driver Usage\"]");
	private By driverUsage2hr = By.xpath("//android.view.View[@content-desc=\"16hrs\"]");
	private By carType = By.xpath("//android.view.View[@content-desc=\"Automatic\"]");
	private By SUV = By.xpath("//android.widget.ScrollView/android.widget.ImageView[1]");
	private By ContinueBtn = By.xpath("//android.widget.Button[@content-desc=\"Continue\"]");
	private By confirmContinueBtn=By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]\r\n"
			+ "");
	
	private By rescheduleBtn=By.xpath("//android.widget.Button[@content-desc=\"Reschedule\"]\r\n"
			+ "");
	private By rescheduledDate = By.xpath("//android.view.View[@content-desc=\"Tue, 25 November 2025\"]");
	private By rescheduleSelectDateBtn = By.xpath("//android.widget.Button[@content-desc=\"Select Date\"]");
	private By rescheduleSelectedTimeHour = By.xpath("//android.widget.SeekBar[@content-desc=\"4 o'clock\"]");
	private By rescheduleSelectedTimeMinute = By.xpath("//android.widget.SeekBar[@content-desc=\"53 minutes\"]");
	private By rescheduleSelectedTimeAP = By.xpath("//android.widget.SeekBar[@content-desc=\"PM\"]");
	private By rescheduleSelectedTimeBtn = By.xpath("//android.widget.Button[@content-desc=\"Select Time\"]");
	private By rescheduleOkayBtn = By.xpath("//android.widget.Button[@content-desc=\"okay\"]");

	private By CancelOption = By.xpath("//android.view.View[@content-desc=\"Please select reason\"]");
	private By cancelRide = By.xpath("//android.widget.Button[@content-desc=\"Cancel\"]");
	private By cancelReason = By.xpath("//android.widget.Button[@content-desc=\"Partner price high\"]");
	private By cancelYes = By.xpath("//android.view.View[@content-desc=\"Yes\"]");
	
	public OutStationRoundTrip(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void clickOutStationBtn() {
		driver.findElement(outStationBtn).click();	
	}
	public void enterFromLocation() {
		driver.findElement(oneWayFromLocation).click();
	}

	public void selectCurrentLocation() {
		driver.findElement(currentLocation).click();
	}

	public String getFromLocationText() {
		return driver.findElement(oneWayFromLocation).getText();
	}

	public void enterDestination(String destination) {
		driver.findElement(oneWayDestination).click();
		driver.findElement(oneWayDestination).sendKeys("Mysur");
	}

	public void selectSuggestion() {
		driver.findElement(sugg).click();
	}

	public void clickScheduleRideBtn() {
		driver.findElement(scheduleRideBtn).click();
	}
	public void clickSelectDateAndTime() {
		driver.findElement(selectDateAndTime).click();
	}

	public void selectTodayDate() {
		driver.findElement(selectTodayDate).click();
	}

	public void clickSelectDateBtn() {
		driver.findElement(selectDateBtn).click();
	}

	public void clickSelectTimeBtn() {
		driver.findElement(selectTimeBtn).click();
	}

	public void clickDriverUsage() {
		driver.findElement(driverUsage).click();
	}

	public void selectDriverUsage16hr() {
		driver.findElement(driverUsage2hr).click();
	}

	public void clickCarType() {
		driver.findElement(carType).click();
	}

	public void selectSUV() {
		driver.findElement(SUV).click();
	}

	public void clickContinueBtn() {
		driver.findElement(ContinueBtn).click();
	}
	
	public void clickConfirmContinueBtn() {
		driver.findElement(confirmContinueBtn).click();
	}
	
	//FOR RESCHEDULE
	
	public void clickRescheduleBtn() {
		driver.findElement(rescheduleBtn).click();
	}
	
	public void clickRescheduledDate() {
		driver.findElement(rescheduledDate).click();
	}

	public void clickRescheduleSelectDateBtn() {
		driver.findElement(rescheduleSelectDateBtn).click();
	}

	public void selectRescheduleHour() {
		driver.findElement(rescheduleSelectedTimeHour).click();
	}

	public void selectRescheduleMinute() {
		driver.findElement(rescheduleSelectedTimeMinute).click();
	}

	public void selectRescheduleAP() {
		driver.findElement(rescheduleSelectedTimeAP).click();
	}

	public void clickRescheduleSelectTimeBtn() {
		driver.findElement(rescheduleSelectedTimeBtn).click();
	}
	
	public void clickRescheduleOkayBtn() {
		driver.findElement(rescheduleOkayBtn).click();
	}
	

	public void clickCancelRide() {
		driver.findElement(cancelRide).click();
	}

	public void clickCancelOption() {
		driver.findElement(CancelOption).click();
	}

	public void selectCancelReason() {
		driver.findElement(cancelReason).click();
	}

	public void confirmCancelYes() {
		driver.findElement(cancelYes).click();
	}

	
}
