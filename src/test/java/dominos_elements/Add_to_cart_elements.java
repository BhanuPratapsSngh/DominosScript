package dominos_elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dominos_base.Add_to_cart__base;

public class Add_to_cart_elements extends Add_to_cart__base{
	public Add_to_cart_elements() {
		PageFactory.initElements(driver, this);
	}
	//taking bestseller for selecting pizza
	@FindBy(xpath="//div[@class='img-cvr']/img")
	List<WebElement> phelapizzasele;

	@FindBy(xpath="(//div[@class='img-cvr']/img)[1]")
	WebElement phelapizzaselecli;
	
	@FindBy(xpath="(//button[@class='ng-binding'])[1]")
	WebElement dontallow ;
	
	@FindBy(xpath="//div[@class='injectStyles-sc-1jy9bcf-0 iyLOJH']")
	WebElement likethepro ;
	
	@FindBy(xpath="//div[@class='injectStyles-sc-1jy9bcf-0 jFBmWL']")
	WebElement asslikethepro ;
	
	@FindBy(xpath="//div[@class='sz-scrll mg-t1']/div[2]/div[1]")
	WebElement largpizaass ;
	
	@FindBy(xpath="//div[@class='sz-scrll mg-t1']/div[2]")
	WebElement asspizza ;
	
	@FindBy(xpath="//button[@data-label='addExtracheese']/span")
	WebElement addcheese ;
	
	@FindBy(xpath="//span[text()='REMOVE']")
	WebElement assadd ;
	
	@FindBy(xpath="//div[@class='sc-dVhcbM drnUeU'][1]//div[@class='slider']//ul/li//button/span")
	List<WebElement> addtopings;
	
	@FindBy(xpath="//div[@class='sc-dVhcbM drnUeU'][2]//div[@class='slider']//ul/li//button/span")
	List<WebElement> addnonvegtop;
	
	@FindBy(xpath="(//div[@class='injectStyles-sc-1jy9bcf-0 jItQtr'])/button/span[text()='REMOVE']")
	WebElement assaddtop;
	
	@FindBy(xpath="//button[@class='btn--trnpsnt-wht']/span")
	WebElement addtocartvisi;
	
	@FindBy(xpath="//span[@class='rupee sb-ttl'][text()='1319.00']")
	WebElement asssubtotalfor1;
	
	@FindBy(xpath="//span[@class='rupee sb-ttl'][text()='2258.00']")
	WebElement asssubtotalfor2;
	
	@FindBy(xpath="//span[@class='rupee sb-ttl'][text()='3287.00']")
	WebElement asssubtotalfor3;
	
	@FindBy(xpath="//button[@data-label='miniCartCheckout']/span")
	WebElement clcikcheckout;
	
	@FindBy(xpath="//ul[@class='slider-list']/li/div/div[2]/div[text()='Add']")
	List<WebElement> addwithmeal;
	
	@FindBy(xpath="//div[@data-label='itemsList']/div[@class='sub-hdng']/span[1]")
	WebElement numbersofitemadd;
	
	@FindBy(xpath="//button[@data-label='Place Order']")
	WebElement placeodervisi;
	
	@FindBy(xpath="//div[@class='sc-gzOgki hmPCTW']")
	WebElement getbillinfo;
	
	@FindBy(xpath="(//div[@data-label='increase'])[1]")
	WebElement increaseqquantity;
	
	@FindBy(xpath="(//span[@class='cntr-val'])[1]")
	WebElement threeitem;
	
	public List<WebElement> firstp() {
		return phelapizzasele;
	}
	public WebElement dontallow() {
		return dontallow;
	}
	public WebElement firstpcli() {
		return  phelapizzaselecli;
	}
	public WebElement likepizza() {
		return  likethepro;
	}
	public WebElement asslargepiz() {
		return largpizaass;
	}
	public WebElement asspi() {
		return asspizza;
	}
	public WebElement asli() {
		return asslikethepro;
	}
	public WebElement cheese() {
		return addcheese;
	}
	public WebElement assaddele() {
		return assadd;
	}
	public List<WebElement> addtop() {
		return addtopings;
	}
	public List<WebElement> addnonvegtop() {
		return addnonvegtop;
	}
	public WebElement assaddtops() {
		return assaddtop;
	}
	public WebElement ad2cart() {
		return addtocartvisi;
	}
	public WebElement assad2cart() {
		return asssubtotalfor1;
	}
	public WebElement assad2cart1() {
		return asssubtotalfor2;
	}
	public WebElement assad2cart2() {
		return asssubtotalfor3;
	}
	public WebElement checkoutclick() {
		return clcikcheckout;
	}
	public List<WebElement> addwithmeal() {
		return addwithmeal;}
	
	public WebElement numbersofitemadd() {
			return numbersofitemadd;
		}
	
public WebElement getbillinfo() {
		return getbillinfo;
	}
public WebElement increaseqquantity() {
		return increaseqquantity;
	}
public WebElement placeodervisi() {
	return placeodervisi;
}
public WebElement threeitem() {
	return threeitem;
}
}

