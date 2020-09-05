package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {

	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) 
	{
		try {
			openCal();
		} catch (MalformedURLException e) {
			
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
		public static void openCal() throws MalformedURLException 
		{
		
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "Samsung J7");
			cap.setCapability("udid", "3100ea4c8f383301");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "6.0.1");
			
			cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
			cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
			
			URL url = new URL ("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url,cap);
			System.out.println("Application started");
			MobileElement four = driver.findElementById("com.sec.android.app.popupcalculator:id/bt_04");
			MobileElement Five = driver.findElementById("com.sec.android.app.popupcalculator:id/bt_04");
			
			
			
		}
		

	}


