package ru.mipt.testing.rcd.fw;

import org.openqa.selenium.By;
import ru.mipt.testing.rcd.testData.LoginData;

public class LoginHelper extends HelperBase{
	
	public LoginHelper(AppManager manager){

        super(manager);
	}

	public String doLogin(LoginData loginData) throws Exception{
        manager.navigateTo().loginPage();

        if (By.xpath("//form/div[1]/input") == null){
            System.out.println(By.xpath("//form/div[1]/input").toString());
            throw new NullPointerException();
        }

        type(By.xpath("//form/div[1]/input"), loginData.getLogin());
        type(By.xpath("//form/div[2]/input"), loginData.getPass());
        click(By.cssSelector(".btn.btn-primary"));

        String result = "";
        try {
            result = manager.driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul[2]/li[2]/a")).getText();
        } catch (Exception e) {
            result = "Fail";
        }
        return result;
	}
}
