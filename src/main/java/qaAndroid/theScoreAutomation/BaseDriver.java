package qaAndroid.theScoreAutomation;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseDriver {

	public static AndroidDriver<AndroidElement> driver;

	public static AndroidDriver<AndroidElement> Capabilities(String appName) throws InterruptedException, IOException {
	

		Properties prop = new Properties();

		String projectPath = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(projectPath + "/src/test/java/config.Properties");

		prop.load(fis);

		File f = new File(prop.getProperty(appName));

		DesiredCapabilities d = new DesiredCapabilities();

		Thread.sleep(10000);

		d.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		System.out.println("Automation Name: UIAutomator2");
		Thread.sleep(10000);

		d.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		System.out.println("Platform Name: Android");
		Thread.sleep(10000);

		d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		System.out.println("Platform Version: 8.1.0");
		Thread.sleep(10000);

		String deviceName = prop.getProperty("device");
		// DESIRED CAPABILITIES: Set the Device name
		d.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		System.out.println("Device Name: Nexus6Shobhna");
		
		// cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus6Shobhna");
		Thread.sleep(10000);

		d.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
		System.out.println("theScore App added");

		Thread.sleep(10000);

		System.out.println("Connect with Appium");
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), d);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		Thread.sleep(10000);
		

		return driver;

	}
}