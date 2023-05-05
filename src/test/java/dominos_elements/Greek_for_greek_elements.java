package dominos_elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dominos_base.Greek_for_Greek;

public class Greek_for_greek_elements extends Greek_for_Greek{
	public Greek_for_greek_elements() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//i[@id='run-and-edit-button'])[1]")
	WebElement edit_button;
	
	@FindBy(xpath="//div[@class='CodeMirror-code']//div[@style='position: relative;']")
	List<WebElement> getcode;
	
	@FindBy(xpath="(//i[@id='run-code-button'])[1]")
	WebElement runbutton;
	
	@FindBy(xpath="//div[@class='code-output'][1]")
	WebElement getouttext;
	
	public WebElement edit_button() {
		return edit_button;
	}
	public List<WebElement> getcode() {
		return getcode;
	}
	public WebElement getouttext() {
		return getouttext;
	}            
	public WebElement runbutton() {
		return runbutton;
	} 
}
