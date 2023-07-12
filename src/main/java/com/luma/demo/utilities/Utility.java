package com.luma.demo.utilities;

import com.luma.demo.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class Utility extends ManageBrowser {
    /**
     * This Method will Click on element
     */
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }
    /**
     * This method will send text from element
     */
    public void sendTextToElements(By by,String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    /**
     * This method will select the option by visible text
     */
    public void selectByVisibleTextFromDropDown(By by,String text)
    {
        WebElement dropDown=driver.findElement(by);
        Select select=new Select(dropDown);
        select.selectByVisibleText(text);
    }
    /**
     * This method will select the option by visible value
     */
    public void selectByValueFromDropDown(By by,String value)
    {
        WebElement dropDown=driver.findElement(by);
        Select select=new Select(dropDown);
        select.selectByVisibleText(value);
    }
    // Select by index (int index)
    public void selectByIndex(By by,int index)
    {
        new Select(driver.findElement(by)).selectByIndex(index);
    }
    //SelectOptionsByContainsText
    public void mouseHoverToElement(By by)
    {
        Actions actions=new Actions(driver);
        WebElement computer=driver.findElement(by);
        WebElement software=driver.findElement(by);
        // Mouse hover to computers
        actions.moveToElement(computer).build().perform();
    }
    //mouseHoverToElementAndClick
    public void mouseHoverToElementAndClick(By by)
    {
        Actions actions=new Actions(driver);
        WebElement computer=driver.findElement(by);
        WebElement software=driver.findElement(by);
        //Click on software in computer
        actions.moveToElement(software).click().build().perform();
    }
    //This Method is used to select radio button
    public void selectRadioButton(By by)
    {
        driver.findElement(by).click();
    }
    /**
     * This method is used to select CheckBox
     */
    public void selectCheckBox(By by)
    {
        WebElement checkBox = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(checkBox);
        actions.perform();
        if (checkBox.isSelected()) {

        } else {
            checkBox.click();
        }
    }

    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }

    /**
     * This method will send text from alert
     */
    public void sendTextToAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
    //*************************** Window Handle Methods ***************************************//

    /**
     * This method will close all windows
     */
    public void closeAllWindows(List<String> hList, String parentWindow) {
        for (String str : hList) {
            if (!str.equals(parentWindow)) {
                driver.switchTo().window(str).close();
            }
        }
    }

    /**
     * This method will switch to parent window
     */
    public void switchToParentWindow(String parentWindowId) {
        driver.switchTo().window(parentWindowId);
    }

    /**
     * This method will find that we switch to right window
     */
    public boolean switchToRightWindow(String windowTitle, List<String> hList) {
        for (String str : hList) {
            String title = driver.switchTo().window(str).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Found the right window....");
                return true;
            }
        }
        return false;
    }

    //************************** Waits Methods *********************************************//

    /**
     * This method will use to wait until  VisibilityOfElementLocated
     */
    public WebElement waitUntilVisibilityOfElementLocated(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement waitForElementWithFluentWait(By by, int time, int pollingTime) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(time))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });
        return element;
    }
}
