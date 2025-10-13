package com.dgcustomer.testScript;

import org.testng.annotations.Test;

import com.dgcustomer.base.BaseTest;
import com.dgcustomer.payload.OneWay;
import com.dgcustomer.payload.OutStationRoundTrip;
import com.dgcustomer.payload.RoundTrip;
import com.dgcustomer.utilities.WaitUtils;

public class OutStationRoundTriptest extends BaseTest{
	@Test(priority=1) //outstation round trip flow
	public void testOutStatioRoundTrip() throws InterruptedException {
		OutStationRoundTrip osr=new OutStationRoundTrip(driver);
		OneWay onw=new OneWay(driver);
		WaitUtils.waitForSeconds(5);
		osr.clickOutStationBtn();
		osr.enterFromLocation();
		osr.selectCurrentLocation();
		osr.enterDestination("Mysuru");
		WaitUtils.waitForSeconds(2);
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
		WaitUtils.waitForSeconds(3);
		osr.clickConfirmContinueBtn();
		onw.scrollDown();
		osr.clickConfirmContinueBtn();
	}
	@Test(priority=2)
	public void testOutStationRoundTripReschedule() throws InterruptedException {
		OutStationRoundTrip osr=new OutStationRoundTrip(driver);
		OneWay onw=new OneWay(driver);
		WaitUtils.waitForSeconds(2);
		onw.scrollDown();
        
        osr.clickRescheduleBtn();
        osr.clickRescheduledDate();
        osr.clickRescheduleSelectDateBtn();
        //sow.selectRescheduleHour();
        //sow.selectRescheduleMinute();
        //sow.selectRescheduleAP();
        osr.clickRescheduleSelectTimeBtn();
        WaitUtils.waitForSeconds(5);
        osr.clickRescheduleOkayBtn();
        
        osr.clickConfirmContinueBtn();
        
	}
	@Test(priority=3)
	public void testOutStationRoundTripCancel() throws Exception{
		OutStationRoundTrip osr=new OutStationRoundTrip(driver);
		OneWay onw=new OneWay(driver);
		WaitUtils.waitForSeconds(2);
        onw.scrollDown();
        osr.clickCancelRide();
        osr.clickCancelOption();
        osr.selectCancelReason();
        osr.confirmCancelYes();
	}
}
