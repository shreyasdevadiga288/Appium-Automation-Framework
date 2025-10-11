package com.dgcustomer.payload;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import io.appium.java_client.AppiumDriver;

public class OneWay {

	private AppiumDriver driver;

	private By hireDriver = By.xpath("//android.widget.ImageView[@content-desc=\"Hire Driver\"]");
	private By oneWay = By.xpath("//android.widget.ImageView[@content-desc=\"One Way\"]");
	private By oneWayFromLocation = By
			.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText");
	private By currentLocation = By.xpath("//android.view.View[@content-desc=\"Current Location\"]");
	private By oneWayDestination = By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText");
	private By sugg = By.xpath("(//android.widget.Button)[1]");
	private By scheduleRideBtn = By.xpath("//android.widget.Button[@content-desc=\"Schedule Ride\"]");

	private By selectDateAndTime = By.xpath("//android.view.View[@content-desc=\"Select Date & Time\"]");
	private By selectTodayDate = By.xpath("//android.view.View[@content-desc=\"Fri, 17 October 2025\"]");
	private By selectDateBtn = By.xpath("//android.widget.Button[@content-desc=\"Select Date\"]");
	private By selectTimeBtn = By.xpath("//android.widget.Button[@content-desc=\"Select Time\"]\r\n"
			+ "");
	private By driverUsage = By.xpath("//android.view.View[@content-desc=\"Driver Usage\"]");
	private By driverUsage2hr = By.xpath("//android.view.View[@content-desc=\"2hrs\"]");
	private By carType = By.xpath("//android.view.View[@content-desc=\"Automatic\"]");
	private By SUV = By.xpath("//android.widget.ScrollView/android.widget.ImageView[1]");
	private By ContinueBtn = By.xpath("//android.widget.Button[@content-desc=\"Continue\"]");
	private By confirmContinueBtn=By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]\r\n"
			+ "");
	private By BestPrice = By.xpath("(//android.view.View)[2]");
	private By FindDriverBtn = By.xpath("//android.widget.Button[@content-desc=\"Find Driver\"]");
	private By FinalPrice = By.xpath("(//android.view.View[contains(@content-desc,'₹')])[11]");
	private By SummaryContinueBtn = By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]\r\n"
			+ "");

	private By rescheduleBtn=By.xpath("//android.widget.Button[@content-desc=\"Reschedule\"]\r\n"
			+ "");
	private By rescheduledDate = By.xpath("//android.view.View[@content-desc=\"Tue, 28 October 2025\"]");
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

	public OneWay(AppiumDriver driver) {
		this.driver = driver;
	}

	public void clickHireDriver() {
		driver.findElement(hireDriver).click();
	}

	public void clickOneWay() {
		driver.findElement(oneWay).click();
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
		driver.findElement(oneWayDestination).sendKeys(destination);
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

	public void selectDriverUsage2hr() {
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

	

	public void clickFindDriverBtn() {
		driver.findElement(FindDriverBtn).click();
	}

	public String getFinalPrice() {
		return driver.findElement(FinalPrice).getAttribute("content-desc");
	}

	public void clickSummaryContinueBtn() {
		driver.findElement(SummaryContinueBtn).click();
	}

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

	public void scrollDown() {
		int height = driver.manage().window().getSize().height;
		int width = driver.manage().window().getSize().width;

		int startX = width / 2;
		int startY = (int) (height * 0.7);
		int endY = (int) (height * 0.3);

		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(finger, 1);

		swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
		swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		swipe.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), startX, endY));
		swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(java.util.Collections.singletonList(swipe));
	}
}
