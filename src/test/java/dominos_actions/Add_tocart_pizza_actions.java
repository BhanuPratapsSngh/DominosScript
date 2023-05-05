package dominos_actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dominos_elements.Add_to_cart_elements;

public class Add_tocart_pizza_actions extends Add_to_cart_elements {
	Add_to_cart_elements oder_pizza=new Add_to_cart_elements();
	
	public void a_clickonpizza() throws InterruptedException {
	oder_pizza.firstp().get(0).click();
	Thread.sleep(4000);
	}
	public void  a_likethepizza()  throws InterruptedException {
		Thread.sleep(4000);
		oder_pizza.likepizza().click();
		}
	public void  a_badapizzalarg()  throws InterruptedException {
		Thread.sleep(4000);
		oder_pizza.asslargepiz().click();
		}
	public void  a_cheeseadd()  throws InterruptedException {
		Thread.sleep(4000);
		oder_pizza.cheese().click();
		}
	public void  a_adtop()  throws InterruptedException {
			Thread.sleep(4000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();",oder_pizza.addtop().get(1));
			js.executeScript("arguments[0].click();",oder_pizza.addtop().get(3));
			js.executeScript("arguments[0].click();",oder_pizza.addtop().get(0));
			js.executeScript("arguments[0].click();",oder_pizza.addtop().get(4));
			js.executeScript("arguments[0].click();",oder_pizza.addtop().get(5));
			js.executeScript("arguments[0].click();",oder_pizza.addtop().get(6));
			js.executeScript("arguments[0].click();",oder_pizza.addtop().get(7));
			js.executeScript("arguments[0].click();",oder_pizza.addtop().get(2));
			Thread.sleep(4000);
			}
	public void  a_adnontop()  throws InterruptedException {
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",oder_pizza.addnonvegtop().get(1));
		js.executeScript("arguments[0].click();",oder_pizza.addnonvegtop().get(3));
		js.executeScript("arguments[0].click();",oder_pizza.addnonvegtop().get(0));
		js.executeScript("arguments[0].click();",oder_pizza.addnonvegtop().get(4));
		js.executeScript("arguments[0].click();",oder_pizza.addnonvegtop().get(5));
		js.executeScript("arguments[0].click();",oder_pizza.addnonvegtop().get(6));
		js.executeScript("arguments[0].click();",oder_pizza.addnonvegtop().get(2));
		Thread.sleep(4000);
		}
	public void  a_clickadd()  throws InterruptedException {
		Thread.sleep(4000);
		oder_pizza.ad2cart().click();
		}
	public void a_clickonpizza1() throws InterruptedException {
	oder_pizza.firstp().get(1).click();
	Thread.sleep(4000);
	}
	public void a_clickonpizza2() throws InterruptedException {
		oder_pizza.firstp().get(2).click();
		Thread.sleep(4000);
		}
	public void  a_addwithmeal()  throws InterruptedException {
			Thread.sleep(4000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()",oder_pizza.addwithmeal().get(0));
			js.executeScript("arguments[0].click();",oder_pizza.addwithmeal().get(1));
			js.executeScript("arguments[0].click();",oder_pizza.addwithmeal().get(2));
			js.executeScript("arguments[0].click();",oder_pizza.addwithmeal().get(3));
			Thread.sleep(4000);
			}
	public void  a_numbersofitemadd()  throws InterruptedException {
				Thread.sleep(4000);
		oder_pizza.numbersofitemadd();
				}
	public void a_increaseqquantity2() throws InterruptedException {
		Thread.sleep(3000);
		oder_pizza.increaseqquantity().click();
		Thread.sleep(3000);
		oder_pizza.increaseqquantity().click();
	}
}
