package ru.mipt.testing.rcd.testData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoginDataLoader {

    public static List<LoginData> loadDataFromCsvFile(File file) throws IOException {
        
    	List<LoginData> list = new ArrayList<LoginData>();
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        line = bufferedReader.readLine();
        
        while (line != null) {
            String[] part = line.split(";");
            LoginData loginData = new LoginData()
                    .loadLogin(part[0])
                    .loadPass(part[1])
                    .loadExpectedResult(part[2]);
            list.add(loginData);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        return list;
    }


}
