package com.dgcustomer.testScript;

import org.testng.annotations.Test;

import com.dgcustomer.base.BaseTest;
import com.dgcustomer.payload.OneWay;
import com.dgcustomer.payload.OutStationRoundTrip;
import com.dgcustomer.payload.RoundTrip;

public class OutStationRoundTriptest extends BaseTest{
	@Test(priority=1) //outstation round trip flow
	public void testOutStatioRoundTrip() throws InterruptedException {
		OutStationRoundTrip osr=new OutStationRoundTrip(driver);
		OneWay onw=new OneWay(driver);
		Thread.sleep(5000);
		osr.clickOutStationBtn();
		osr.enterFromLocation();
		osr.selectCurrentLocation();
		osr.enterDestination("Mysuru");
		Thread.sleep(2000);
        osr.selectSuggestion();
		osr.clickScheduleRideBtn();
		osr.clickSelectDateAndTime();
		osr.selectTodayDate();
		osr.clickSelectDateBtn();
		osr.clickSelectTimeBtn();
		osr.clickDriverUsage();
		osr.selectDriverUsage16hr();
		osr.clickCarType();
		onw.scrollDown();
		osr.selectSUV();
		osr.clickContinueBtn();
		Thread.sleep(3000);
		osr.clickConfirmContinueBtn();
		onw.scrollDown();
		osr.clickConfirmContinueBtn();
	}
	@Test(priority=2)
	public void testOutStationRoundTripReschedule() throws InterruptedException {
		OutStationRoundTrip osr=new OutStationRoundTrip(driver);
		OneWay onw=new OneWay(driver);
		onw.scrollDown();
        
        osr.clickRescheduleBtn();
        osr.clickRescheduledDate();
        osr.clickRescheduleSelectDateBtn();
        //sow.selectRescheduleHour();
        //sow.selectRescheduleMinute();
        //sow.selectRescheduleAP();
        osr.clickRescheduleSelectTimeBtn();
        Thread.sleep(7000);
        osr.clickRescheduleOkayBtn();
        
        osr.clickConfirmContinueBtn();
        Thread.sleep(3000);
	}
	@Test(priority=3)
	public void testOutStationRoundTripCancel() throws Exception{
		OutStationRoundTrip osr=new OutStationRoundTrip(driver);
		OneWay onw=new OneWay(driver);
		Thread.sleep(2000);
        onw.scrollDown();
        osr.clickCancelRide();
        osr.clickCancelOption();
        osr.selectCancelReason();
        osr.confirmCancelYes();
	}
}
