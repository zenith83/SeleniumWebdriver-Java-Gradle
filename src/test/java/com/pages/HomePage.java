package com.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private static final String URL = "https://www.google.com";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void go(){
        webDriver.get(URL);
    }

}

