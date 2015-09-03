package com.rpenunuri.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JetHome extends BasePage {

    @Override
    protected ExpectedCondition readyCondition() {
        return ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#page_content"));
    }

    public JetHome(WebDriver webDriver) {
        super(webDriver);
    }

    public JetHome performSearch(String search) {
        sendKeys(".top .search_form input.tt-input", search);
        return this;
    }

    public JetSearchResults clickOnGoSearchButton() {
        click(".top .search_form .submit");
        return page().jetSearchResults();
    }

    public JetHome closeOutsideOfTheUSModalDialog() {
        if(isOutsideOfTheUSModalDialogDisplayed()) {
            click(".modal_close");
        }
        return this;
    }

    public boolean isOutsideOfTheUSModalDialogDisplayed() {
        return is(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".modal_close")));
//        return is(Condition.elementIsDisplayed(".modal_close"));
    }
}
