package pages;

import com.google.common.util.concurrent.Uninterruptibles;
import com.reassured.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class QuoteModulePage extends BaseClass {

    WebDriverWait wait;
    JavascriptExecutor executor;


    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourDetails_WhoToCover_JM']")
    private WebElement MySelfOptionButton;

    @FindBy(xpath = "//div[@id='LifeInsurance_YourDetails_YourDetails_YourTitle']/div/label/input")
    private WebElement title;

    @FindBy(id = "LifeInsurance_YourDetails_YourDetails_YourFirstName")
    private WebElement firstnameField;

    @FindBy(id = "LifeInsurance_YourDetails_YourDetails_YourLastName")
    private WebElement surnameField;

    @FindBy(id = "LifeInsurance_YourDetails_YourDetails_YourDateOfBirth_Day")
    private WebElement dateOfBirthDay;

    @FindBy(id = "LifeInsurance_YourDetails_YourDetails_YourDateOfBirth_Month")
    private WebElement dateOfBirthMonth;

    @FindBy(id = "LifeInsurance_YourDetails_YourDetails_YourDateOfBirth_Year")
    private WebElement dateOfBirthYear;

    @FindBy(id = "LifeInsurance_YourDetails_YourDetails_YourSmoke_NO")
    private WebElement noSmoke;

    @FindBy(id = "LifeInsurance_YourDetails_YourLifeCover_CoverType_LT")
    private WebElement levelTerm;

    @FindBy(id = "LifeInsurance_YourDetails_YourLifeCover_TermYears")
    private WebElement coverTerms;

    @FindBy(id = "LifeInsurance_YourDetails_YourLifeCover_CoverAmount")
    private WebElement sumInsured;

    @FindBy(id = "LifeInsurance_YourDetails_YourLifeCover_CriticalIllnessCover_YES")
    private WebElement criticalIllness;

    @FindBy(id = "LifeInsurance_YourDetails_YourLifeCover_CriticalIllnessCoverType_A")
    private WebElement CriticalIllnessAdditional;

    @FindBy(id = "LifeInsurance_YourDetails_YourLifeCover_CriticalIllnessAmount")
    private WebElement criticalIllnessAmount;

    @FindBy(id = "LifeInsurance_YourDetails_YourContactDetails_EmailAddress")
    private WebElement emailAddressField;

    @FindBy(id = "LifeInsurance_YourDetails_YourContactDetails_PhoneNumber")
    private WebElement phoneNumberField;

    @FindBy(id = "LifeInsurance_YourDetails_YourContactDetails_Address_HouseNumberOrName")
    private WebElement houseNumberOrNameField;

    @FindBy(id = "LifeInsurance_YourDetails_YourContactDetails_Address_Postcode")
    private WebElement addressPostcodeField;

    @FindBy(id = "Address_FindMyAddress")
    private WebElement findAddressButton;

    @FindBy(id = "LifeInsurance_YourDetails_ContactPreferences_ContactPreferences_doNotContact")
    private WebElement doNotContactButton;

    @FindBy(id = "LifeInsurance_YourDetails_TheLegalBit_AcceptTermsAndConditions")
    private WebElement acceptTermsAndConditionsButton;

    @FindBy(css = ".Button__primary")
    private WebElement getQuoteButton;

    @FindBy(id = "LifeInsurance_YourQuotes_Filter_CriticalIllnessCover_Remove")
    private WebElement removeButton;

    @FindBy(id = "LifeInsurance_YourQuotes_Filter_FilterResults_UpdateResults")
    private WebElement updateResultsButton;


    public QuoteModulePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(BaseClass.driver, 30);
        this.executor = (JavascriptExecutor) this.driver;
        PageFactory.initElements(BaseClass.driver, this);
    }

    public void clickMyselfOption() {
        WebElement radioBTN = MySelfOptionButton;
        radioBTN.isSelected();
        radioBTN.click();
        uninterruptibleSleep();
    }

    public void clickMrTitle() {
        WebElement radioTitle = title;
        radioTitle.isSelected();
        radioTitle.click();
        uninterruptibleSleep();
    }

    public void enterFirstname(String firstname) {
        wait.until(ExpectedConditions.visibilityOf(firstnameField));
        firstnameField.clear();
        firstnameField.sendKeys(firstname);
        uninterruptibleSleep();
    }

    public void enterSurname(String surname) {
        wait.until(ExpectedConditions.visibilityOf(surnameField));
        surnameField.clear();
        surnameField.sendKeys(surname);
        uninterruptibleSleep();
    }

    public void selectDOBDay() {
        Select day = new Select(dateOfBirthDay);
        day.selectByValue("6");
        uninterruptibleSleep();
    }

    public void selectDobMonth() {
        Select month = new Select(dateOfBirthMonth);
        month.selectByVisibleText("January");
        uninterruptibleSleep();
    }

    public void selectDobYear() {
        Select year = new Select(dateOfBirthYear);
        year.selectByValue("1980");
        uninterruptibleSleep();
    }

    public void noToSmoke() {
        WebElement smoked = noSmoke;
        smoked.isSelected();
        smoked.click();
        uninterruptibleSleep();
    }

    public void typeOfCover() {
        WebElement coverType = levelTerm;
        coverType.isSelected();
        coverType.click();
        uninterruptibleSleep();
    }

    public void termsYears(String years) {
        coverTerms.clear();
        coverTerms.sendKeys(years);
        uninterruptibleSleep();
    }

    public void coverAmount(String sum) {
        sumInsured.clear();
        sumInsured.sendKeys(sum);
        uninterruptibleSleep();
    }

    public void setCriticalIllness() {
        WebElement radioCriticalIllness = criticalIllness;
        radioCriticalIllness.isSelected();
        radioCriticalIllness.click();
        uninterruptibleSleep();
    }

    public void setCriticalIllnessType() {
        WebElement CriticalIllnessAddition = CriticalIllnessAdditional;
        CriticalIllnessAddition.isSelected();
        CriticalIllnessAddition.click();
        uninterruptibleSleep();
    }

    public void setCriticalIllnessAmount(String amount) {
        criticalIllnessAmount.clear();
        criticalIllnessAmount.sendKeys(amount);
        uninterruptibleSleep();
    }

    public void setEmailAddress(String email) {
        emailAddressField.clear();
        emailAddressField.sendKeys(email);
        uninterruptibleSleep();
    }

    public void setPhoneNumber(String phone) {
        phoneNumberField.clear();
        phoneNumberField.sendKeys(phone);
        uninterruptibleSleep();
    }

    public void setHouseNumberOrNameField(String houseNumber) {
        houseNumberOrNameField.clear();
        houseNumberOrNameField.sendKeys(houseNumber);
        uninterruptibleSleep();
    }

    public void setAddressPostcodeField(String postcode) {
        addressPostcodeField.clear();
        addressPostcodeField.sendKeys(postcode);
        uninterruptibleSleep();
    }

    public void clickAddressButton() {
        wait.until(ExpectedConditions.visibilityOf(findAddressButton));
        findAddressButton.click();
        uninterruptibleSleep();
    }

    public void clickDoNotContactButton() {
        WebElement doNotContact = doNotContactButton;
        doNotContact.isSelected();
        doNotContact.click();
        uninterruptibleSleep();
    }

    public void clickAcceptTermsAndConditionsButton() {
        WebElement acceptTerms = acceptTermsAndConditionsButton;
        acceptTerms.isSelected();
        acceptTerms.click();
        uninterruptibleSleep();
    }

    public void clickGetYourQuotesButton() {
        getQuoteButton.click();
        uninterruptibleSleep();
    }

    public void verifySummaryDetailsPageTitle() {
        Assert.assertTrue(driver.getTitle().equals("Compare the Market - Life Insurance"));
    }

    public void removeCriticalIllness() {
        wait.until(ExpectedConditions.visibilityOf(removeButton));
        removeButton.click();
    }

    public void updateResult() {
        wait.until(ExpectedConditions.visibilityOf(updateResultsButton));
        updateResultsButton.click();
        uninterruptibleSleep();
    }

}
