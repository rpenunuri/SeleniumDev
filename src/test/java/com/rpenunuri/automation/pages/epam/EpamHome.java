package com.rpenunuri.automation.pages.epam;

import com.rpenunuri.automation.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EpamHome extends BasePage {

    @Override
    protected ExpectedCondition readyCondition() {
        return ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".footer_container"));
    }

    public EpamHome(WebDriver webDriver) {
        super(webDriver);
    }

    public EpamCareers clickOnHeaderCareersLink() {
        click(".tile-menu li:nth-child(5) > a");
        return page().epamCareers();
    }

}
