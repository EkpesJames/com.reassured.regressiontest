package com.reassured.StepDefinitions;

import com.google.common.util.concurrent.Uninterruptibles;
import com.reassured.base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.QuoteModulePage;

import java.util.concurrent.TimeUnit;

public class QuoteModuleSteps extends BaseClass {

    HomePage homePage;
    QuoteModulePage quotePage;
    Hooks hooks;

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        hooks = new Hooks();
        hooks.openBrowser();
        hooks.takeScreenshot("opening_browser");
    }

    @When("user clicks Get Quote button")
    public void user_clicks_get_quote_button() {
        homePage = new HomePage(driver);
        homePage.goToQuotePage();
        hooks.takeScreenshot("opening_the_quoting_engine");
    }

    @And("I select just myself option")
    public void i_select_just_myself_option() {
        quotePage = new QuoteModulePage(driver);
        quotePage.clickMyselfOption();
        quotePage.clickMrTitle();
    }

    @And("I enter {string} and {string} details")
    public void i_enter_and_details(String Firstname, String Surname) {
        quotePage.enterFirstname(Firstname);
        quotePage.enterSurname(Surname);
    }

    @And("I select date of birth day")
    public void i_select_date_of_birth_day() {
        quotePage.selectDOBDay();
    }

    @And("I select date of birth month")
    public void i_select_date_of_birth_month() {
        quotePage.selectDobMonth();
    }

    @And("I select date of birth year")
    public void i_select_date_of_birth_year() {
        quotePage.selectDobYear();
    }

    @And("I select smoked as No")
    public void i_select_smoked_as_No() {
        quotePage.noToSmoke();
    }

    @And("I select type of cover as level of term")
    public void i_select_type_of_cover_as_level_of_term() {
        quotePage.typeOfCover();
    }

    @And("I enter {string} as terms")
    public void i_enter_as_terms(String Years) {
        quotePage.termsYears(Years);
    }

    @And("I enter sum {string} as sum assured")
    public void i_enter_sum_as_sum_assured(String SumAssured) {
        quotePage.coverAmount(SumAssured);
    }

    @And("I select yes to critical illness Additional")
    public void i_select_yes_to_critical_illness_Additional() {
        quotePage.setCriticalIllness();
        quotePage.setCriticalIllnessType();
    }

    @And("I enter {string} as Critical Illness cover amount")
    public void i_enter_as_Critical_Illness_cover_amount(String Amount) {
        quotePage.setCriticalIllnessAmount(Amount);
    }

    @And("I enter {string} as email address")
    public void i_enter_as_email_address(String Email) {
        quotePage.setEmailAddress(Email);
    }

    @And("I enter {string} as phone number")
    public void i_enter_as_phone_number(String PhoneNumber) {
        quotePage.setPhoneNumber(PhoneNumber);
    }

    @And("I enter {string} as house number")
    public void i_enter_as_house_number(String HouseNumber) {
        quotePage.setHouseNumberOrNameField(HouseNumber);
    }

    @And("I enter {string} as post code")
    public void i_enter_as_post_code(String PostalCode) {
        quotePage.setAddressPostcodeField(PostalCode);
    }

    @And("I click find address")
    public void i_click_find_address() {
        quotePage.clickAddressButton();
    }

    @And("I select Do not contact for Contact Preference")
    public void i_select_Do_not_contact_for_Contact_Preference() {
        quotePage.clickDoNotContactButton();
    }

    @And("I tick confirm for the legal bit")
    public void i_tick_confirm_for_the_legal_bit() {
        quotePage.clickAcceptTermsAndConditionsButton();
    }

    @And("I click Get your quotes button")
    public void i_click_Get_your_quotes_button() {
        quotePage.clickGetYourQuotesButton();
    }

    @And("I capture quote summary")
    public void i_capture_quote_summary() {
        quotePage.verifySummaryDetailsPageTitle();
        uninterruptibleSleep();
        scrollToTheBottomOfThePage();
        uninterruptibleSleep();
        zoomInScreen();
        hooks.takeScreenshot("Capturing_initial_quotes_summary");
    }

    @And("I remove critical illness")
    public void i_remove_critical_illness() {
        quotePage.removeCriticalIllness();
        hooks.takeScreenshot("Capturing_after_removal_of_critical_illness");
    }

    @Then("the result is updated")
    public void the_result_is_updated() {
        quotePage.updateResult();
        uninterruptibleSleep();
        scrollToTheBottomOfThePage();
        uninterruptibleSleep();
        zoomInScreen();
        hooks.takeScreenshot("Capturing_updated_quotes_summary");
        setScreenTo100();
    }

}
