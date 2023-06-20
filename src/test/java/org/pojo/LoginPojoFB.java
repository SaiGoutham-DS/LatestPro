package org.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPojoFB extends BaseClass {

	public LoginPojoFB() {

		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(xpath = "//input[@type='text']"), @FindBy(xpath = "//input[@name='email']"),
			@FindBy(xpath = "//input[@id='email']") })

	private WebElement email;

	@FindAll({

			@FindBy(xpath = "//input[@name='pass']"), @FindBy(xpath = "//input[@type='password']"),
			@FindBy(xpath = "//input[@id='pass") })

	private WebElement passtext;

	@FindAll({

			@FindBy(xpath = "//button[@value='1']"), @FindBy(xpath = "//button[@value='1']"),
			@FindBy(xpath = "//button[@name='login']") })

	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasstext() {
		return passtext;
	}

	public WebElement getLogin() {
		return login;
	}

	

}
