
package com.reassured.StepDefinitions;

import com.reassured.base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;


public class Hooks extends BaseClass {

    @Before
    public void openBrowser() {

        if (driver == null) {
            setDriver();
            goToHomePage();
        }
        driver.manage().deleteAllCookies();
    }

    @After
    public void closeBrowser() {
        closeDriver();
    }

    public void takeScreenshot(String screenshotName) {
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source, new File(resolveTestResourcePath(screenshotName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String resolveTestResourcePath(String filename) {
        File file = new File(String.format("%s%s.png", conf.getScreenshotPath(), filename));
        return file.getAbsolutePath();
    }

}

