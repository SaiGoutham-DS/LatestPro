package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class Amazon_Pojo extends BaseClass {
	
	public Amazon_Pojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="twotabsearchtextbox")
	
	private WebElement sb;
	
	@FindBy(id="nav-search-submit-button")
	
	private WebElement clickBtn;
	
	
	
	
	

	public WebElement getSb() {
		return sb;
	}

	public WebElement getClickBtn() {
		return clickBtn;
	}
	


	

   
   




}
