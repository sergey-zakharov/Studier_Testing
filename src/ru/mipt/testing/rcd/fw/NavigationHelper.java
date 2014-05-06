package ru.mipt.testing.rcd.fw;

/**
 * Manages browser environment and urls
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(AppManager manager) {
        super(manager);
    }

//    public NavigationHelper checkPage() {
//        manager.driver.manage().deleteAllCookies();
//        manager.driver.get(manager.baseURL);
//        return this;
//    }

    public NavigationHelper loginPage() {
        manager.driver.manage().deleteAllCookies();
        manager.driver.get(manager.baseURL);
        return this;
    }
    public NavigationHelper mainPage() {
        manager.driver.get(manager.mainPageURL);
        return this;
    }
}
