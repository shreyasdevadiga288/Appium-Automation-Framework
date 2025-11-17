package com.dgcustomer.testScript;

import org.testng.annotations.Test;

import com.dgcustomer.base.BaseTest;
import com.dgcustomer.payload.OneWay;
import com.dgcustomer.payload.RoundTrip;
import com.dgcustomer.utilities.WaitUtils;

public class RoundTripTest extends BaseTest{
	@Test(priority=1) //RoundTrip Schedule test script
	public void testScheduleRideForRoundTrip() throws InterruptedException {
		
		logger.info("RoundTrip Schedule Started");
		RoundTrip rt=new RoundTrip(driver);
		OneWay onw=new OneWay(driver);
		WaitUtils.waitForSeconds(5);
		rt.clickRoundTripBtn();
		rt.selectCurrentLocation();		
		rt.clickScheduleRideBtn();
		rt.clickSelectDateAndTime();
		rt.selectTodayDate();
		rt.clickSelectDateBtn();
		rt.clickSelectTimeBtn();
		rt.clickDriverUsage();
		rt.selectDriverUsage4hr();
		rt.clickCarType();
		onw.scrollDown();
		rt.selectSUV();
		onw.scrollDown();
		rt.clickContinueBtn();
		WaitUtils.waitForSeconds(5);
		rt.clickConfirmContinueBtn();
		onw.scrollDown();
		rt.clickConfirmContinueBtn();
		logger.info("RoundTrip Schedule succesful***");
	}
	@Test(priority=2) //RoundTrip Reschedule test Script
	public void testRescheduleRideForRoundTrip() throws InterruptedException {
		logger.info("RoundTrip Reschedule Started");
		RoundTrip rt=new RoundTrip(driver);
		OneWay onw=new OneWay(driver);
		WaitUtils.waitForSeconds(3);
		onw.scrollDown();
        
        rt.clickRescheduleBtn();
        rt.clickRescheduledDate();
        rt.clickRescheduleSelectDateBtn();
        //sow.selectRescheduleHour();
        //sow.selectRescheduleMinute();
        //sow.selectRescheduleAP();
        rt.clickRescheduleSelectTimeBtn();
        WaitUtils.waitForSeconds(5);
        rt.clickRescheduleOkayBtn();
        
        rt.clickConfirmContinueBtn();
        WaitUtils.waitForSeconds(3);
        logger.info("RoundTrip Reschedule successfull");
	}
	@Test(priority=3) //Round Trip Cancel Test Script
	public void testCancelRideForRoundTrip() throws InterruptedException {
		logger.info("RoundTrip Cancel Ride Started");
    	RoundTrip rt=new RoundTrip(driver);
    	OneWay onw=new OneWay(driver);
    	WaitUtils.waitForSeconds(3);
        onw.scrollDown();
        rt.clickCancelRide();
        rt.clickCancelOption();
        rt.selectCancelReason();
        rt.confirmCancelYes();
        logger.info("RoundTrip Cancel Succesful");
	}

}
