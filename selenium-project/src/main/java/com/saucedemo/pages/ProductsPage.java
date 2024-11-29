package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{
    private final By productsTitle = By.className("product_label");

    public boolean isProductsTitleDiplayed () {
        return find(productsTitle).isDisplayed();
    }
}
