package com.dgcustomer.testScript;

import org.testng.annotations.Test;

import com.dgcustomer.base.BaseTest;
import com.dgcustomer.payload.OneWay;

public class OneWayTest extends BaseTest {

	

	@Test(priority=1)  //one way booking flow
    public void testHireDriverForOneWay() throws Exception {
		OneWay sow=new OneWay(driver);
		logger.info("***Schedule flow started***");
    	Thread.sleep(5000);
        sow.clickHireDriver();
        sow.clickOneWay();
        sow.enterFromLocation();
        sow.selectCurrentLocation();
        
        sow.enterDestination("Mahalakshmi");
        Thread.sleep(2000);
        sow.selectSuggestion();
        sow.clickScheduleRideBtn();
        sow.clickSelectDateAndTime();
        sow.selectTodayDate();
        sow.clickSelectDateBtn();
        Thread.sleep(3000);
        sow.clickSelectTimeBtn();
        sow.clickDriverUsage();
        sow.selectDriverUsage2hr();
        sow.clickCarType();
        sow.scrollDown();
        sow.selectSUV();
        sow.scrollDown();
        sow.clickContinueBtn();
        Thread.sleep(3000);
        sow.clickConfirmContinueBtn();
        //System.out.println("Preferred Price: " + getBestPrice());
        Thread.sleep(3000);
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
        sow.scrollDown();
        
        sow.clickRescheduleBtn();
        sow.clickRescheduledDate();
        sow.clickRescheduleSelectDateBtn();
        //sow.selectRescheduleHour();
        //sow.selectRescheduleMinute();
        //sow.selectRescheduleAP();
        sow.clickRescheduleSelectTimeBtn();
        Thread.sleep(7000);
        sow.clickRescheduleOkayBtn();
        
        sow.clickConfirmContinueBtn();
        Thread.sleep(3000);
        logger.info("***Reschedule successfull***");
	}
	
	@Test(priority=3) //reschedule the current booking  testcript
    public void testCancelRideForOneWay() throws Exception{
		logger.info("***Cancel Ride Started***");
    	OneWay sow=new OneWay(driver);
        Thread.sleep(2000);
        sow.scrollDown();
        sow.clickCancelRide();
        sow.clickCancelOption();
        sow.selectCancelReason();
        sow.confirmCancelYes();
        logger.info("***Cancel Succesful***");
    }
	

    
    
    
}
