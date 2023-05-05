package dominos_base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Greek_for_Greek {
	public static WebDriver driver;
	public static Properties prop =new Properties();

	public void setup() throws IOException{
		try {
		FileInputStream file=new FileInputStream("D:\\sali\\Uber\\greek.properties");
		prop.load(file);
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get(prop.getProperty("grrekpageURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		catch(FileNotFoundException e){
			System.out.println("file nhi mili");
		}
	}

	public void end() {
		driver.quit();
	}

}
