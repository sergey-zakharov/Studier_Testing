package ru.mipt.testing.rcd.testData;

/**
 * Class-container for data used for testing
 * */
public class LoginData {

	private String login;
	private String pass;
	private String expectedResult;
	
	public String getPass(){
		return pass;
	}
	
	public String getLogin(){
		return login;
	}
	
	public String getExpectedResult(){
		return expectedResult;
	}
	
	public LoginData loadLogin(String login){
		this.login = login;
		return this;
	}
	
	public LoginData loadPass(String pass){
		this.pass = pass;
		return this;
	}
	public LoginData loadExpectedResult(String expected){
		this.expectedResult = expected;
		return this;
	}
}
