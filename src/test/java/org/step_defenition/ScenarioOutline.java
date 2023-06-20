package org.step_defenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojoFB;
import org.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline extends BaseClass {

	@Given("to Launch the Browser")
	public void to_Launch_the_Browser() {
		launchthebrowser();

	}

	@When("to Launch the Url")
	public void to_Launch_the_Url() {
		loadtheURL("https://www.facebook.com/");

	}

	@When("to Validate the {string}email text box")
	public void to_Validate_the_Email_email_text_box(String Email) {
		LoginPojoFB l = new LoginPojoFB();
		WebElement a = l.getEmail();
		//a.sendKeys("java");
		
		passtxt(a, Email);
	}

	@When("to Validate the {string}Password text box")
	public void to_Validate_the_Password_Password_text_box(String Pass) {
		LoginPojoFB l = new LoginPojoFB();
		WebElement b = l.getPasstext();
		passtxt(b, Pass);
	}

	@When("to Click the Login button")
	public void to_Click_the_Login_button() {
		LoginPojoFB l = new LoginPojoFB();
		WebElement c = l.getLogin();
		clickbutton(c);

	}

	@Then("to close the browser")
	public void to_close_the_browser() {
		close_the_Browser();

	}

}
