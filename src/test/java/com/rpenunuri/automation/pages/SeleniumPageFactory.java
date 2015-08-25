package com.rpenunuri.automation.pages;

import com.rpenunuri.automation.tests.ExecutionContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class SeleniumPageFactory extends PageFactory {
//    private final ExecutionContext _executionContext;
    private final WebDriver _webDriver;

//    public SeleniumPageFactory(ExecutionContext executionContext) {
//        _executionContext = executionContext;
//    }

    public SeleniumPageFactory(WebDriver webDriver) {
        _webDriver = webDriver;
    }

    public JetHome jetHomePage() {
//        return new JetHome(_executionContext.getWebDriver(), this);
//        return PageFactory.initElements(_executionContext.getWebDriver(), JetHome.class);
        return PageFactory.initElements(_webDriver, JetHome.class);
    }
}
