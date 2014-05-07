package ru.mipt.testing.rcd.tests;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ru.mipt.testing.rcd.fw.Pair;
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
        Pair<String, Boolean> expectedPair = new Pair<String, Boolean>(loginData.getExpectedResult(),
                loginData.getExpectedIsManager());
        Pair<String, Boolean> resultPair = app.getLoginHelper().doLogin(loginData);

        assertEquals(resultPair.first, expectedPair.first, "Test login failed");
        assertEquals(resultPair.second, expectedPair.second, "Test login failed");
    }
}
