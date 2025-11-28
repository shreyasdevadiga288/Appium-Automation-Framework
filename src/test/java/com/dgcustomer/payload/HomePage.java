package com.dgcustomer.payload;

import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.Assert;

import com.dgcustomer.utilities.WaitUtils;

import io.appium.java_client.AppiumDriver;

public class HomePage {
	private AppiumDriver driver;
	private By WelcomeMessage=By.xpath("(//android.view.View[starts-with(@content-desc,'Welcome')])[1]\r\n"
			+ "");
	private By oneWayButton=By.xpath("//android.widget.ImageView[@content-desc=\"One Way\"]\r\n"
			+ "");
	private By roundTripButton=By.xpath("//android.widget.ImageView[@content-desc=\"Round Trip\"]\r\n"
			+ "");
	private By outStationButton=By.xpath("//android.widget.ImageView[@content-desc=\"Out Station\"]\r\n"
			+ "");
	private By pickUpLocationTextbox=By.xpath("//android.view.View[@content-desc=\"Enter pick up location\"]");
	private By hireDriverButton=By.xpath("//android.widget.ImageView[@content-desc=\"Hire Driver\"]\r\n"
			+ "");
	private By carWashButton=By.xpath("//android.widget.ImageView[@content-desc=\"Car Wash\"]\r\n"
			+ "");
	private By carServiceButton=By.xpath("//android.view.View[@content-desc=\"Car Service\"]\r\n"
			+ "");
	private By profileNavButton=By.xpath("	\r\n"
			+ "//android.view.View[@content-desc=\"Profile\"]");
	
	private By dgWalletCard = By.xpath("//android.widget.ScrollView/android.view.View[3]/android.view.View/android.widget.ImageView[1]\r\n"
			+ "");
	private By dgCoins      = By.xpath("(//android.widget.ScrollView/android.view.View[4]/android.view.View/android.widget.ImageView[2]");
	private By saveAddress  = By.xpath("(//android.widget.ScrollView/android.view.View[4]/android.view.View/android.widget.ImageView[3]");
	private By dgRewards      = By.xpath("(//android.widget.ScrollView/android.view.View[4]/android.view.View/android.widget.ImageView[4]");
	
	private By dgCoinCard = By.xpath("	\r\n"
			+ "//android.widget.ScrollView/android.view.View[3]/android.view.View/android.widget.ImageView[2]");
	private By addAddressCard = By.xpath("//android.widget.ScrollView/android.view.View[3]/android.view.View/android.widget.ImageView[2]");
	private By dgRewardsCard = By.xpath("//android.widget.ScrollView/android.view.View[3]/android.view.View/android.widget.ImageView[3]");
	
	
	private By hireDriverHeading=By.xpath("//android.view.View[@content-desc=\"Round Trip\"]\r\n"
			+ "");
	private By carWashHeading=By.xpath("//android.view.View[@content-desc=\"Car Wash \"]\r\n"
			+ "");
	private By dgWalletHeading=By.xpath("//android.view.View[@content-desc=\"DG Wallet\"]\r\n"
			+ "");
	private By oneWayHeading=By.xpath("//android.view.View[@content-desc=\"One Way\"]\r\n"
			+ "");
	private By roundTripHeading=By.xpath("//android.view.View[@content-desc=\"Round Trip\"]\r\n"
			+ "");
	private By outStationHeading=By.xpath("//android.view.View[@content-desc=\"Out Station\"]\r\n"
			+ "");
	
	
	private By backButton=By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]\r\n"
			+ "");
	
	public HomePage(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void getWelcomeMessageText() {
		WaitUtils.waitForSeconds(10);
	    String msg= driver.findElement(WelcomeMessage).getAttribute("content-desc");
	    System.out.println("Welcome message is:"+msg);
	}
	public void confirmWelcomeMessage() {
		WaitUtils.waitForSeconds(3);
		String welcomeText = driver.findElement(WelcomeMessage).getAttribute("content-desc");
	    Assert.assertTrue(welcomeText.startsWith("Welcome "),"FAIL — Expected welcome message but got: " + welcomeText);
	}
	public String getOneWayButtonText() {
		WaitUtils.waitForSeconds(3);
	    return driver.findElement(oneWayButton).getAttribute("content-desc");
	}
	public String getRoundTripButtonText() {
		WaitUtils.waitForSeconds(3);
		return driver.findElement(roundTripButton).getAttribute("content-desc");
	}
	
	public String getOutStationButtonText() {
		WaitUtils.waitForSeconds(3);
		return driver.findElement(outStationButton).getAttribute("content-desc");
	}
	
	public String getPickUpLocationText() {
		WaitUtils.waitForSeconds(3);
		return driver.findElement(pickUpLocationTextbox).getAttribute("content-desc");
	}
	public String getHireDriverText() {
		WaitUtils.waitForSeconds(3);
		return driver.findElement(hireDriverButton).getAttribute("content-desc");
	}
	public String getCarWashText() {
		WaitUtils.waitForSeconds(3);
		return driver.findElement(carWashButton).getAttribute("content-desc");
	}
	public String getCarServiceText() {
		WaitUtils.waitForSeconds(3);
		return driver.findElement(carServiceButton).getAttribute("content-desc");
	}
	
	public boolean isDgWalletCardPresent() {
		WaitUtils.waitForSeconds(3);
	    return driver.findElements(dgWalletCard).size() > 0;
	}

	public boolean isDgCoinsPresent() {
		WaitUtils.waitForSeconds(3);
	    return driver.findElements(dgCoinCard).size() > 0;
	}

	public boolean isSaveAddressPresent() {
		WaitUtils.waitForSeconds(3);
	    return driver.findElements(addAddressCard).size() > 0;
	}
	public boolean isDGRewardPresent() {
		WaitUtils.waitForSeconds(3);
	    return driver.findElements(dgRewardsCard).size() > 0;
	}
	
	public void clickProfileBtn() {	
		WaitUtils.waitForSeconds(3);
		Map<String,Object> args=new HashMap<>();
		args.put("x",948 );
		args.put("y", 2098);
		((JavascriptExecutor)driver).executeScript("mobile:clickGesture",args);
	}
	
	public void swipeRightToLeft() {
	    int startX = 916;     // starting X
	    int startY = 1819;    // starting Y
	    int endX = 200;       // swipe left (you can adjust this)
	    int endY = 1819;      // same Y coordinate
	    PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	    Sequence swipe = new Sequence(finger, 1);
	    swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
	    swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	    swipe.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endX, endY));
	    swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	    driver.perform(Collections.singletonList(swipe));
	}
	public boolean clickPickUpLocation() {
		try {
			driver.findElement(pickUpLocationTextbox).click();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	public String isPickUpLocationTextboxNavigated() {
		return driver.findElement(roundTripHeading).getAttribute("content-desc");		 
	}
	public boolean clickOneWay() {
		try {
			driver.findElement(oneWayButton).click();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	public String isOneWayBtnNavigated() {
		return driver.findElement(oneWayHeading).getAttribute("content-desc");		 
	}
	//
	public boolean clickRoundTrip() {
		try {
			driver.findElement(roundTripButton).click();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	public String isRoundTripNavigated() {
		return driver.findElement(roundTripHeading).getAttribute("content-desc");		 
	}
	//
	public boolean clickOutStation() {
		try {
			driver.findElement(outStationButton).click();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	public String isOutStationBtnNavigated() {
		return driver.findElement(outStationHeading).getAttribute("content-desc");		 
	}
	
	//Hire Driver
	public boolean clickHireDriverButton() {
		try {
			driver.findElement(hireDriverButton).click();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	public String isHireDriverBtnNavigated() {
		return driver.findElement(hireDriverHeading).getAttribute("content-desc");		 
	}
	//back btn
	public void clickbackButton() {
		driver.findElement(backButton).click();
	}
	//Car Wash
	public boolean clickCarWashButton() {
	    try {
	        driver.findElement(carWashButton).click();
	        return true;   
	    } catch (Exception e) {
	        return false;   
	    }
	}
	//Car service
	public boolean clickCarServiceBtn() {
		try {
			driver.findElement(carServiceButton).click();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	//wallet
	public boolean clickWalletBtn() {
		try {
			driver.findElement(dgWalletCard).click();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	public String isDgWalletBtnNavigated() {
		return driver.findElement(dgWalletHeading).getAttribute("content-desc");		 
	}
	public boolean clickDgCoin() {
	    try {
	        driver.findElement(dgCoins).click();
	        return false;   
	    } catch (Exception e) {
	        return true;   
	    }
	}
	public boolean clickSaveAddress() {
	    try {
	        driver.findElement(saveAddress).click();
	        return false;   
	    } catch (Exception e) {
	        return true;   
	    }
	}
	
	public boolean clickDgRewards() {
	    try {
	        driver.findElement(dgRewards).click();
	        return false;   
	    } catch (Exception e) {
	        return true;   
	    }
	}
	public void clickSystemBack() {
		driver.navigate().back();
	}
	

	public void hardTap(int x, int y) {
	    PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
	    Sequence hardTap = new Sequence(finger, 1);

	    hardTap.addAction(finger.createPointerMove(Duration.ofMillis(0),
	            PointerInput.Origin.viewport(), x, y));
	    hardTap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

	    // Use pointer move as a "pause" workaround
	    hardTap.addAction(finger.createPointerMove(Duration.ofMillis(200),
	            PointerInput.Origin.viewport(), x, y));

	    hardTap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

	    driver.perform(Collections.singletonList(hardTap));
	}


	
}

