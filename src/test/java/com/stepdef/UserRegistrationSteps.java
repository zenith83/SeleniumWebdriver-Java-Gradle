package com.stepdef;

import com.common.BrowserFactory;
import com.pages.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;

public class UserRegistrationSteps extends BaseSteps {

    @Before
    public void setUp() {
        webDriver = BrowserFactory.INSTANCE.getWebDriver();
        homePage = PageFactory.initElements(webDriver, HomePage.class);
    }

    @After
    public void tearDown(){
        webDriver.close();
    }

    @Given("^I navigate to the home page$")
    public void I_navigate_to_the_home_page() throws Throwable {
        homePage.go();

    }

}