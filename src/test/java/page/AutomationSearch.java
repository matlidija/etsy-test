package page;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutomationSearch extends BaseTest {
    public AutomationSearch(){
        PageFactory.initElements(driver, this);
    }

    private static final By classLink = By.xpath("(//li[@class=\"wt-list-unstyled wt-grid__item-xs-6 wt-grid__item-md-4 wt-grid__item-lg-3 wt-order-xs-0 wt-order-md-0 wt-order-lg-0 wt-show-xs wt-show-md wt-show-lg\"])[2]");
    private static final By favoriteLink = By.xpath("(//div[@class=\"favorite-listing-button-icon-container should-animate \"])[2]");


    @FindBy(xpath = "//span[@class=\"wt-hide-xs wt-show-md filter-expander\"]")
    WebElement allfiltersButton;
    @FindBy(xpath = "//label[@for=\"special-offers-free-shipping\"]")
    WebElement checkboxFree;
    @FindBy(xpath = "//label[@for=\"max-processing-days-3\"]")
    WebElement checkboxDays;
    @FindBy(xpath = "//label[@for=\"price-input-1\"]")
    WebElement checkboxUnder;
    @FindBy(xpath = "//button[@class=\"wt-btn wt-btn--primary wt-width-full wt-mt-xs-3 wt-mb-xs-3 wt-mr-xs-3\"]")
    WebElement applyButton;
    @FindBy(xpath = "//ul[@class=\"wt-list-unstyled wt-pb-xs-1 child-mb-xs-1 child-mr-xs-1\"]")
    WebElement resultsItem;
    @FindBy(xpath = "//div[@class=\" search-ingress-redesign-row__item wt-break-word\"][2]")
    WebElement itemsTag;
    @FindBy(xpath = "(//button[@data-favorite-label=\"Add to Favorites\"])[3]")
    WebElement favoritesItem;
    @FindBy(xpath = "//span[@class=\"wt-tooltip wt-tooltip--disabled-touch\"]")
    WebElement favoritesItemsList;

    public void addFavoriteIcon(){
        WebElement clickClassLink = driver.findElement(classLink);
        wdwait.until(ExpectedConditions.elementToBeClickable(classLink));
        WebElement clickFavoriteLink = driver.findElement(favoriteLink);
        Actions hoverFavorite = new Actions(driver);
        hoverFavorite.moveToElement(clickClassLink);
        hoverFavorite.moveToElement(clickFavoriteLink);
        hoverFavorite.click().build().perform();
    }

    public void clickFavoritesItemsList(){
        wdwait.until(ExpectedConditions.elementToBeClickable(favoritesItemsList));
        favoritesItemsList.click();

    }

    public AutomationSearch clickFavoritesItem(){
        wdwait.until(ExpectedConditions.elementToBeClickable(favoritesItem));
        favoritesItem.click();
        return this;
    }

    public AutomationSearch clickItemsTag(){
        wdwait.until(ExpectedConditions.elementToBeClickable(itemsTag));
        itemsTag.click();
        return this;
    }

    public String resultsItemIsGetText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(resultsItem));
        return resultsItem.getText();
    }

    public boolean resultsItemIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(resultsItem));
        return resultsItem.isDisplayed();
    }

    public void clickApplyButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(applyButton));
        applyButton.click();

    }

    public AutomationSearch clickCheckboxUnder(){
        wdwait.until(ExpectedConditions.elementToBeClickable(checkboxUnder));
        checkboxUnder.click();
        return this;
    }

    public AutomationSearch clickCheckboxDays(){
        wdwait.until(ExpectedConditions.elementToBeClickable(checkboxDays));
        checkboxDays.click();
        return this;
    }

    public AutomationSearch clickCheckboxFree(){
        wdwait.until(ExpectedConditions.elementToBeClickable(checkboxFree));
        checkboxFree.click();
        return this;
    }

    public AutomationSearch clickallfiltersButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(allfiltersButton));
        allfiltersButton.click();
        return this;
    }


}
