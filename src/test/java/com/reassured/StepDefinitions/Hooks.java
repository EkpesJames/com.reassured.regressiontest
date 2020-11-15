package com.reassured.StepDefinitions;

import com.reassured.base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BaseClass {

    //Scenario scn;
    @Before
    public void openBrowser() throws Exception {
        if (driver == null) {
            setDriver();
            goToHomePage();
            // this.scn = s;
        }
        driver.manage().deleteAllCookies();
    }

    @After
    public void closeBrowser() {

       // TakesScreenshot scs = (TakesScreenshot)driver;
       // byte [] data = scs.getScreenshotAs(OutputType.BYTES);
       // scn.attach(data, "image/png", "TestScreenshots");

        closeDriver();
       // scn.log("Browser is closed");
    }
}
