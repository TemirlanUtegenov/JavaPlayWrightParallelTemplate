package org.webPageTests.googleStartPage;

import com.microsoft.playwright.Page;
import org.webPageTests.BasePage;

public class StartPage extends BasePage {
    // Locators
    public String textInputArea = "//div//textArea[@id='APjFqb']";
    public String startSearchButton = "//div//input[@value='Поиск в Google']";


    //Constructor
    public StartPage(Page page) {
        super(page);
    }


}
