package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadWriteExcelNG {
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


public void ReadData() throws IOException  {
  File src =new File("//home//admin//Documents//TestData.xlsx");
  FileInputStream finput =new FileInputStream(src);
  workbook =new HSSFWorkbook(finput);
  sheet =workbook.getSheetAt(0);
  
  for(int i=1; i&amp;lt;=sheet.getLastRowNum(); i++)
  {
	  cell=sheet.getRow(i).getCell(2);
	  cell.setCellType(Cell.CELL_TYPE_STRING);
	  driver.findElement(By.id("login-password")).sendKeys(cell.getStringCellValue())
  }


}
}