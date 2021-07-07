package qaAndroid.theScoreAutomation;

import org.testng.annotations.DataProvider;

public class TestData {

	
	@DataProvider(name="InputData")
	public Object[][] getDataforEditField() {
		
		
		Object[][] obj = new Object[][]
				{
		
			{"NHL HOCKEY"}
		
		
	};
	
	
	return obj;
	
}
}