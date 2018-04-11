package com.cg.poc2;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.springframework.beans.factory.annotation.Value;

public class Credentials {

	private String emailId;
	private String userName;
	private String password;

	// Reading Property Credentials
	// dev
	@Value("${devEmailId}")
	private String devEmail;
	@Value("${devUserName}")
	private String devUserName;
	@Value("${devPassword}")
	private String devPassword;

	// prod
	@Value("${prodEmailId}")
	private String prodEmail;
	@Value("${prodUserName}")
	private String prodUserName;
	@Value("${prodPassword}")
	private String prodPassword;

	// test
	@Value("${testEmailId}")
	private String testEmail;
	@Value("${testUserName}")
	private String testUserName;
	@Value("${testPassword}")
	private String testPassword;

	public String isDevValid(String inputEmail, String inputUserName, String inputPassword) throws InvalidLoginException {
		String result = new String();
		if (inputEmail.equals(devEmail) && inputUserName.equals(devUserName) && inputPassword.equals(devPassword)) {
			result = "Successfully Logged in As DEV";
		}else
			throw new InvalidLoginException("Invalid Login credentials");
		return result;
	}

	public String isProdValid(String inputEmail, String inputUserName, String inputPassword) throws InvalidLoginException {
		String result = new String();
		if (inputEmail.equals(prodEmail) && inputUserName.equals(prodUserName) && inputPassword.equals(prodPassword)) {
			result = "Successfully Logged in As PROD";
		}else
			throw new InvalidLoginException("Invalid Login credentials");
		return result;
	}

	public String isTestValid(String inputEmail, String inputUserName, String inputPassword) throws InvalidLoginException {
		String result = new String();
		System.out.println(testEmail);
		if (inputEmail.equals(testEmail) && inputUserName.equals(testUserName) && inputPassword.equals(testPassword)) {
			result = "Successfully Logged in As TESTER";
		}else
			throw new InvalidLoginException("Invalid Login credentials");
		return result;
	}

	public Credentials() {

	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
