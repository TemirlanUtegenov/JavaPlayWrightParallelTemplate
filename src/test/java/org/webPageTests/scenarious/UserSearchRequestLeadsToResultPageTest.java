package org.webPageTests.scenarious;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.webPageTests.baseTest.BaseWebPageTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UserSearchRequestLeadsToResultPageTest extends BaseWebPageTest {
    @Test
    @DisplayName("User search request leads to result page")
    public void userSearchRequestLeadsToResultPageTest() {
        startPage.enterText(startPage.textInputArea, "playwright parallel execution junit");
        startPage.keyStroke("Enter");
        startPage.waitTillPageDownload();
        assertThat(basePage.getPageUrl()).contains("https://www.google.com/search?");
    }

}