package org.step_defenition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojoFB;
import org.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FaceBook_Class extends BaseClass {

	@Given("To launch the Browser")
	public void to_launch_the_Browser() {
		launchthebrowser();
	}

	@When("To launch the URL")
	public void to_launch_the_URL() {
		loadtheURL("https://www.facebook.com/");
	}

	@When("To pass the Valid email id to email text box")
	public void to_pass_the_Valid_email_id_to_email_text_box() throws IOException {
		String usr = excelReadDateNumericalDatas("Demo", 5, 0);
		LoginPojoFB l = new LoginPojoFB();
		WebElement a = l.getEmail();
		passtxt(a, usr);
	}

	@When("To pass the invalid pin to pass the password text box")
	public void to_pass_the_invalid_pin_to_pass_the_password_text_box() throws IOException {
		String pin = excelReadDateNumericalDatas("Demo", 5, 1);
		LoginPojoFB l = new LoginPojoFB();
		WebElement b = l.getPasstext();
		passtxt(b, pin);
	}

	@When("To click the Login button")
	public void to_click_the_Login_button() {
		LoginPojoFB l = new LoginPojoFB();
		WebElement c = l.getLogin();
		clickbutton(c);
	}

	@Then("To close the brower")
	public void to_close_the_brower() {
		close_the_Browser();
	}

}
