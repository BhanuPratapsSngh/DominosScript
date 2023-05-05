package dominos_elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dominos_base.Homepage_base;

public class Homepage_elemets extends Homepage_base{
public Homepage_elemets() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//button[@class='ng-binding'])[1]")
WebElement dontallow ;

@FindBy(xpath="(//img[@class='brand-logo'])[1]")
WebElement headerdominoslogo ;

@FindBy(xpath="(//img[@class='brand-logo'])[2]")
WebElement footerdominoslogo ;

@FindBy(xpath="//div[@class='sc-htpNat esboMF']/div/span")
List<WebElement> menus ;

@FindBy(xpath="(//input[@type='radio'])[1]")
WebElement deleiverylocationradioclick ;

@FindBy(xpath="//input[@placeholder='Enter Area / Locality']")
WebElement operationdeleverysearch ;

@FindBy(xpath="//div/ul/li[3]")
WebElement deliebrylocations ;

@FindBy(xpath="(//input[@type='radio'])[2]")
WebElement puckuplocationclick ;

@FindBy(xpath="//p[text()='Order Online']")
WebElement assertfordeleberyrefernce ;

@FindBy(xpath="//div[@class='slct-lctn-cnt']/div[text()='Mori Gate, New Delhi']")
WebElement verifydeleverysate ;

@FindBy(xpath="//p[@class='orderOnlineText']")
WebElement verifypickupclick ;

@FindBy(xpath="(//div[@class='lbl--wrpr']/div/input)[1]")
WebElement selectcity ;

@FindBy(xpath="(//div[@class='lbl--wrpr']/div/input)[2]")
WebElement selectstore ;

@FindBy(xpath="//span[text()='CHANDIGARH']")
WebElement clickchandigarhcity ;

@FindBy(xpath="//span[text()='NEXUS ELANTE MALL CHANDIGARH']")
WebElement clickelantestore ;

@FindBy(xpath="//button//span[text()='Proceed']")
WebElement clcikproceed ;

@FindBy(xpath="//div[@class='slct-lctn-txt slct-lctn-txt-slctd']")
WebElement clickproceddreferal ;

@FindBy(xpath="//button[@data-label='Locate_Me']")
WebElement locatemevisible ;

@FindBy(xpath="//div[@role='button']")
WebElement clickcharframe ;

public WebElement clickda() {
	return dontallow;
}
public WebElement dominosheadlogo() {
	return headerdominoslogo;
}
public WebElement dominosfootlogo() {
	return footerdominoslogo;
}public List<WebElement> headmen() {
	
	return menus;
	}
public WebElement deleiveryradio() {
	
	return deleiverylocationradioclick;
}
public WebElement searchdeleverylocation() {
	
	return operationdeleverysearch;
}
public WebElement assertfordeleverysearchback() {
	
	return assertfordeleberyrefernce;
}
public WebElement searchdeleverylocationlist() {
	
	return deliebrylocations;
}
public WebElement verifydeleiveryselectedornot() {
	
	return verifydeleverysate;
}
public WebElement pickupradioclick() {
	
	return puckuplocationclick;
}
public WebElement verifypickupclickregerer() {
	return verifypickupclick;
}
public WebElement toselectcityrefer() {
	return selectcity;
}
public WebElement toselectstorerefer() {
	return selectstore;
}
public WebElement toselectchandigarh() {
	return clickchandigarhcity;
}
public WebElement toselectalente() {
	return clickelantestore;
}
public WebElement clickproceeed() {
	return clcikproceed;
}
public WebElement clickproceedreferd() {
	return clickproceddreferal;
}
public WebElement locateisvisibile() {
	return locatemevisible;
}
public WebElement chatframeclick() {
	return clickcharframe;
}
}

