package com.rpenunuri.automation.tests.epam;

import com.rpenunuri.automation.tests.BaseSystemCase;
import org.testng.annotations.Test;

public class EpamJobApply extends BaseSystemCase {

    @Test
    public void testCase() {
        asEpamGuest().clickOnHeaderCareersLink()
                     .enterJobSearchKeywords("Software Engineer in Test")
                     .clickOnCityFilterArrow()
                     .selectCountryFilter("United States")
                     .selectCityFilter("");
    }
}
