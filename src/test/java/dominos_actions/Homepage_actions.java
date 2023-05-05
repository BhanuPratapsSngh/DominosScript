package dominos_actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dominos_elements.Homepage_elemets;

public class Homepage_actions extends Homepage_elemets {
	Homepage_elemets home_ui=new Homepage_elemets();
	
	public void a_MEALS_and_COMBOS_is_clickable() throws InterruptedException {
		Thread.sleep(2000);
		home_ui.headmen().get(9).click();		
	}
	public void a_PARTY_COMBOS_is_clickable() throws InterruptedException{
		Thread.sleep(2000);
		home_ui.headmen().get(10).click();
	}
	public void a_DESSERT_is_clickable() throws InterruptedException {
		Thread.sleep(2000);
		home_ui.headmen().get(11).click();
	}
	public void a_clickondeleveryradio() throws InterruptedException {
		Thread.sleep(2000);
		home_ui.deleiveryradio().click();
		Thread.sleep(2000);
	}
	public void a_VEG_PIZZA_is_clickable() throws InterruptedException {
		Thread.sleep(2000);
		home_ui.headmen().get(3).click();
	}
	public void a_SIDES_is_clickable() throws InterruptedException {
		Thread.sleep(2000);
		home_ui.headmen().get(7).click();
	}
	public void a_PIZZA_MANIA_is_clickable() throws InterruptedException {
		Thread.sleep(2000);
		home_ui.headmen().get(8).click();
	}
	public void a_operationonsearchbox() throws InterruptedException {
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(home_ui.searchdeleverylocation()).click().perform();
		home_ui.searchdeleverylocation().sendKeys("delhi");
	}
	public void a_operationonsearchlist() throws InterruptedException {
		Thread.sleep(2000);
		WebElement cli=home_ui.searchdeleverylocationlist();
		cli.click();
		Thread.sleep(2000);
	}
	public void a_clickingonproceed() throws InterruptedException {
		Thread.sleep(2000);
		home_ui.clickproceeed().click();
	}
	public void a_selectingstoreinboxbysearching() throws InterruptedException {
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.click(home_ui.toselectstorerefer()).perform();
		act.sendKeys(home_ui.toselectstorerefer(), "ELANTE");
		act.click(home_ui.toselectstorerefer()).perform();
		Thread.sleep(2000);
		act.moveToElement(home_ui.toselectalente()).click().perform();
	}
	public void a_selectingcityinpickupdeleivery() throws InterruptedException {
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.click(home_ui.toselectcityrefer()).perform();
		act.sendKeys(home_ui.toselectcityrefer(), "CHANDIGARH");
		act.click(home_ui.toselectcityrefer()).perform();
		act.moveToElement(home_ui.toselectchandigarh()).click().perform();
	}
	public void a_clickpickradiobutton() throws InterruptedException {
		Thread.sleep(2000);
		home_ui.pickupradioclick().click();
		Thread.sleep(5000);
	}
	public void a_BESTSELLERS_is_clickable() throws InterruptedException {
		Thread.sleep(2000);
		home_ui.headmen().get(1).click();
	}
	public void a_NEW_LAUNCHES_is_clickablee() throws InterruptedException {
		Thread.sleep(2000);
		home_ui.headmen().get(2).click();
	}
	public void a_EVERYDAY_VALUE_is_clickable() throws InterruptedException {
		Thread.sleep(2000);
		home_ui.headmen().get(0).click();
	}
	public void a_NON_VEG_PIZZA_is_clickable() throws InterruptedException {
		Thread.sleep(2000);
		home_ui.headmen().get(4).click();
	}
	public void a_BEVERAGES_is_clickable() throws InterruptedException {
		Thread.sleep(2000);
		home_ui.headmen().get(5).click();
	}
	public void a_SPECIALITY_CHICKEN_is_clickable() throws InterruptedException {
		Thread.sleep(2000);
		home_ui.headmen().get(6).click();
	}
	public void a_clickchatframee() throws InterruptedException {
		Thread.sleep(2000);
//		driver.switchTo().frame(2);
		home_ui.chatframeclick().click();
		
	}
	
}
