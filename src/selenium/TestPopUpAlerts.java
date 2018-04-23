package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPopUpAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"//home//admin//Selenium//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/vcmp_cust_testing");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user_name']"))
				.sendKeys("ic1");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ic1");
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("idReqHmAdd")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("idBtnSubmitCustAddrs")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		//if (text.equals("Please enter Company Name in General Data-Address"))
			;
		System.out.println(text);
		alert.accept();
		driver.quit();

	}
}
