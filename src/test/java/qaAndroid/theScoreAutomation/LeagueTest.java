package qaAndroid.theScoreAutomation;

import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import qaAndroid.PageObjects.LeaguePageObjects;


		
	public class LeagueTest extends BaseDriver {
			// TODO Auto-generated method stub


		
			
			@Test(dataProvider="InputData")		
			public void amenityValidation(String input) throws InterruptedException, IOException {
			// TODO Auto-generated method stub

			AndroidDriver<AndroidElement> driver = Capabilities("theScoreApp");

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			
			LeaguePageObjects leaguePage = new LeaguePageObjects(driver);
			
			Thread.sleep(10000);
			
			
			
			leaguePage.getStarted.click();
			
			
			leaguePage.nflFootball.click();
			
			
			leaguePage.continueButton.click();
			
			
			 try {
				 leaguePage.mayBeLater.click();
		        } catch (NoSuchElementException ex) {
		            System.out.println(String.format("may Be later is not present"));
		        }
			
			
			
			
			 
			//Scroll down 
		Dimension dimension= driver.manage().window().getSize();
		
		
		Double scrollHeightStart = dimension.getHeight() * 0.7;
		int scrollStart = scrollHeightStart.intValue();
		
		
		Double scrollHeightEnd = dimension.getHeight() * 0.1;
		int scrollEnd = scrollHeightEnd.intValue();
		
	   
	   new TouchAction((PerformsTouchActions) driver).press(PointOption.point(0,scrollStart ))
	   .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	   .moveTo(PointOption.point(0,scrollEnd))
	   .release().perform();
		
		
		
		
	   
		
     	

		
		
			Thread.sleep(5000);
		
		
			leaguePage.continueButton.click();
			
			leaguePage.doneButton.click();
			
			leaguePage.leagues.click();
			
			
			
			
		/*
		 * League tab
		 */
			
			leaguePage.nhlHockey.click();
			Thread.sleep(5000);
			

			
			
	
			String actual= leaguePage.nhlHockeyTitle.getText();
			System.out.println(actual);
			String expectedTitle= input;
			Assert.assertEquals(actual, expectedTitle);
			
			
			
			
			
			
			
			leaguePage.leaders.click();
			
			String actual1= leaguePage.leaders.getText();
			System.out.println(actual1);
			String expectedTitle1= "LEADERS";
			Assert.assertEquals(actual1, expectedTitle1);
			
			
			
			driver.navigate().back();
			
			
			
			
		}
			
			
			
			
			
			@DataProvider(name="InputData")
			public Object[][] getDataforEditField() {
				
				
				Object[][] obj = new Object[][]
						{
				
					{"NHL HOCKEY"}
				
				
			};
			
			
			return obj;

	}
			
	}


