package qaAndroid.PageObjects;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


	public class LeaguePageObjects {
		
		
		public LeaguePageObjects(AndroidDriver<AndroidElement> driver) {

			PageFactory.initElements(new AppiumFieldDecorator(driver), this);

		}

			
		

	
	/*
	 * Get Started
	 */
		
		
		 @AndroidFindBy(xpath = "//android.widget.TextView[@text='Get Started']")
         public MobileElement getStarted;
		 
		 @AndroidFindBy(xpath = "//android.widget.TextView[@text='NFL Football']")
         public MobileElement nflFootball;
		 
		 @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Continue')]")
         public MobileElement continueButton;
		 
		 
		 @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Maybe Later')]")
         public MobileElement mayBeLater;
		 

	     @AndroidFindBy(accessibility = "NFL")
	     public MobileElement NFL;
	 	
	     
	     
	     
		 @AndroidFindBy(xpath = "//android.widget.TextView[@text='Seattle Seahawks']")
         public MobileElement Seahawks;
		 
		 
		
		 @AndroidFindBy(xpath = "//android.widget.TextView[@text='Done']")
         public MobileElement doneButton;
		 
				 
		 @AndroidFindBy(xpath = "//android.widget.TextView[@text='Leagues']")
         public MobileElement leagues;
		 
		 
		 
		 
		 
		 
		 ///* League screen*////
		 
		 @AndroidFindBy(xpath = "//android.widget.TextView[@text='NHL Hockey']")
         public MobileElement nhlHockey;
		 
			
		 
		 @AndroidFindBy(xpath = "//android.widget.TextView[@text='NHL HOCKEY']")
         public MobileElement nhlHockeyTitle;
		 
		 
			
			
		 
		 @AndroidFindBy(xpath = "//android.widget.TextView[@text='LEADERS']")
         public MobileElement leaders;
		 
		 
		
		 
}	
	
