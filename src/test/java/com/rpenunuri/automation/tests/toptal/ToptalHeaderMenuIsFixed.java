package com.rpenunuri.automation.tests.toptal;

import com.rpenunuri.automation.pages.toptal.ToptalHome;
import com.rpenunuri.automation.tests.BaseSystemCase;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ToptalHeaderMenuIsFixed extends BaseSystemCase {

    // This test case validates that the header menu remains fixed even if user scrolls down in home page
    @Test
    public void testCase() {
        ToptalHome toptalHome = asToptalGuest().scrollDownToVideosSection();
        assertThat(toptalHome.isHeaderMenuVisible(), is(true));
    }
}
