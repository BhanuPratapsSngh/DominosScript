package dominos_testcase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import dominos_actions.Add_tocart_pizza_actions;
import dominos_base.Add_to_cart__base;
import dominos_elements.Add_to_cart_elements;

public class Add_to_cart_testcase extends Add_to_cart__base {
	Add_to_cart_elements HE ;
	Add_tocart_pizza_actions actions_oder;
	public Add_to_cart_testcase() {
	}
	@BeforeSuite
	public void initialize() throws IOException {
		setup();
		HE=new Add_to_cart_elements() ;
		actions_oder=new Add_tocart_pizza_actions();
	
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
	@Test(priority=1)
	public void clickonpizza() throws InterruptedException {
		actions_oder.a_clickonpizza();
		Assert.assertEquals(driver.getCurrentUrl(), "https://pizzaonline.dominos.co.in/menu?customise=1");
	}
	@Test(dependsOnMethods="clickonpizza",priority=1)
	public void likethepizza() throws InterruptedException {
		actions_oder.a_likethepizza();
		Assert.assertEquals(actions_oder.asli().getAttribute("class"), "injectStyles-sc-1jy9bcf-0 jFBmWL");
	}
	@Test(dependsOnMethods="likethepizza",priority=2)
	public void badapizzalarg() throws InterruptedException {
		actions_oder.a_badapizzalarg();
		Assert.assertEquals(actions_oder.asspi().getAttribute("class"), "actv-pnl size-wrppr " );
}
	@Test(dependsOnMethods="badapizzalarg",priority=2)
	public void cheeseadd() throws InterruptedException {
		actions_oder.a_cheeseadd();
		Assert.assertEquals(actions_oder.assaddele().isDisplayed(), true);
}	
	@Test(dependsOnMethods="cheeseadd",priority=2)
	public void adtop() throws InterruptedException {
		actions_oder.a_adtop();
		Assert.assertEquals(actions_oder.assaddtops().isDisplayed(), true);
}	
	@Test(dependsOnMethods="adtop",priority=2)
	public void adnonvetop() throws InterruptedException {
		actions_oder.a_adnontop();
		Assert.assertEquals(actions_oder.assaddele().isDisplayed(), true);
}
	@Test(priority=3)
	public void adtocartvis() throws InterruptedException {
		Assert.assertEquals(actions_oder.ad2cart().isDisplayed(), true);
}
	@Test(priority=3)
	public void clickadd() throws InterruptedException {
		actions_oder.a_clickadd();
		Thread.sleep(3000);
		Assert.assertEquals(actions_oder.assad2cart().isDisplayed(),true );
}      
	@Test(priority=4)
	public void clickonpizza1() throws InterruptedException {
		actions_oder.a_clickonpizza1();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://pizzaonline.dominos.co.in/menu?customise=4064" );
} 
	@Test(dependsOnMethods="clickonpizza1",priority=4)
	public void adtop1() throws InterruptedException {
		actions_oder.a_adtop();
		Assert.assertEquals(actions_oder.assaddtops().isDisplayed(), true);
}
	@Test(dependsOnMethods="adtop1",priority=4)
	public void clickadd1() throws InterruptedException {
		actions_oder.a_clickadd();
		Thread.sleep(3000);
		Assert.assertEquals(actions_oder.assad2cart1().isDisplayed(),true );
	}

	
@Test(priority=4)
public void clickonpizza2() throws InterruptedException {
	actions_oder.a_clickonpizza2();
	Thread.sleep(3000);
	Assert.assertEquals(driver.getCurrentUrl(),"https://pizzaonline.dominos.co.in/menu?customise=4068" );
}
@Test(dependsOnMethods="clickonpizza2",priority=4)
public void adtop2() throws InterruptedException {
	actions_oder.a_adtop();
	Assert.assertEquals(actions_oder.assaddtops().isDisplayed(), true);
}	
@Test(dependsOnMethods="adtop2",priority=4)
public void clickadd2() throws InterruptedException {
	actions_oder.a_clickadd();
	Thread.sleep(3000);
	Assert.assertEquals(actions_oder.assad2cart2().isDisplayed(),true );
}
@Test(priority=5)
public void chceckoutvisi() throws InterruptedException {
	Thread.sleep(3000);
	Assert.assertEquals(actions_oder.checkoutclick().isDisplayed(), true);
}
@Test(dependsOnMethods="chceckoutvisi",priority=5)
public void checkoutcli() throws InterruptedException {
	actions_oder.checkoutclick().click();
	Thread.sleep(3000);
	Assert.assertEquals(driver.getCurrentUrl(), "https://pizzaonline.dominos.co.in/cart");
}
@Test(dependsOnMethods="checkoutcli",priority=6)
public void numbersofitemadds() throws InterruptedException {
	Thread.sleep(3000);
	Assert.assertEquals(actions_oder.numbersofitemadd().getText(), "3 Items you have selected");
}
@Test(priority=6,enabled=true)
public void mealadd() throws InterruptedException {
	actions_oder.a_addwithmeal();
	Thread.sleep(3000);
}
@Test(dependsOnMethods="mealadd",priority=6)
public void numbersofitemadds1() throws InterruptedException {
	Thread.sleep(3000);
	Assert.assertEquals(actions_oder.numbersofitemadd().isDisplayed(),true);
}

@Test(priority=7)
public void getbilldetail() throws InterruptedException {
	Thread.sleep(3000);
System.out.println(	HE.getbillinfo().getText());
}
@Test(priority=7)
public void odervisibility() throws InterruptedException {
	Thread.sleep(3000);
Assert.assertEquals(HE.placeodervisi().isDisplayed(),true);
}
@Test(priority=7)
public void increaseqquantity2() throws InterruptedException {
actions_oder.a_increaseqquantity2();
	Assert.assertEquals(HE.threeitem().getText(), "3");
}
}
