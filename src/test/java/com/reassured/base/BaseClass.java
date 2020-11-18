package com.reassured.base;

import com.google.common.util.concurrent.Uninterruptibles;
import com.reassured.fileReaders.ConfigFileReader;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver = null;
    public static WebDriverWait wait;
    public static ConfigFileReader conf;


    public static void setDriver() {
        conf = new ConfigFileReader();

        System.setProperty("webdriver.chrome.driver", conf.getDriverPath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--start-fullscreen");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 30);
    }

    public static void goToHomePage() {
        driver.get(conf.getApplicationUrl());
        Assert.assertTrue(driver.getTitle().equals("Compare Cheap Life Insurance Quotes | Compare the Market"));
    }

    public static void closeDriver() {
        if (driver == null) {
            return;
        }
        driver.quit();
        driver = null;
    }

    public static void scrollToTheBottomOfThePage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 850)");
    }

    public static void WaitUntilElementVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void uninterruptibleSleep() {
        Uninterruptibles.sleepUninterruptibly(7, TimeUnit.SECONDS);
    }

    public static void zoomInScreen(){
        for(int i=0; i<5; i++){
            driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
        }
    }

    public void zoomOutScreen(){
        for(int i=0; i<5; i++){
            driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
        }
    }

    public void setScreenTo100(){
        driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));
    }

}
