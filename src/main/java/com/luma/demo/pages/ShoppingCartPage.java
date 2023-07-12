package com.luma.demo.pages;

import com.luma.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility
{
    // Verify the text Shopping Cart.
    By verifyTextShoppingCart = By.xpath("//span[@class='base']");

    // Verify the product name ‘Cronus Yoga Pant’
    By productName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");

    // Verify the product size ‘32’
    By productSize = By.xpath("//dd[contains(text(),'32')]");

    // Verify the product colour ‘Black’
    By productColour = By.xpath("//dd[contains(text(),'Black')]");


    // Verify the product name ‘Overnight Duffle’
    By verifyProductName = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    //Verify the Qty is ‘3’
    By verifyProductQuantity = By.xpath("//input[@title='Qty']");
    // Verify the product price ‘$135.00’
    By verifyProductPrice = By.xpath("(//span[@class='cart-price']//span)[2]");
    // Change Qty to ‘5’

    By clearQuantity = By.cssSelector("#cart-246909-qty");
    By changeQuantity = By.cssSelector("#cart-246909-qty");
    // Click on ‘Update Shopping Cart’ button
    By shoppingCartButton = By.xpath("//span[contains(text(),'Update Shopping Cart')]");
    // Verify the product price ‘$225.00’
    By newProductPrice = By.xpath("(//span[@class='cart-price']//span)[2]");


    public String verifyTextShoppingCart()
    {
        return getTextFromElement(verifyTextShoppingCart);
    }
    public String verifyTheProductName()
    {
        return getTextFromElement(productName);
    }
    public String verifyTheProductSize()
    {
        return getTextFromElement(productSize);
    }
    public String verifyTheProductNameColour()
    {
        return getTextFromElement(productColour);
    }
    // Verify the product name ‘Overnight Duffle’
    public String verifyTheBagProductName()
    {
        return getTextFromElement(verifyProductName);
    }
    //Verify the Qty is ‘3’
    public String verifyTheProductQuantity()
    {
        return getTextFromElement(verifyProductQuantity);
    }
    // Verify the product price ‘$135.00’
    public String verifyTheProductPrice() {
        return getTextFromElement(verifyProductPrice);
    }

    // Change Qty to ‘5’
    public void changeShoppingCartQuantity()
    {
        driver.findElement(clearQuantity).clear();
        sendTextToElements(changeQuantity, "5");
    }
    // Click on ‘Update Shopping Cart’ button
    public void updateShoppingCartButton() {
        clickOnElement(shoppingCartButton);
    }

    // Verify the product price ‘$225.00’
    public String verifyTheFinalProductPrice()
    {
        return getTextFromElement(newProductPrice);
    }


}
