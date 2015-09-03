package com.rpenunuri.automation.tests.jet;

import com.rpenunuri.automation.tests.BaseSystemTestCase;
import org.testng.annotations.Test;

public class JetSearchExistingItem extends BaseSystemTestCase {

    @Test
    public void testSenario() {
        asJetGuest().closeOutsideOfTheUSModalDialog().performSeach("tylenol").clickOnGoSearchButton();
    }
}
