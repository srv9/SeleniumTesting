package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TempTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//home//admin//Selenium//chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("http://49.50.79.181:8080/gst_am");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		Thread.sleep(5000);
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'Customer Management')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href= 'AdminHome.jsp'])")).click();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
