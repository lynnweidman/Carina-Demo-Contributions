package com.zebrunner.carina.demo.gui.pages.common;


import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class LoginFormBase extends AbstractPage {

    public LoginFormBase(WebDriver driver) {
        super(driver);
    }

    public abstract void login(String email, String password);

    public abstract void clickLoginIcon();

    public abstract boolean homePageIsOpened();

    public abstract HomePageBase clickSubmitButton();

    public abstract String successfulLogin();

    public abstract String getInvalidEmailText();

}

