package selenium;

import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class ReadWriteExcel {
	WebDriver driver;
	WebDriverWait wait;
    HSSFWorkbook workbook;
    HSSFSheet sheet;
    HSSFCell cell;
    
    @BeforeTest
    public void TestSetup(){
    System.setProperty("webdriver.chrome.driver", "//home//admin//Selenium//chromedriver");
    driver = new ChromeDriver();
    driver.get("http:/49.50.79.181:8080/vcmp_cust_testing");
    driver.manage().window().maximize();
    wait = new WebDriverWait(driver,30);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
