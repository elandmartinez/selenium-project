package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


//this class wil serve for inheritance for the actual Page object models
public abstract class BasePage {
    //we instantiate a driver that will be used in all he Page object models that we create
    //(one for each page)
    public static WebDriver driver;

    //we set the driver to this class
    public void setDriver (WebDriver driver) {
            BasePage.driver = driver;
    }

    //this method gets the locator of an element that later is used by the driver to find the
    //element in the website
    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    //this method enters text into an element, the methods itself receives the locator and text,
    //then finds the element with the locator and enters the text with a method of the driver
    protected void set(By locator, String text) {
        WebElement el = find(locator);

        el.clear();
        el.sendKeys(text);
    }

    //this method performs a click on the element that finds using the locator passed by parameter
    protected void click(By locator) {
        find(locator).click();
    }
}
