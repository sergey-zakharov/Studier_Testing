package ru.mipt.testing.rcd.fw;

import org.openqa.selenium.By;
import ru.mipt.testing.rcd.testData.LoginData;

public class LoginHelper extends HelperBase{
	
	public LoginHelper(AppManager manager){

        super(manager);
	}

	public Pair<String, Boolean> doLogin(LoginData loginData) throws Exception{
        manager.navigateTo().loginPage();

        if (By.xpath("//form/div[1]/input") == null){
            System.out.println(By.xpath("//form/div[1]/input").toString());
            throw new NullPointerException();
        }

        type(By.xpath("//form/div[1]/input"), loginData.getLogin());
        type(By.xpath("//form/div[2]/input"), loginData.getPass());
        click(By.cssSelector(".btn.btn-primary"));

        String result = "";
        boolean is_manager = false;

        try {
            result = manager.driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul[2]/li[2]/a")).getText();
            System.out.println(result);
            String registerText = "Зарегистрироваться";
            if (result.compareTo(registerText) == 0){
                result = manager.driver.findElement(By.cssSelector(".text-error")).getText();
            }
            else if (manager.driver.findElement(By.cssSelector(".active>a")).getText().compareTo("Кабинет администратора") == 0){
                is_manager = true;
            }

        } catch (Exception e) {
            result = "Fail";
        }
        return new Pair<String, Boolean>(result, is_manager);
	}
}
