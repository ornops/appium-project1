package com.randomcompany.automation.appium_random_tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics {
	
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException {
		
		//Automate running the appium server
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Joshua\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 9 Pro XL");
//		options.setApp("D:\\Coding\\Eclipse\\appium-random-tests\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		options.setApp("D:\\Coding\\Eclipse\\appium-random-tests\\src\\test\\java\\resources\\cme.apk");
		
		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//Make appium wait for login button to be displayed fully before clicking it
		wait.until(ExpectedConditions.visibilityOfElementLocated(
		        AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]"))).click();
		
//		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]")).click();
		
		driver.quit();
		service.stop();		
	}

}
