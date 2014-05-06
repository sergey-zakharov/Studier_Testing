//package ru.mipt.testing.rcd.fw;
//
//import org.openqa.selenium.By;
//import ru.mipt.testing.rcd.testData.TelephoneData;
//
//public class TelephoneHelper extends HelperBase{
//
//	public TelephoneHelper(AppManager manager){
//
//        super(manager);
//	}
//
//	public String doTelephoneCheck(TelephoneData telephoneData) throws Exception{
//        manager.navigateTo().checkPage();
//
//        type(By.xpath("//*[@id='id_name']"), telephoneData.getName());
//        type(By.xpath("//*[@id='id_phone']"), telephoneData.getTelehone());
//        type(By.xpath("//*[@id='id_address']"), telephoneData.getAddress());
//        click(By.xpath("//*[@id='process_form_personal']/table/tbody/tr[4]/td/button"));
//
//        String result = "";
//        Thread.sleep(1000);
//        try {
//            result = manager.driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/section/p")).getText(); //in case of refuse
//        } catch (Exception e) {
//            try {
//                result = manager.driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/div[2]/article/table[2]/tbody/tr[1]/td")).getAttribute("title");
//            }
//            catch (Exception ex) {
//                result = manager.driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[2]/article/table/tbody/tr[1]/td")).getAttribute("title");// in case of one row
//            }
//        }
//        return result;
//	}
//}
