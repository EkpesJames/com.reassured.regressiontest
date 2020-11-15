package pages;

import com.google.common.util.concurrent.Uninterruptibles;
import com.reassured.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class HomePage extends BaseClass {
    WebDriverWait wait = new WebDriverWait(driver, 60);


    @FindBy(id = "LifeInsurance_LifeInsurance_LifeHeroBlock_GetAQuoteCTA")
    @CacheLookup
    private WebElement getQuoteButton;

    @FindBy(id = "LifeInsurance_LifeInsurance_CookieBanner_Close")
    private WebElement cookieBanner;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void hooverLifeTab(){
        wait.until(ExpectedConditions.visibilityOf(cookieBanner));
        cookieBanner.click();
        wait.until(ExpectedConditions.visibilityOf(getQuoteButton));
        getQuoteButton.click();
        Uninterruptibles.sleepUninterruptibly(60, TimeUnit.SECONDS);
    }

}



