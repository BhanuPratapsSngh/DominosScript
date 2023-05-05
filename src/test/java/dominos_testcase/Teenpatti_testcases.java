package dominos_testcase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import dominos_actions.Homepage_actions;
import dominos_actions.Teenpatii_actions;
import dominos_base.Teenpatti_base;
import dominos_elements.Homepage_elemets;
import dominos_elements.Teenpatti_elements;

public class Teenpatti_testcases extends Teenpatti_base {
	Teenpatti_elements HE ;
	Teenpatii_actions actions_home;
	public Teenpatti_testcases() {
	}
	@BeforeSuite
	public void initialize() throws IOException {
		setup();
		HE=new Teenpatti_elements() ;
		actions_home=new Teenpatii_actions();
	}
//	@AfterSuite
//	public void endthesession() {
////		end();
//	}
	//visibility of logo
	@Test (priority=0)
	public void logovisi () {
		Assert.assertEquals(HE.logovisi().isDisplayed(), true);
	}
	//by clicking logo redirect to homepage
	@Test (dependsOnMethods="logovisi",priority=0)
	public void logoclick () throws InterruptedException {
		HE.logovisi().click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://gamentio.com/");
	}
	//verifing signin button is visible
	@Test (dependsOnMethods="logoclick",priority=0)
	public void signinvisi () {
		Assert.assertEquals(HE.signinbutton().isDisplayed(), true);
	}
	@Test (dependsOnMethods="signinvisi",priority=1)
	//verifing signin button is clickable
	public void signclick() throws InterruptedException {
		HE.signinbutton().click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://gamentio.com/");
	}
	@Test (dependsOnMethods="signclick",priority=2)
	//verifing playasguest button is visible
	public void playasguestvisi() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals(HE.playasguestbutton().isDisplayed(), true);
}
	@Test (dependsOnMethods="playasguestvisi",priority=2)
	//verifing playasguest button is clickable
	public void playasguestclicki() throws InterruptedException {
		Thread.sleep(6000);
		Actions act=new Actions(driver);
		act.moveToElement(HE.playasguestbutton()).click(HE.playasguestbutton()).perform();
		Thread.sleep(4000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://gamentio.com/landingpage");
}
	@Test (dependsOnMethods="playasguestclicki",priority=3)
	//verifing pop alert redeem buytton is visible
	public void coinspopupreddembutton() throws InterruptedException {
		Thread.sleep(8000);
		Assert.assertEquals(HE.coinspopupredee().isDisplayed(), true);
}
	@Test (dependsOnMethods="coinspopupreddembutton",priority=3)
	//verifing pop alert redeem buytton is visible
	public void coinspopupreddembuttoncli() throws InterruptedException {
		Thread.sleep(2000);
HE.coinspopupredee().click();
Thread.sleep(2000);
		Assert.assertEquals(HE.CONGRATUPOPUP().isDisplayed(), true);
}
	@Test (dependsOnMethods="coinspopupreddembuttoncli",priority=3)
	//verifing pop alert redeem buytton is visible
	public void SOLITAREBUTTON1() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(HE.SOLITAREBUTTON().isDisplayed(), true);
}
	@Test (dependsOnMethods="SOLITAREBUTTON1",priority=3)
	//verifing pop alert redeem buytton is visible
	public void JACKSORBETTERBUTTON1() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(HE.JACKSORBETTERBUTTON().isDisplayed(), true);
}
	@Test (dependsOnMethods="JACKSORBETTERBUTTON1",priority=3)
	//verifing pop alert redeem buytton is visible
	public void SLOTSBUTTON1() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(HE.SLOTSBUTTON().isDisplayed(), true);
}
	@Test (dependsOnMethods="coinspopupreddembuttoncli",priority=3)
	//verifing pop alert redeem buytton is visible
	public void SOLITAREBUTTON2() throws InterruptedException {
		Thread.sleep(2000);
		HE.SOLITAREBUTTON().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://gamentio.com/solitaire?isGuest=true");
}
	/* used be later  */
//	@Test (dependsOnMethods="SOLITAREBUTTON2",priority=3)
//	//verifing pop alert redeem buytton is visible
//	public void SOLITAREBUTTONback1() throws InterruptedException {
//		Thread.sleep(5000);
//		Assert.assertEquals(HE.backbutton().isDisplayed(), true);
//}
	@Test (priority=4)
	//verifing pop alert redeem buytton is visible
	public void SOLITAREBUTTONforward1() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals(HE.forwaredbutton().isDisplayed(), true);
}
	@Test (dependsOnMethods="SOLITAREBUTTONforward1",priority=4)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void SOLITAREBUTTOforward() throws InterruptedException {
		Thread.sleep(2000);
		HE.forwaredbutton().click();
		Thread.sleep(2000);
		Assert.assertEquals(HE.movestext().isDisplayed(), true);
}
	@Test (dependsOnMethods="SOLITAREBUTTOforward",priority=5)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void movesinfo() throws InterruptedException {
		Thread.sleep(2000);
	HE.movestext().getText();
	Thread.sleep(2000);
		Assert.assertEquals(HE.movestext().isDisplayed(), true);
}
	@Test (dependsOnMethods="movesinfo",priority=5)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void movesnumber() throws InterruptedException {
		Thread.sleep(2000);
	HE.number_of_moves().getText();
	Thread.sleep(2000);
		Assert.assertEquals(HE.number_of_moves().getText(), "0");
}
	@Test (priority=6)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void scorevisi() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(HE.scorestext().isDisplayed(), true);
}
	@Test (dependsOnMethods="scorevisi",priority=6)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void scorenum() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(HE.number_of_scores().getText(), "0");
}
	@Test (priority=6)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void homemenuvisi() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(HE.homemenu().isDisplayed(), true);
}
	@Test (priority=6)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void undomenuvisi() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(HE.undomenu().isDisplayed(), true);
}
	@Test (priority=6)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void new_gamemenuvisi() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(HE.new_gamemenu().isDisplayed(), true);
}
	@Test (priority=6)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void statsmenuvisi() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(HE.statsmenu().isDisplayed(),true);
}
	@Test (priority=7)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void homepagecli() throws InterruptedException {
		Thread.sleep(2000);
		HE.homemenu().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://gamentio.com/landingpage");
}
	@Test (priority=8)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void pokervisi() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(HE.pokergame().isDisplayed(), true);
}
	@Test (dependsOnMethods="pokervisi",priority=8)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void pokerclick() throws InterruptedException {
		Thread.sleep(2000);
		HE.pokergame().click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Play poker online on Gamentio to enjoy poker online free");
}
	@Test(priority=9)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void GAME_PLAYES_VISI() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(HE.games_played().isDisplayed(), true);
}
	@Test(priority=9)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void totalbetsvisi() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(HE.total_bets().isDisplayed(), true);
}
	@Test(priority=9)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void wonsvisi() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(HE.wons().isDisplayed(), true);
}
	@Test(priority=9)
	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
	public void totalwonsvisi() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(HE.total_wons().isDisplayed(), true);
}
	

//	@Test (dependsOnMethods="SOLITAREBUTTONforward1",priority=4)
//	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
//	public void SOLITAREBUTTOforward() throws InterruptedException {
//		Thread.sleep(5000);
//		HE.forwaredbutton().click();
//		Thread.sleep(2000);
//		Assert.assertEquals(HE.SOLITAREBUTTON().isDisplayed(), false);
//}
//	@Test (priority=4)
//	//verifing pop alert redeem buytton is visible
//	public void Hostvisi() throws InterruptedException {
//		Thread.sleep(5000);
//		Assert.assertEquals(HE.host().isDisplayed(), true);
//}
//	@Test (dependsOnMethods="SOLITAREBUTTONback",priority=4)
//	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
//	public void clickfirstgame() throws InterruptedException {
//		
//		Assert.assertEquals(HE.clickfirstgame().isDisplayed(), true);
//}
//	@Test (dependsOnMethods="clickfirstgame",priority=4)
//	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
//	public void clickfirstgame1() throws InterruptedException {
//		HE.clickfirstgame().click();
//		Thread.sleep(1000);
//		Assert.assertEquals(driver.getCurrentUrl(), "https://gamentio.com/rummy?isGuest=true");
//}
//	@Test (dependsOnMethods="clickfirstgame1",priority=4)
//	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
//	public void hostvisibility() throws InterruptedException {
//		Thread.sleep(2000);
//		Assert.assertEquals(HE.host().isDisplayed(), true);
//}
//	@Test (dependsOnMethods="hostvisibility",priority=4)
//	//verifing pop alert redeem SOLITAREBUTTONforward1 is visible
//	public void hostclick() throws InterruptedException {
//		Thread.sleep(3000);
//		HE.host().click();
//		Thread.sleep(2000);
//		driver.getCurrentUrl();
////		Assert.assertEquals(driver.getCurrentUrl(), true);
//}

	
	
//	@Test (priority=3)
//	//verifing pop alert is visible
//	public void coinspopup1() throws InterruptedException {
//		Thread.sleep(12000);
//		Assert.assertEquals(HE.coinspopup().isDisplayed(), true);
//}
	}
