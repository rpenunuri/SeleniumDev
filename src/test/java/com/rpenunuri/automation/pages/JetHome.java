package com.rpenunuri.automation.pages;


import org.openqa.selenium.WebDriver;

public class JetHome extends BasePage {

    public JetHome(WebDriver webDriver) {
        super(webDriver);
        //super(webDriver, seleniumPageFactory);
    }

    public JetHome performSeach(String search) {
        sendKeys(".top .search_form input.tt-input", search);
        return this;
    }

    public JetHome clickOnGoSearchButton() {
        click(".top .search_form .submit");
        return this;
    }
}
