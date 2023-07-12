package com.luma.demo.testsuite;

import com.luma.demo.pages.WomenPage;
import com.luma.demo.utilities.Utility;
import org.testng.annotations.Test;

public class WomenPageTest extends Utility
{
    WomenPage womenPage = new WomenPage();
    @Test
    public void verifyTheSortByProductNameFilter()
    {
        womenPage.mouseHoverOnWomenMenu();

        womenPage.mouseHoverOnTops();

        womenPage.clickOnJacket();
        womenPage.productListBeforeSorting();

        womenPage.productListAfterSorting();

        womenPage.priceListBeforeSorting();
        womenPage.priceListAfterSorting();
    }
}
