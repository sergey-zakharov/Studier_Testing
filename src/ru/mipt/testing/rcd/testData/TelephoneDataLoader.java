//package ru.mipt.testing.rcd.testData;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class TelephoneDataLoader {
//
//    public static List<TelephoneData> loadDataFromCsvFile(File file) throws IOException {
//
//    	List<TelephoneData> list = new ArrayList<TelephoneData>();
//        FileReader reader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(reader);
//        String line = bufferedReader.readLine(); //first line
//        line = bufferedReader.readLine();
//
//        while (line != null) {
//            String[] part = line.split(";", -1);
//            System.out.println(part.length);
//            TelephoneData telephoneData = new TelephoneData()
//                    .loadTelephone(part[0])
//                    .loadName(part[1])
//                    .loadAddress(part[2])
//                    .loadExpectedType(part[3])
//                    .loadExpectedTelephone(part[4])
//                    .loadExpectedResult(part[5]);
//            list.add(telephoneData);
//            line = bufferedReader.readLine();
//        }
//        bufferedReader.close();
//        return list;
//    }
//
//
//}
