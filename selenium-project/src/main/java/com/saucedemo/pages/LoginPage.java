package com.saucedemo.pages;

import org.openqa.selenium.By;

//this class is the page object model for the login page
public class LoginPage extends BasePage {;

    //These constants represent the locators for the elements that
    // we're going to interact with
    private final By usernameFieldEl = By.id("user-name");
    private final By passwordFieldEl = By.id("password");
    private final By loginButtonEl = By.id("login-button");
    private final By errorMessageEl = By.tagName("h3");

    //
    public void setUsername (String username) {
        set(usernameFieldEl, username);
    }

    public void setPassword (String password) {
        set(passwordFieldEl, password);
    }

    public ProductsPage clickLoginButton () {
        click(loginButtonEl);

        return new ProductsPage();
    }

    public ProductsPage logIntoProductsPage (String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessageEl () {
        return find(errorMessageEl).getText();
    }

}
