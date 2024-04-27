package org.webPageTests;

import com.microsoft.playwright.Page;
import org.common.handlers.PathHandler;

public class BasePage {
    protected final Page page;

    public BasePage(Page page) {
        this.page = page;
    }

    public void waitTillPageDownload() {
        page.waitForTimeout(2500);
    }

    public String getPageTitle() {
        waitTillPageDownload();
        return this.page.title();
    }

    public String getPageUrl() {
        waitTillPageDownload();
        return this.page.url();
    }

    public String getElementText(String locator) {
        return page.textContent(locator);
    }

    public BasePage clickElement(String locator) {
        page.click(locator);
        return this;
    }

    public BasePage enterText(String locator, String value) {
        page.fill(locator, value);
        return this;
    }

    public void navigateToGoogleStartPage(PathHandler pathHandler) {
        page.navigate(pathHandler.getBaseWebAppUrl());
    }
}