package com.luma.demo.testsuite;

import com.luma.demo.basetest.BaseTest;
import com.luma.demo.pages.GearPage;
import com.luma.demo.pages.HomePage;
import com.luma.demo.pages.OverNightDufflePage;
import com.luma.demo.pages.ShoppingCartPage;
import org.testng.annotations.Test;

public class GearPageTest extends BaseTest
{
    HomePage homePage = new HomePage();
    ShoppingCartPage shoppingCartPage =new ShoppingCartPage();
    OverNightDufflePage overNightDufflePage = new OverNightDufflePage();
    GearPage gearPage =new GearPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homePage.mouseHoverOnGearMenu();
        homePage.clickOnBags();
        gearPage.clickOnBagProductName();
        overNightDufflePage.verifyTheTextOvernightDuffle();
        Thread.sleep(1000);
        overNightDufflePage.changeQuantity();
        overNightDufflePage.clickOnAddToCartButton();
        overNightDufflePage.verifyTextYouAdded_ProductNameMessage();
        overNightDufflePage.clickOnShoppingCartInToMessage();
        shoppingCartPage.verifyTheBagProductName();
        shoppingCartPage.verifyTheProductQuantity();
        shoppingCartPage.verifyTheProductPrice();
        shoppingCartPage.changeShoppingCartQuantity();
        shoppingCartPage.verifyTheProductPrice();
        shoppingCartPage.updateShoppingCartButton();
        shoppingCartPage.verifyTheFinalProductPrice();

    }
}
