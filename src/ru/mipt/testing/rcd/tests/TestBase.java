package ru.mipt.testing.rcd.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import ru.mipt.testing.rcd.fw.AppManager;
import ru.mipt.testing.rcd.testData.LoginData;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class TestBase {

    static AppManager app;

    @BeforeTest
    public void setUp() throws Exception{
        Properties properties = new Properties();
        String configFile = System.getProperty("configFile", "test.properties");
        properties.load(new FileReader(new File(configFile)));

        app = new AppManager();
    }

    @AfterTest
    public void suitTearDown() {
        app.stop();
    }

    public static List<Object[]> wrapLoginsForDataProvider(List<LoginData> loginsInput) {
        List<Object[]> list = new ArrayList<Object[]>();
        for (LoginData login : loginsInput) {
            list.add(new Object[]{login});
        }

        return list;
    }



}
