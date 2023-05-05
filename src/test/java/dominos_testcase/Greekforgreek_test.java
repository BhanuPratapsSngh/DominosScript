package dominos_testcase;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import dominos_actions.Greekforgreek_actions;
import dominos_actions.Homepage_actions;
import dominos_base.Greek_for_Greek;
import dominos_elements.Greek_for_greek_elements;
import dominos_elements.Homepage_elemets;

public class Greekforgreek_test extends Greek_for_Greek {
	Greek_for_greek_elements HE ;
	Greekforgreek_actions actions_home;
	public Greekforgreek_test() {
	}
	@BeforeSuite
	public void initialize() throws IOException {
		setup();
		HE=new Greek_for_greek_elements() ;
		actions_home=new Greekforgreek_actions();
	}
	@AfterSuite
	public void endthesession() {
		end();
	}
	@Test
	public void clickrun() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",HE.edit_button());
        Thread.sleep(1000);
	}
	@Test(dependsOnMethods="clickrun")
	public void codetext() throws InterruptedException {
	System.out.println(HE.getcode().size());
	
	 Thread.sleep(10000);
	 System.out.println(HE.getcode().get(0).getText());
	 System.out.println(HE.getcode().get(6).getText());
	 System.out.println(HE.getcode().get(14).getText());
	 System.out.println(HE.getcode().get(02).getText());
	}
	@Test(dependsOnMethods="codetext")
	public void runtest() throws InterruptedException {
HE.runbutton().click();
System.out.println(HE.getouttext().getText());
	}
}
