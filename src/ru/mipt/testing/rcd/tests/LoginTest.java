package ru.mipt.testing.rcd.tests;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ru.mipt.testing.rcd.testData.LoginData;
import ru.mipt.testing.rcd.testData.LoginDataLoader;

public class LoginTest extends TestBase{

	@DataProvider
    public Iterator<Object[]> loginData() throws IOException {
        File loginDataFile = new File("test_data.csv");
        return wrapLoginsForDataProvider(LoginDataLoader.loadDataFromCsvFile(loginDataFile)).iterator();
    }

    @Test(dataProvider = "loginData")
    public void testLogin(LoginData loginData) throws Exception{
        assertEquals(app.getLoginHelper().doLogin(loginData), loginData.getExpectedResult(), "Test login failed");
    }
}
