package org.webPageTests.scenarious;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.webPageTests.baseTest.BaseWebPageTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class UserNavigateToStartPageTest extends BaseWebPageTest {

    @Test
    @DisplayName("user can navigate to google start page")
    public void userCanNavigateToGoogleStartPageTest() {
        assertThat(startPage.getPageUrl()).isEqualTo("https://www.google.com/");
    }

    @Test
    @DisplayName("Google input field is present on startPage")
    public void inputFieldIsPresentOnStartPageTest() {
        assertThat(startPage.textInputArea).isVisible();
    }
}
