package org.webPageTests.baseTest;

import com.microsoft.playwright.Playwright;
import org.common.handlers.PathHandler;
import org.common.pageObject.BasePage;
import org.common.pageObject.googleStartPage.StartPage;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseWebPageTest extends BaseUiScript {

    @BeforeAll
    public void setupAll() {
        pathHandler = new PathHandler();
        home = pathHandler.getBaseWebAppUrl();
        playwright = Playwright.create();
        browser = playwright.chromium().launch(setLaunchOptions());
    }

    @BeforeEach
    public void createContextAndPage() {
        context = browser.newContext(setContextOptions());
        page = context.newPage();
        basePage = new BasePage(page);
        startPage = new StartPage(page);
        basePage.navigateToGoogleStartPage(pathHandler);
    }

    @AfterEach
    public void closeContext() {
        page.context().close();
    }

    @AfterAll
    public void cleanAll() {
        playwright.close();
    }
}
