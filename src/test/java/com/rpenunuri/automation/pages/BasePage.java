package com.rpenunuri.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {

    private final WebDriver _webDriver;
    private SeleniumPageFactory _seleniumPageFactory;

    protected BasePage(WebDriver webDriver) {
        _webDriver = webDriver;
    }

    public SeleniumPageFactory page() {
        _seleniumPageFactory = new SeleniumPageFactory(_webDriver);
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
}