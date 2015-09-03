package com.rpenunuri.automation.pages;

import com.rpenunuri.automation.util.Condition;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    private final WebDriver _webDriver;
    private final SeleniumPageFactory _seleniumPageFactory;
    private static final long DEFAULT_TIMEOUT_IN_SECONDS = 10;
    private static final long DEFAULT_SLEEP_TIME_IN_SECONDS = 1;

    protected abstract ExpectedCondition readyCondition();

    protected BasePage(WebDriver webDriver) {
        _webDriver = webDriver;
        _seleniumPageFactory = new SeleniumPageFactory(_webDriver);
        waitUntil(readyCondition());
    }

    protected SeleniumPageFactory page() {
        return _seleniumPageFactory;
    }

    protected void sendKeys(String cssSelector, String keys) {
        findElement(cssSelector).sendKeys(keys);
    }

    protected void click(String cssSelector) {
        findElement(cssSelector).click();
    }

    protected WebElement findElement(String cssSelector) {
        return findElement(By.cssSelector(cssSelector));
    }

    private WebElement findElement(By by) {
        return _webDriver.findElement(by);
    }

    protected void waitUntilElementContainsExpectedText(final String cssSelector, String expectedText){
        waitUntil(Condition.elementContainsExpectedText(cssSelector, expectedText));
    }

    protected void waitUntil(ExpectedCondition expectedCondition) {
        new FluentWait<>(_webDriver)
                .withTimeout(DEFAULT_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
                .pollingEvery(DEFAULT_SLEEP_TIME_IN_SECONDS, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class)
                .until(expectedCondition);
    }

    protected Boolean is(ExpectedCondition expectedCondition) {
        return (Boolean) expectedCondition.apply(_webDriver);
    }
}
