package com.rpenunuri.automation.pages;


import org.openqa.selenium.WebDriver;

public class JetHome extends BasePage {

    public JetHome(WebDriver webDriver) {
        super(webDriver);
    }

    public JetHome performSeach(String search) {
        sendKeys(".top .search_form input.tt-input", search);
        return this;
    }

    public JetSearchResults clickOnGoSearchButton() {
        click(".top .search_form .submit");
        return page().jetSearchResults();
    }
}
