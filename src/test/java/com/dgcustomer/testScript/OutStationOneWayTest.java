package com.dgcustomer.testScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.dgcustomer.base.BaseTest;
import com.dgcustomer.payload.OneWay;
import com.dgcustomer.payload.OutStationOneWay;
import com.dgcustomer.payload.OutStationRoundTrip;

import io.appium.java_client.AppiumDriver;

public class OutStationOneWayTest extends BaseTest {
	@Test(priority=1) //out station one way flow
	public void testOutStationOneWay() throws InterruptedException {
		OutStationOneWay oso=new OutStationOneWay(driver);
		OneWay onw=new OneWay(driver);
		Thread.sleep(5000);
		oso.clickOutStationBtn();
		oso.enterFromLocation();
		oso.selectCurrentLocation();
		oso.enterDestination("Mangaluru");
		Thread.sleep(2000);
        oso.selectSuggestion();
		oso.clickScheduleRideBtn();
		oso.clickOneWayBtn();
		oso.clickSelectDateAndTime();
		oso.selectTodayDate();
		oso.clickSelectDateBtn();
		oso.clickSelectTimeBtn();
		oso.clickDriverUsage();
		oso.selectDriverUsage6hrs();
		oso.clickCarType();
		onw.scrollDown();
		oso.selectSUV();
		oso.clickContinueBtn();
		Thread.sleep(3000);
		oso.clickConfirmContinueBtn();
		onw.scrollDown();
		oso.clickConfirmContinueBtn();
	}
	@Test(priority=2)
	public void testOutStationOneWayReschedule() throws InterruptedException {
		OutStationOneWay oso=new OutStationOneWay(driver);
		OneWay onw=new OneWay(driver);
		onw.scrollDown();
        
        oso.clickRescheduleBtn();
        oso.clickRescheduledDate();
        oso.clickRescheduleSelectDateBtn();
        //sow.selectRescheduleHour();
        //sow.selectRescheduleMinute();
        //sow.selectRescheduleAP();
        oso.clickRescheduleSelectTimeBtn();
        Thread.sleep(7000);
        oso.clickRescheduleOkayBtn();
        
        oso.clickConfirmContinueBtn();
        Thread.sleep(3000);
	}
	@Test(priority=3)
	public void testOutStationOneWayCancel() throws InterruptedException {
		OutStationOneWay oso=new OutStationOneWay(driver);
		OneWay onw=new OneWay(driver);
		Thread.sleep(2000);
        onw.scrollDown();
        oso.clickCancelRide();
        oso.clickCancelOption();
        oso.selectCancelReason();
        oso.confirmCancelYes();
	}
}
