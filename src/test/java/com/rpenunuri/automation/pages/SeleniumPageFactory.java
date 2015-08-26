package com.rpenunuri.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class SeleniumPageFactory extends PageFactory {
    private final WebDriver _webDriver;


    public SeleniumPageFactory(WebDriver webDriver) {
        _webDriver = webDriver;
    }

    public JetHome jetHome() {
        return initElements(_webDriver, JetHome.class);
    }

    public JetSearchResults jetSearchResults() {
        return initElements(_webDriver, JetSearchResults.class);
    }
}
