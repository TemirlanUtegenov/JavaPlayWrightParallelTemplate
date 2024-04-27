package org.webPageTests.baseTest;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.ColorScheme;
import org.ConfProperties;
import org.common.handlers.PathHandler;
import org.common.pageObject.BasePage;
import org.common.pageObject.googleStartPage.StartPage;

import java.util.Objects;

public class BaseUiScript {
    protected static PathHandler pathHandler;
    protected static String home;
    protected Playwright playwright;
    protected Browser browser;
    protected static BrowserType.LaunchOptions launchOptions;
    protected static Browser.NewContextOptions contextOptions;
    protected BasePage basePage;
    protected StartPage startPage;

    protected BrowserContext context;
    protected Page page;
    protected String userId, email, name, password;

    protected Browser.NewContextOptions setContextOptions() {
        contextOptions = new Browser.NewContextOptions();
        contextOptions
                .setViewportSize(430, 923)
                .setIsMobile(true)
                .setLocale("en-US")
                .setTimezoneId("Europe/Berlin")
                .setColorScheme(ColorScheme.LIGHT);
        return contextOptions;
    }

    protected BrowserType.LaunchOptions setLaunchOptions() {
        launchOptions = new BrowserType.LaunchOptions();
        launchOptions.setHeadless(isHeadless());
        launchOptions.setSlowMo(isSlowMo());
        return launchOptions;
    }

    private boolean isHeadless() {
        return Objects.equals(ConfProperties.getFileProperty("HEADLESS_TESTING"), "true");
    }

    private double isSlowMo() {
        if (Objects.equals(ConfProperties.getFileProperty("SLOWMO"), "true")) {
            return Double.parseDouble(ConfProperties.getFileProperty("SLOWMORATE"));
        } else return 0;
    }

}
