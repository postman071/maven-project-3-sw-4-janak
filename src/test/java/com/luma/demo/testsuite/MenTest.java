package com.luma.demo.testsuite;

import com.luma.demo.basetest.BaseTest;
import com.luma.demo.pages.HomePage;
import com.luma.demo.pages.MenPage;
import com.luma.demo.pages.ShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest
{
    HomePage homepage = new HomePage();
    MenPage menpage = new MenPage();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart()
    {
        homepage.mouseHoverOnMenMenu();
        homepage.mouseHoverOnBottom();
        homepage.clickOnPants();

        menpage.pantSize();

        menpage.pantColour();

        menpage.addToCart();

        Assert.assertEquals(menpage.verifyAddedItemToTheShoppingCart()," You added Cronus yoga pant to your Shopping cart.");

        menpage.clickOnShoppingCartInMessage();

        Assert.assertEquals(shoppingCart.verifyTextShoppingCart(), "Shopping Cart");

        Assert.assertEquals(shoppingCart.verifyTheProductName(), "Cronus Yoga Pant");

        Assert.assertEquals(shoppingCart.verifyTheProductSize(), "32");

        Assert.assertEquals(shoppingCart.verifyTheProductNameColour(), "Black");
    }

}

