package dominos_testcase;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRM {
	WebDriver driver;
	@BeforeClass
	public void first() {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	}
	@Test
	public void resize() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Username']"))).click(driver.findElement(By.xpath("//input[@placeholder='Username']"))).sendKeys("Admin").build().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Password']"))).click(driver.findElement(By.xpath("//input[@placeholder='Password']"))).sendKeys("admin123").build().perform();
		Thread.sleep(3000);
		act.click(driver.findElement(By.xpath("//button[text()=' Login ']"))).click(driver.findElement(By.xpath("//button[text()=' Login ']"))).perform();
		Thread.sleep(3000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/performance/reviewEvaluate/id/17");
		Thread.sleep(3000);
		WebElement ri=driver.findElement(By.xpath("(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical orangehrm-evaluation-grid-comment'])[1]"));
		JavascriptExecutor exi=(JavascriptExecutor)driver;
		exi.executeScript("arguments[0].scrollIntoView(true);", ri);
		Thread.sleep(3000);
//		TC025_Interactions_Resizable resize=new TC025_Interactions_Resizable();
//		resizable(ri, 200, 100);
		act.dragAndDropBy(ri, 0, 100).perform();
		Thread.sleep(9000);
	}
}
