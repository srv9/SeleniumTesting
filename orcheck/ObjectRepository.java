package orcheck;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
	
		
		Properties prop = new Properties();
		FileInputStream io =new FileInputStream("//home//admin//Documents//Selenium//SeleniumAutomation//orcheck//config.properties");
		prop.load(io);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("Npassword"));
		String url =prop.getProperty("URL");
		System.out.println(url);
		String browserName =prop.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","//home//admin//Selenium//chromedriver");
			driver =new ChromeDriver();
		} 
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(prop.getProperty("userid_xpath"))).sendKeys(prop.getProperty(("userid")));
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty(("password")));
		driver.findElement(By.xpath(prop.getProperty("Login_xpath"))).click();
		Thread.sleep(5000);

	}

}
