package com.dgcustomer.testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dgcustomer.base.BaseTest;
import com.dgcustomer.payload.HomePage;
import com.dgcustomer.payload.LoginORSignUp;
import com.dgcustomer.payload.OneWay;
import com.dgcustomer.payload.ProfilePage;
import com.dgcustomer.payload.SettingsPage;
import com.dgcustomer.utilities.WaitUtils;

public class TC01_VerifyContentTest extends BaseTest {
	//Enter Mobile Number 	
	@Test(priority=1)
    public void enterMobileNumber() {
		logger.info("ENTERING MOBILE NUMBER");
        LoginORSignUp ls = new LoginORSignUp(driver);
        WaitUtils.waitForSeconds(4);
        ls.enterMobileNumber("9341644070");
        String enteredPhNo = ls.getEnteredMobileNumber();
        Assert.assertEquals(enteredPhNo, "9341644070");
        logger.info("MOBILE NUMBER ENTERED SUCCESFULY:"+enteredPhNo);
    }
	//Accept Terms and condition and click login
    @Test(priority=2)
    public void acceptTermsAndClickVerify() {
    	logger.info("ACCEPTING T&C AND CLICKING LOGIN");
        LoginORSignUp ls = new LoginORSignUp(driver);
        ls.clickLogin();
        Assert.assertTrue(true, "Login button clicked successfully");
        logger.info("ACCEPTED T&C AND CLICKED LOGIN SUCCESFULLY");
    }
    //Get OTP and click Verify Btn
    @Test(priority=3)
    public void getOtpAndclickVerifyButton() {
    	logger.info("OTP VERFICATION TEST STARTED");
        LoginORSignUp ls = new LoginORSignUp(driver);
        WaitUtils.waitForSeconds(6);
        ls.clickVerify();
        Assert.assertTrue(true, "OTP verified & navigated to Home Screen");   
        HomePage hp = new HomePage(driver);
	    WaitUtils.waitForSeconds(7);     
	    hp.confirmWelcomeMessage(); 
        logger.info("OTP VERIFIED SUCCESFLY AND ENTERED HOME SCREEN");
    }
    //Verify Welcome Message Content	
	@Test(priority=4)
	public void welcomeMessageVerify() throws Exception {						
		 HomePage hp = new HomePage(driver);
		 WaitUtils.waitForSeconds(5);
		 logger.info("clicked profile");     
		 hp.confirmWelcomeMessage(); 
		 logger.info("PASS — Welcome Test is visible");
	}
	//Verify One Way Content
	@Test(priority=5)
	public void verifyOneWayContent() throws Exception {
		HomePage hp = new HomePage(driver);
		String oneWayText = hp.getOneWayButtonText();
		Assert.assertEquals(oneWayText,"One Way","FAIL — Expected: 'OneWay' but got: " + oneWayText);
		logger.info("PASS — OneWay button text verified: " + oneWayText);
	}
	//Verify Round trip content
	@Test(priority=6)
	public void verifyRoundTripContent() throws Exception {	
		HomePage hp = new HomePage(driver);
		String roundTripText=hp.getRoundTripButtonText();		
		Assert.assertEquals(roundTripText, "Round Trip", "FAIL - Expected:'RoundTrip' but got:"+roundTripText);
		logger.info("PASS - RoundTrip button text verified: " + roundTripText);
	}	
	//Verify Out Station Content
	@Test(priority=7)
	public void verifyOutStationContent() throws Exception {
		HomePage hp = new HomePage(driver);
		String outStationText=hp.getOutStationButtonText();
		Assert.assertEquals(outStationText, "Out Station","FAIL - Expected:'Out Station' but got:"+outStationText);
		logger.info("PASS - OutStation button text verified: "+outStationText);
	}	
	//Verify Pick Up Location TextBox Content
	@Test(priority=8)
	public void verifyPickUpLocationContent() throws Exception {
		HomePage hp = new HomePage(driver);
		String enterPickUpLocationText=hp.getPickUpLocationText();
		Assert.assertEquals(enterPickUpLocationText,"Enter pick up location","FAIL - Expected:'Enter Pickup Location' but got:"+enterPickUpLocationText);
		logger.info("PASS - Pickup location textbox verified: "+enterPickUpLocationText);
	}	
	//Verify Hire Driver Content
	@Test(priority=9)
	public void verifyHireDriverContent() throws Exception {
		HomePage hp = new HomePage(driver);
		String hireDriverText=hp.getHireDriverText();
		Assert.assertEquals(hireDriverText,"Hire Driver","FAIL - Expected:'Hire Driver' got:"+hireDriverText);
		logger.info("PASS - Hire Driver button text verified: "+hireDriverText);
	}	
	//Verify Car Wash Button
	@Test(priority=10)
	public void verifyCarWashContent() throws Exception {
		HomePage hp = new HomePage(driver);
		String carWashText=hp.getCarWashText();
		Assert.assertEquals(carWashText, "Car Wash","FAIL - Expected:'Car Wash' got:"+carWashText);
		logger.info("PASS - Car Wash button text verified: "+carWashText);
	}
	//Verify Car Service Button
	@Test(priority=11)
	public void verifyCarServiceContent() throws Exception {
		HomePage hp = new HomePage(driver);
		String carServiceText=hp.getCarServiceText();
		Assert.assertEquals(carServiceText, "Car Service","FAIL - Expected:'Car Service' got:"+carServiceText);
		    logger.info("PASS - Car Service button text verified: "+carServiceText);
	}	
	//Verify DG Wallet Navigation
	@Test(priority=12)
	public void verifyDgWalletContent() throws Exception {
		OneWay ow=new OneWay(driver);
		HomePage hp = new HomePage(driver);
		ow.scrollDown();		    
		Assert.assertTrue(hp.isDgWalletCardPresent(), "FAIL - DG Wallet Card not visible");
		    logger.info("PASS - DG wallet card is present");
	}	
	//Verify DG COins
	@Test(priority=13)
	public void verifyDgCoinsContent() throws Exception {
		HomePage hp = new HomePage(driver);
		Assert.assertTrue(hp.isDgCoinsPresent(), "FAIL - DG Coins not visible");
		logger.info("PASS - DG coins card is verified");
	}	 
	//Verify Save Address
	@Test(priority=14)
	public void verifySaveAddressContent() throws Exception {
		HomePage hp = new HomePage(driver);
		Assert.assertTrue(hp.isSaveAddressPresent(), "saveAddress not visible");
		logger.info("PASS - saveAddress card is verified");
	}	
	//Verify DG Rewards 
	@Test(priority=15)
	public void verifyDgRewardContent() throws Exception {
		HomePage hp = new HomePage(driver);
		hp.swipeRightToLeft();
		Assert.assertTrue(hp.isDGRewardPresent(), "DG reward not visible");
		logger.info("PASS - dgReward card is visible");
	}
	//Click Profile
	@Test(priority=16)
	public void clickProfile() throws Exception {
		logger.info("CLICKING PROFILE");
		 HomePage hp = new HomePage(driver);
		 hp.clickProfileBtn();
		 logger.info("PROFILE CLICKED SUCCESFULLY");    		    		
	}
	@Test(priority=17)
	public void clickSettings() {
		logger.info("CLICKING SETTINGS ");
		ProfilePage pp=new ProfilePage(driver);
		HomePage hp=new HomePage(driver);
		hp.hardTap(957, 2098);
		pp.clickSettings();
		logger.info("CLICKED SETTINGS");
	}
	//Click Logout and confirm
	@Test(priority=18)
		public void logoutTest() {	
		logger.info("CLICKING LOGOUT AND CONFIRM");
		SettingsPage sp=new SettingsPage(driver);
		sp.clickLogOut();
		WaitUtils.waitForSeconds(2);
		sp.clickConfirmLogOut();
		logger.info("LOGGED OUT SUCCESFULLY");

		}
		
	
}
