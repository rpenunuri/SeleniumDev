package com.rpenunuri.automation.pages.epam;

import com.rpenunuri.automation.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EpamCareers extends BasePage {

    @Override
    protected ExpectedCondition readyCondition() {
        return ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".content_container"));
    }

    public EpamCareers(WebDriver webDriver) {
        super(webDriver);
    }

    public EpamCareers enterJobSearchKeywords(String jobSearchKeywords) {
        sendKeys(".job-search-input", jobSearchKeywords);
        return this;
    }

    public EpamCareers clickOnCityFilterArrow() {
        click(".select-box-selection .arrow");
        return this;
    }

    public EpamCareers selectCountryFilter(String country) {
        waitUntil(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".select-box-results")));
        return this;
    }

    public EpamCareers selectCityFilter(String city) {
        return this;
    }
}
