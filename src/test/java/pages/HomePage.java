package pages;

import com.reassured.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BaseClass {

    WebDriverWait wait;

    @FindBy(id = "LifeInsurance_LifeInsurance_LifeHeroBlock_GetAQuoteCTA")
    @CacheLookup
    private WebElement getQuoteButton;

    @FindBy(id = "LifeInsurance_LifeInsurance_CookieBanner_Close")
    private WebElement cookieBanner;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void goToQuotePage() {
        wait.until(ExpectedConditions.visibilityOf(cookieBanner));
        cookieBanner.click();
        wait.until(ExpectedConditions.visibilityOf(getQuoteButton));
        getQuoteButton.click();
        uninterruptibleSleep();
    }

}



