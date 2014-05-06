package ru.mipt.testing.rcd.fw;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class HelperBase {

    protected AppManager manager;
    public boolean acceptNextAlert = true;

    public HelperBase(AppManager manager) {
        this.manager = manager;
    }

    public void type(By elementLocator, String inputText) {
        try {
            if (inputText != null ) {
                manager.driver.findElement(elementLocator).clear();
                manager.driver.findElement(elementLocator).sendKeys(inputText);
            }
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    public void click(By elementLocator) {
        manager.driver.findElement(elementLocator).click();
    }

    public boolean isElementPresent(By by) {
        try {
            manager.driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            manager.driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = manager.driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

}
