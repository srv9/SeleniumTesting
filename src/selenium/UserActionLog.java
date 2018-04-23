package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UserActionLog {
	
	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "//home//admin//Selenium//chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("http:/49.50.79.181:8080/vcmp_cust_testing");
		driver.findElement(By.id("user_name")).sendKeys("ic1");
		driver.findElement(By.id("password")).sendKeys("ic1");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
	    
		Actions action =new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(5000);// to move scrollbar down
		
/*		WebElement scrollDown = driver.findElement(scroll);
		scrollDown.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(5000);
*/		
		
		driver.findElement(By.id("idReqHmUserActnLg")).click();
		WebElement dateBox=	driver.findElement(By.id("idTxtFromDateCustUAL"));
		dateBox.sendKeys("20122017");
		WebElement dateBox1=driver.findElement(By.id("idTxtToDateCustUAL"));
		dateBox.sendKeys("25122017");
	    driver.findElement(By.id("idBtnApplyCustUAL")).click();
	    
	    driver.quit();
	}

}
