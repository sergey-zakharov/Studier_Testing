package ru.mipt.testing.rcd.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppManager {

    public String baseURL;
    public String mainPageURL;
    public WebDriver driver;


    private LoginHelper loginHelper = new LoginHelper(this);
    private NavigationHelper navigationHelper;



    public AppManager(){
		driver = new FirefoxDriver();
        this.baseURL = "http://polyclinic.studr.ru/";
		driver.get(baseURL);
	}
	public void stop(){
		driver.close();
		driver.quit();
	}

    public LoginHelper getLoginHelper(){
        if (loginHelper == null) {
            loginHelper = new LoginHelper(this);
        }
        return loginHelper;
    }
//	public TelephoneHelper getTelephoneHelper(){
//        if (loginHelper == null) {
//            loginHelper = new TelephoneHelper(this);
//        }
//		return loginHelper;
//	}

    public NavigationHelper navigateTo() {
        if (navigationHelper == null) {
            navigationHelper = new NavigationHelper(this);
        }
        return navigationHelper;
    }

}
