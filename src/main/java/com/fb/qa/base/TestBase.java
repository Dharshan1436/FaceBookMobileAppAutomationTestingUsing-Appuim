package com.fb.qa.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class TestBase {
    public static Properties prop;
    public static AndroidDriver driver;

    public TestBase() throws IOException {
        prop=new Properties();
        FileInputStream ip = new   FileInputStream("C:\\Users\\dhars\\IdeaProjects\\FaceBookMobileAppTestAutiomation\\src\\main\\java\\com\\fb\\qa\\config\\config.properties");
        prop. load(ip);
    }

    public static void initialization() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:deviceName", "emulator-5554");
        capabilities.setCapability("appium:appPackage", "com.facebook.katana");
        capabilities.setCapability("appium:appActivity", "com.facebook.katana.LoginActivity");
        capabilities.setCapability("appium:platformVersion", "9.0");
        capabilities.setCapability("platformName", "Android");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Facebook server started, automation in progress...");
    }
}
