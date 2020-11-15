package com.reassured.base;

import com.reassured.drivers.fileReaders.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BaseClass {

    public static WebDriver driver = null;
    static ConfigFileReader conf;

    public static void setDriver(){
        conf = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver", conf.getDriverPath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
    }

    public static void goToHomePage(){
        driver.get(conf.getApplicationUrl());
        Assert.assertTrue(driver.getTitle().equals("Compare Cheap Life Insurance Quotes | Compare the Market"));
    }

    public static void closeDriver(){
        if (driver == null) {
            return;
        }
        driver.quit();
        driver = null;
    }

}
