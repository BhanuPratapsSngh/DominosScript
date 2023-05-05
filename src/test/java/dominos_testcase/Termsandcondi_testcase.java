package dominos_testcase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import dominos_actions.Add_tocart_pizza_actions;
import dominos_actions.Termscondi_actions;
import dominos_base.Homepage_base;
import dominos_elements.Add_to_cart_elements;
import dominos_elements.Terms_ans_condition_element;

public class Termsandcondi_testcase extends Homepage_base{
	Terms_ans_condition_element HE ;
	Termscondi_actions actions_oder;
	public Termsandcondi_testcase() {
	}
	@BeforeSuite
	public void initialize() throws IOException {
		setup();
		HE=new Terms_ans_condition_element() ;
		actions_oder=new Termscondi_actions();
	
	}
	@AfterSuite
	public void endthesession() {
		end();
	}
	@Test(priority=0)
	public void alerthandle() throws InterruptedException {
		WebElement altext=HE.dontallow();
		Thread.sleep(3000);
		altext.click();
		Assert.assertEquals(altext.isDisplayed(), false);
	}
	@Test(priority=0)
	public void clitoggle() throws InterruptedException {
		Thread.sleep(3000);
		HE.togglecli().click();
		Assert.assertEquals(HE.assclitogg().isDisplayed(), true);
	}
	@Test(priority=0)
	public void clotogg() {
		HE.closetoggle().click();
		Assert.assertEquals(HE.assclitogg().isDisplayed(), false);
	}
	@Test(priority=0)
	public void terandcondi1() throws InterruptedException {
		Thread.sleep(3000);
		HE.togglecli().click();
		Thread.sleep(3000);
		HE.terandcondi().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://pizzaonline.dominos.co.in/tnc");
	}
}
