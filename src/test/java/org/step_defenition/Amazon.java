package org.step_defenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.Amazon_Pojo;
import org.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon extends BaseClass {

	Amazon_Pojo p;
	
	@Given("To launch the Browser and Amazon URL")
	public void to_launch_the_Browser_and_Amazon_URL() {

		launchthebrowser();
		loadtheURL("https://www.amazon.in/");

	}

	@When("To Pass the Valid Search word to search box")
	public void to_Pass_the_Valid_Search_word_to_search_box() {
		 implicitWait(5);
		 p = new Amazon_Pojo();
		 WebElement searchbx = p.getSb();
		 passtxt(searchbx, "Iphone");
//		WebElement sb = driver.findElement(By.id("twotabsearchtextbox"));
//		sb.sendKeys("Iphone");

	}

	@When("To click the Search button")
	public void to_click_the_Search_button() {
		 implicitWait(5);
		p = new Amazon_Pojo();
		WebElement clickbx = p.getClickBtn();
		clickbutton(clickbx);
//		WebElement clk =driver.findElement(By.id("nav-search-submit-button"));
//		clk.click();

	}

	@Then("To Close the Browser")
	public void to_Close_the_Browser() throws InterruptedException {
		
		close_the_Browser();
	}

}
