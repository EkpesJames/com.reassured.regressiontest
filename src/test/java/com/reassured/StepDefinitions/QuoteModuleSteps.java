package com.reassured.StepDefinitions;

import com.reassured.base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class QuoteModuleSteps extends BaseClass {

    HomePage homePage;
    Hooks hooks;

    @Given("user is on the home page")
    public void user_is_on_the_home_page() throws Exception {

        hooks = new Hooks();
        //try {
            hooks.openBrowser();
        //} catch (Exception e) {
         //   e.printStackTrace();
       // }

    }

    @And("user clicks Get Quote button")
    public void user_clicks_get_quote_button() {
        homePage = new HomePage(driver);
        homePage.hooverLifeTab();
    }
}
