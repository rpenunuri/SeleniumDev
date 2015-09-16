package com.rpenunuri.automation.pages.jet;

import com.rpenunuri.automation.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JetSearchResults extends BasePage {

    @Override
    protected ExpectedCondition readyCondition() {
        return ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".results.screen.active"));
    }

    public JetSearchResults(WebDriver webDriver) {
        super(webDriver);
    }

    public JetSearchResults getAllSearchResults() {
        // Create an object that will contain a searchresult, then create a list of them
        return this;
    }

}
