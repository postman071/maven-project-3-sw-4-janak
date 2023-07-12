package com.luma.demo.pages;

import com.luma.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility
{
    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By womenTops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By clickOnJackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By menBottoms = By.xpath("//a[@id='ui-id-18']");
    By clickOnPants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By clickOnBags = By.xpath("//span[normalize-space()='Bags']");


    public void mouseHoverOnWomenMenu()
    {
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverOnTops()
    {
        mouseHoverToElement(womenTops);
    }
    public void clickOnJackets()
    {
        clickOnElement(clickOnJackets);
    }
    public void mouseHoverOnMenMenu()
    {
        mouseHoverToElement(menMenu);
    }
    public void mouseHoverOnBottom()
    {
        mouseHoverToElement(menBottoms);
    }
    public void clickOnPants()
    {
        clickOnElement(clickOnPants);
    }
    public void mouseHoverOnGearMenu()
    {
        mouseHoverToElement(gearMenu);
    }
    public void clickOnBags()
    {
        clickOnElement(clickOnBags);
    }


}
