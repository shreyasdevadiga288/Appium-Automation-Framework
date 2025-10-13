package com.dgcustomer.testScript;

import org.testng.annotations.Test;

import com.dgcustomer.base.BaseTest;
import com.dgcustomer.payload.OneWay;
import com.dgcustomer.utilities.WaitUtils;

public class OneWayTest extends BaseTest {

	

	@Test(priority=1)  //one way booking flow
    public void testHireDriverForOneWay() throws Exception {
		OneWay sow=new OneWay(driver);
		logger.info("***Schedule flow started***");
    	WaitUtils.waitForSeconds(5);
        sow.clickHireDriver();
        sow.clickOneWay();
        sow.enterFromLocation();
        sow.selectCurrentLocation();
        
        sow.enterDestination("Mahalakshmi");
        WaitUtils.waitForSeconds(2);
        sow.selectSuggestion();
        sow.clickScheduleRideBtn();
        sow.clickSelectDateAndTime();
        sow.selectTodayDate();
        sow.clickSelectDateBtn();
        
        sow.clickSelectTimeBtn();
        sow.clickDriverUsage();
        sow.selectDriverUsage2hr();
        sow.clickCarType();
        sow.scrollDown();
        sow.selectSUV();
        sow.scrollDown();
        sow.clickContinueBtn();
        WaitUtils.waitForSeconds(3);
        sow.clickConfirmContinueBtn();
        //System.out.println("Preferred Price: " + getBestPrice());
        WaitUtils.waitForSeconds(2);
        //sow.clickFindDriverBtn();
        sow.scrollDown();
        //System.out.println("Final Price: " + getFinalPrice());
        sow.clickSummaryContinueBtn();   
        logger.info("***Scheduled Succesfully***");
    }
	
	@Test(priority=2) //Cancel the booking test script
	public void testRescheduleRideForoneWay() throws InterruptedException {
		logger.info("***Reschedule Started***");
		OneWay sow=new OneWay(driver);
		WaitUtils.waitForSeconds(3);
        sow.scrollDown();
        
        sow.clickRescheduleBtn();
        sow.clickRescheduledDate();
        sow.clickRescheduleSelectDateBtn();
        //sow.selectRescheduleHour();
        //sow.selectRescheduleMinute();
        //sow.selectRescheduleAP();
        sow.clickRescheduleSelectTimeBtn();
        WaitUtils.waitForSeconds(5);
        sow.clickRescheduleOkayBtn();
        
        sow.clickConfirmContinueBtn();
        WaitUtils.waitForSeconds(3);
        logger.info("***Reschedule successfull***");
	}
	
	@Test(priority=3) //reschedule the current booking  testcript
    public void testCancelRideForOneWay() throws Exception{
		logger.info("***Cancel Ride Started***");
    	OneWay sow=new OneWay(driver);
        WaitUtils.waitForSeconds(2);
        sow.scrollDown();
        sow.clickCancelRide();
        sow.clickCancelOption();
        sow.selectCancelReason();
        sow.confirmCancelYes();
        logger.info("***Cancel Succesful***");
    }
	

    
    
    
}
