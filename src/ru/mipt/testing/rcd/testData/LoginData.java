package ru.mipt.testing.rcd.testData;

/**
 * Class-container for data used for testing
 * */
public class LoginData {

	private String login;
	private String pass;
	private String expectedResult;
    private boolean expectedIsManager;
	
	public String getPass(){
		return pass;
	}
	
	public String getLogin(){
		return login;
	}
	
	public String getExpectedResult(){
		return expectedResult;
	}
    public Boolean getExpectedIsManager(){return expectedIsManager;}
	
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

    public LoginData loadExpectedIsManager(Boolean expectedIsManager){
        this.expectedIsManager = expectedIsManager;
        return this;
    }
}
