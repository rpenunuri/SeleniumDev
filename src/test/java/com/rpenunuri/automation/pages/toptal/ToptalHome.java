package com.rpenunuri.automation.pages.toptal;

import com.rpenunuri.automation.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ToptalHome extends BasePage {

    @Override
    protected ExpectedCondition readyCondition() {
        return ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".layout-main"));
    }

    public ToptalHome(WebDriver webDriver) {
        super(webDriver);
    }

    public ToptalHome scrollDownToVideosSection() {
        scrollTo("#videos");
        return this;
    }

    public Boolean isHeaderMenuVisible() {
        return !is(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".page_header_menu-items-wrapper")));
    }
}
