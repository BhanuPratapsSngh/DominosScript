package dominos_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dominos_base.Homepage_base;

public class Terms_ans_condition_element extends Homepage_base {
	
	public Terms_ans_condition_element() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='hamburger']/span[2]")
	WebElement togglecli;
	
	@FindBy(xpath="//span[text()='TRACK CURRENT ORDER']")
	WebElement assclitogg ;
	@FindBy(xpath="(//button[@class='ng-binding'])[1]")
	WebElement dontallow ;
	@FindBy(xpath="//div[@class='injectStyles-sc-1jy9bcf-0 gexXsN']")
	WebElement closetoggle ;
	@FindBy(xpath="//span[text()='Terms & Conditions']")
	WebElement terandcondi;
	public WebElement dontallow() {
		return dontallow;
	}
	public WebElement togglecli() {
		return togglecli;
	}
	public WebElement closetoggle() {
		return closetoggle;
	}
	public WebElement assclitogg() {
		return assclitogg;
	}
	public WebElement terandcondi() {
		return terandcondi;
	}
}
