package com.rpenunuri.automation.tests.jet;

import com.rpenunuri.automation.pages.jet.JetSearchResults;
import com.rpenunuri.automation.tests.BaseSystemCase;
import org.testng.annotations.Test;

public class JetSearchExistingItem extends BaseSystemCase {

    @Test
    public void testCase() {
        JetSearchResults jetSearchResults = asJetGuest().closeOutsideOfTheUSModalDialog().performSearch("tylenol").clickOnGoSearchButton();
    }
}
