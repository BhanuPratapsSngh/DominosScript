package dominos_testcase;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import dominos_actions.Homepage_actions;
import dominos_base.Homepage_base;
import dominos_elements.Homepage_elemets;
public class Homepage_testcase extends Homepage_base{
	Homepage_elemets HE ;
	Homepage_actions actions_home;
	public Homepage_testcase() {
	}
	@BeforeSuite
	public void initialize() throws IOException {
		setup();
		HE=new Homepage_elemets() ;
		actions_home=new Homepage_actions();
	}
	@AfterSuite
	public void endthesession() {
		end();
	}
	@Test(priority=0)
	public void alerthandle() throws InterruptedException {
		WebElement altext=HE.clickda();
		Thread.sleep(3000);
		altext.click();
		Assert.assertEquals(altext.isDisplayed(), false);
	}

	@Test(priority=0)
	public void helogovisbility() {
		Assert.assertEquals(HE.dominosheadlogo().isDisplayed(), true," header logo is displayed");
	}
	@Test(priority=0)
	public void fologovisbility1() throws InterruptedException {
		Assert.assertEquals(HE.dominosfootlogo().isDisplayed(), true,"footer logo is displayed ");
	}
	@Test(priority=0)
	public void HMmenuscount() throws InterruptedException {
	Assert.assertEquals(HE.headmen().size(), 12);
	}
	@Test(priority=1)
	public void HMmenusname() throws InterruptedException {
		Thread.sleep(2000);
		int sizeofmenu=HE.headmen().size();
		for(int i = 0;i<sizeofmenu;i++) {
			  String menuname=HE.headmen().get(i).getText();
			  System.out.println(menuname);
		}	
	}
	@Test(priority=1)
	public void EVERYDAY_VALUE_is_clickable() throws InterruptedException {
		actions_home.a_EVERYDAY_VALUE_is_clickable();
		Assert.assertEquals(driver.getCurrentUrl(),"https://pizzaonline.dominos.co.in/menu?categoryId=999");
		}
	@Test(priority=1)
	public void BESTSELLERS_is_clickable() throws InterruptedException {
		actions_home.a_BESTSELLERS_is_clickable();
		Assert.assertEquals(driver.getCurrentUrl(),"https://pizzaonline.dominos.co.in/menu");
		
		}
	@Test(priority=1)
	public void NEW_LAUNCHES_is_clickable() throws InterruptedException {
		actions_home.a_NEW_LAUNCHES_is_clickablee();
		Assert.assertEquals(driver.getCurrentUrl(),"https://pizzaonline.dominos.co.in/menu?categoryId=77");
		}
	@Test(priority=1)
	public void VEG_PIZZA_is_clickable() throws InterruptedException {
		actions_home.a_VEG_PIZZA_is_clickable();
		Assert.assertEquals(driver.getCurrentUrl(),"https://pizzaonline.dominos.co.in/menu?categoryId=2");
		}
	@Test(enabled=false)
	public void NON_VEG_PIZZA_is_clickable() throws InterruptedException {
		actions_home.a_NON_VEG_PIZZA_is_clickable();
		Assert.assertEquals(driver.getCurrentUrl(),"https://pizzaonline.dominos.co.in/menu?categoryId=3");
		}
	@Test(priority=1)
	public void BEVERAGES_is_clickable() throws InterruptedException {
		actions_home.a_BEVERAGES_is_clickable();
		Assert.assertEquals(driver.getCurrentUrl(),"https://pizzaonline.dominos.co.in/menu?categoryId=5");
		}
	@Test(priority=1)
	public void SPECIALITY_CHICKEN_is_clickable() throws InterruptedException {
		actions_home.a_SPECIALITY_CHICKEN_is_clickable();
		Assert.assertEquals(driver.getCurrentUrl(),"https://pizzaonline.dominos.co.in/menu?categoryId=46");
		}
	@Test(priority=1)
	public void SIDES_is_clickable() throws InterruptedException {
		actions_home.a_SIDES_is_clickable();
		Assert.assertEquals(driver.getCurrentUrl(),"https://pizzaonline.dominos.co.in/menu?categoryId=4");
		}
	@Test(priority=1)
	public void PIZZA_MANIA_is_clickable() throws InterruptedException {
		actions_home.a_PIZZA_MANIA_is_clickable();
		Assert.assertEquals(driver.getCurrentUrl(),"https://pizzaonline.dominos.co.in/menu?categoryId=20");
		}
	@Test(priority=1)
	public void MEALS_and_COMBOS_is_clickable() throws InterruptedException {
	        actions_home.a_MEALS_and_COMBOS_is_clickable();
			Assert.assertEquals(driver.getCurrentUrl(),"https://pizzaonline.dominos.co.in/menu?categoryId=50");
			Thread.sleep(2000);
			}
	@Test(priority=1)
	public void PARTY_COMBOS_is_clickable() throws InterruptedException {
		actions_home.a_PARTY_COMBOS_is_clickable();
			Assert.assertEquals(driver.getCurrentUrl(),"https://pizzaonline.dominos.co.in/menu?categoryId=89");
			}
	@Test(priority=1)
	public void DESSERT_is_clickable() throws InterruptedException {
		actions_home.a_DESSERT_is_clickable();
			Assert.assertEquals(driver.getCurrentUrl(),"https://pizzaonline.dominos.co.in/menu?categoryId=26");
			}
	//clicking on radio button deleivery
	@Test(priority=2)
	public void clickondeleveryradio() throws InterruptedException {
		actions_home.a_clickondeleveryradio();
		Assert.assertEquals(HE.searchdeleverylocation().isDisplayed(), true);
	}
	//check wheather enter-area field is visible 
	@Test(priority=2,dependsOnMethods="clickondeleveryradio")
	public void enterareafieldvisible() throws InterruptedException {
		Assert.assertEquals(HE.searchdeleverylocation().isDisplayed(), true);
	}
	//checking the visibility of locateme button
	@Test(priority=2,dependsOnMethods="clickondeleveryradio")
	public void locatevisible() throws InterruptedException {
		Assert.assertEquals(HE.locateisvisibile().isDisplayed(), true);
	}
	//insertion on search box 
	@Test(dependsOnMethods="clickondeleveryradio",priority=2)
	public void operationonsearchbox() throws InterruptedException {
		actions_home.a_operationonsearchbox();
		Assert.assertEquals("delhi", HE.searchdeleverylocation().getAttribute("value"));
		
	}
	
	//selectiong third element of dropdown after insertion
	@Test(dependsOnMethods="operationonsearchbox",priority=2)
	public void operationonsearchlist() throws InterruptedException {
		actions_home.a_operationonsearchlist();
        Assert.assertEquals(HE.verifydeleiveryselectedornot().getText(), "Mori Gate, New Delhi");
	}
	
	//clicking pickup radio button
	@Test(dependsOnMethods="operationonsearchlist",priority=2)
	public void clickpickradiobutton() throws InterruptedException {
		actions_home.a_clickpickradiobutton();
		Assert.assertEquals(HE.verifypickupclickregerer().getText(), "Which store would you like to Pickup/Dine-in order from");
	}
	
	//selecting city in pickupradio 
	@Test(dependsOnMethods="clickpickradiobutton",priority=2)
	public void selectingcityinpickupdeleivery() throws InterruptedException {
		actions_home.a_selectingcityinpickupdeleivery();
		Assert.assertEquals(HE.toselectcityrefer().getAttribute("value"), "CHANDIGARH");
	}
	
	//selecting store in pickupradio
	@Test(dependsOnMethods="selectingcityinpickupdeleivery",priority=2)
	public void selectingstoreinboxbysearching() throws InterruptedException {
		actions_home.a_selectingstoreinboxbysearching();
		Assert.assertEquals(HE.toselectstorerefer().getAttribute("value"), "NEXUS ELANTE MALL CHANDIGARH");
		
	}
	@Test(dependsOnMethods="selectingstoreinboxbysearching",priority=2)
	public void proceedvisibility() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals(HE.clickproceeed().isDisplayed(), true);
		
	}
	//clicking on proceed button after entering both credetials
	@Test(dependsOnMethods="selectingstoreinboxbysearching",priority=2)
	public void clickingonproceed() throws InterruptedException {
		actions_home.a_clickingonproceed();
		Assert.assertEquals(HE.clickproceedreferd().getText(), "NEXUS ELANTE MALL CHANDIGARH");
	}
	@Test(priority=3)
	public void clickchatframes() throws InterruptedException {
		actions_home.a_clickchatframee();
		
	}
	}
	
	


