package com.randomcompany.automation.appium_random_tests;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumBasics {
	
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException {
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 9 Pro XL");
//		options.setApp("D:\\Coding\\Eclipse\\appium-random-tests\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		options.setApp("D:\\Coding\\Eclipse\\appium-random-tests\\src\\test\\java\\resources\\cme.apk");
		
		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		
	}

}
