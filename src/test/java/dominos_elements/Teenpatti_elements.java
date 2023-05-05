package dominos_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dominos_base.Teenpatti_base;

public class Teenpatti_elements extends Teenpatti_base{
	public Teenpatti_elements() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='logo-wrapper']/a")
	WebElement logovisi;
	
	@FindBy(xpath="//a[@class='SignIn']")
	WebElement signinbutton;
	
	@FindBy(xpath="//a[@class='createAccount signup_button']/span")
	WebElement playasguestbutton;
	
	@FindBy(xpath="//button[text()='Redeem ']")
	WebElement coinspopupredee;
	
	@FindBy(xpath="//DIV[@CLASS='main-container congratzWrap']")
	WebElement CONGRATUPOPUP;
	
/*   solitarebutton under module */
	@FindBy(xpath="//BUTTON[@CLASS='buttonClose'][@ONCLICK='solitaireGameCount();']")
	WebElement SOLITAREBUTTON;
	
	@FindBy(xpath="//div[class='left-buttom-frame']/img")
	WebElement backbutton;
	
	@FindBy(xpath="//div[@class='right-button-frame']/img")
	WebElement forwaredbutton;
	/*   solitarebutton under module */
	
	@FindBy(xpath="//BUTTON[@CLASS='buttonClose'][@ONCLICK='jacksOrBetterGameCount();']")
	WebElement JACKSORBETTERBUTTON;
	
	@FindBy(xpath="	//BUTTON[@CLASS='buttonClose'][@ONCLICK='slotsGameCount();']")
	WebElement SLOTSBUTTON;
	
	@FindBy(xpath="//a[@onclick='demoRealValue(1)']")
	WebElement clickfirstgame;
	
	@FindBy(xpath="	//button[@class='pwfbutton hostButton']")
	WebElement host;
   
	@FindBy(xpath="(//li[@class='stat-list ng-tns-c24-0']/span)[2]")
	WebElement movestext;
	
	@FindBy(xpath="(//li[@class='ng-tns-c24-0']/span)[2]")
	WebElement number_of_moves;
	
	@FindBy(xpath="(//li[@class='stat-list ng-tns-c24-0']/span)[3]")
	WebElement scorestext;
	
	@FindBy(xpath="(//li[@class='ng-tns-c24-0']/span)[3]")
	WebElement number_of_scores;
	
	@FindBy(xpath="(//li[@class='img-list ng-tns-c24-0']/img)[1]")
	WebElement homemenu;
	
	@FindBy(xpath="(//li[@class='img-list ng-tns-c24-0']/img)[2]")
	WebElement new_gamemenu;
	
	@FindBy(xpath="(//li[@class='img-list ng-tns-c24-0']/img)[3]")
	WebElement undomenu;
	
	@FindBy(xpath="(//li[@class='img-list ng-tns-c24-0']/img)[4]")
	WebElement statsmenu; 
	
	@FindBy(xpath="(//a[@onclick='demoRealValue(1)']/img)[2]")
	WebElement pokergame;
	
	@FindBy(xpath="//ul[@class='ul1 ng-tns-c85-0']")
	WebElement games_played;
	
	@FindBy(xpath="//ul[@class='ul2 ng-tns-c85-0']")
	WebElement total_bets;
	
	@FindBy(xpath="//ul[@class='ul3 ng-tns-c85-0']")
	WebElement wons;
	
	@FindBy(xpath="//ul[@class='ul4 ng-tns-c85-0']")
	WebElement total_wons;
	
	public WebElement logovisi() {
		return logovisi;
	}
	public WebElement SLOTSBUTTON() {
		return SLOTSBUTTON;
	}
	public WebElement signinbutton() {
		return signinbutton;
	}
	public WebElement playasguestbutton() {
		return playasguestbutton;
	}
	public WebElement coinspopupredee() {
		return coinspopupredee;
	}
	public WebElement CONGRATUPOPUP() {
		return CONGRATUPOPUP;
	}
	public WebElement SOLITAREBUTTON() {
		return SOLITAREBUTTON;
	}
	public WebElement JACKSORBETTERBUTTON() {
		return JACKSORBETTERBUTTON;
	}
	public WebElement backbutton() {
		return backbutton;
	}
	public WebElement forwaredbutton() {
		return forwaredbutton;
	}
	public WebElement clickfirstgame() {
		return clickfirstgame;
	}
	public WebElement host() {
		return host;
	}
	public WebElement movestext() {
		return movestext;
	}
	public WebElement number_of_moves() {
		return number_of_moves;
	}
	public WebElement scorestext() {
		return scorestext;
	}
	public WebElement number_of_scores() {
		return number_of_scores;
	}
	public WebElement homemenu() {
		return homemenu;
	}
	public WebElement new_gamemenu() {
		return new_gamemenu;
	}
	public WebElement undomenu() {
		return undomenu;
	}
	public WebElement statsmenu() {
		return statsmenu;
	}
	public WebElement pokergame() {
		return pokergame;
	}
	public WebElement total_bets() {
		return total_bets;
	}
	public WebElement games_played() {
		return games_played;
	}
	public WebElement wons() {
		return wons;
	}
	public WebElement total_wons() {
		return total_wons;
	}
}
