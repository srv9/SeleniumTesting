package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","//home//admin//Selenium//chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("http:/49.50.79.181:8080/vcmp_cust_import");
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1920, 1080));
		driver.findElement(By.id("user_name")).sendKeys("icc11");
		driver.findElement(By.id("password")).sendKeys("icc11");
		driver.findElement(By.id("btnLogin")).click();

		        Thread.sleep(5000);
		        Select inputAM = new Select(driver.findElement(By.id("idInputAM"))); 
		        //inputAM.selectByIndex(6);
		        inputAM.selectByValue("140"); //Select Area Manager
		        Thread.sleep(1000);
		        
		        Select inputCSE = new Select(driver.findElement(By.id("idInputCSE"))); 
		        //inputAM.selectByIndex(6);
		        inputCSE.selectByVisibleText("icse"); //Select CSE
		        Thread.sleep(1000);
		        
		        Select inputMDM = new Select(driver.findElement(By.id("idInputMDM"))); 
		        //inputAM.selectByIndex(6);
		        inputMDM.selectByVisibleText("imdm"); //Select MDM
		        Thread.sleep(1000);
		        
		        Select org2 =new Select(driver.findElement(By.id("idOrganization")));
		        org2.selectByIndex(1); //Org selected  (org 2000)
		        
		        Select inputAM2 = new Select(driver.findElement(By.id("idInputAM"))); 
		        //inputAM.selectByIndex(6);
		        //inputAM2.selectByValue("140"); //Select Area Manager
		        inputAM2.selectByVisibleText("iam1");
		        Thread.sleep(1000);
		        
		        Select inputCSE2 = new Select(driver.findElement(By.id("idInputCSE"))); 
		        //inputAM.selectByIndex(6);
		        inputCSE2.selectByVisibleText("icse"); //Select CSE
		        Thread.sleep(1000);
		        
		        Select inputMDM2 = new Select(driver.findElement(By.id("idInputMDM"))); 
		        //inputAM.selectByIndex(6);
		        inputMDM2.selectByVisibleText("imdm"); //Select MDM
		        Thread.sleep(1000);
		        
		        Select org3 =new Select(driver.findElement(By.id("idOrganization")));
		        org3.selectByIndex(2); //Org selected (org 3000)
		        
		        Select inputAM3 = new Select(driver.findElement(By.id("idInputAM"))); 
		        //inputAM.selectByIndex(6);
		        //inputAM3.selectByValue("140"); //Select Area Manager-3000
		        inputAM3.selectByVisibleText("iam1");
		        Thread.sleep(1000);
		        
		        Select inputCSE3 = new Select(driver.findElement(By.id("idInputCSE"))); 
		        //inputAM.selectByIndex(6);
		        inputCSE3.selectByVisibleText("icse"); //Select CSE-3000
		        Thread.sleep(1000);   
		        
		        Select inputMDM3 = new Select(driver.findElement(By.id("idInputMDM"))); 
		        //inputAM.selectByIndex(6);
		        inputMDM3.selectByVisibleText("imdm"); //Select MDM-3000
		        Thread.sleep(1000);
		        
		        
		        Select org5 =new Select(driver.findElement(By.id("idOrganization")));
		        org5.selectByIndex(3); //Org selected (org 5000)
		        
		        Select inputAM5 = new Select(driver.findElement(By.id("idInputAM"))); 
		        //inputAM.selectByIndex(6);
		        //inputAM5.selectByValue("140"); //Select Area Manager-5000
		        inputAM5.selectByVisibleText("iam1");
		        Thread.sleep(1000);
		        
		        Select inputCSE5 = new Select(driver.findElement(By.id("idInputCSE"))); 
		        //inputAM.selectByIndex(6);
		        inputCSE5.selectByVisibleText("icse"); //Select CSE-5000
		        Thread.sleep(1000);
		        
		        Select inputMDM5 = new Select(driver.findElement(By.id("idInputMDM"))); 
		        //inputAM.selectByIndex(6);
		        inputMDM5.selectByVisibleText("imdm"); //Select MDM-5000
		        Thread.sleep(1000);
		        
		        Select org6 =new Select(driver.findElement(By.id("idOrganization")));
		        org6.selectByIndex(4); //Org selected (org 6000)
		        
		        Select inputAM6 = new Select(driver.findElement(By.id("idInputAM"))); 
		        //inputAM.selectByIndex(6);
		        //inputAM6.selectByValue("140"); //Select Area Manager-6000
		        inputAM6.selectByVisibleText("iam1");
		        Thread.sleep(1000);
		        
		        Select inputCSE6 = new Select(driver.findElement(By.id("idInputCSE"))); 
		        //inputAM.selectByIndex(6);
		        inputCSE6.selectByVisibleText("icse"); //Select CSE-6000
		        Thread.sleep(1000);
		        
		        Select inputMDM6 = new Select(driver.findElement(By.id("idInputMDM"))); 
		        //inputAM.selectByIndex(6);
		        inputMDM6.selectByVisibleText("imdm"); //Select MDM-6000
		        Thread.sleep(1000);
		        
		        Select org7 =new Select(driver.findElement(By.id("idOrganization")));
		        org7.selectByIndex(5);  //ALL
		        
		        
		        
		        driver.findElement(By.linkText("Logout")).click(); //Logout
		        
		        driver.findElement(By.id("user_name")).sendKeys("icc11");
		        driver.findElement(By.id("password")).sendKeys("icc11");
		        driver.findElement(By.id("btnLogin")).click();
		        
		        Thread.sleep(1000);
		        
		        Select org21 =new Select(driver.findElement(By.id("idOrganization")));
		        org21.selectByIndex(1);   //org 2000
		        Thread.sleep(1000);  
		        
		        Select org22 =new Select(driver.findElement(By.id("idOrganization")));
		        org22.selectByIndex(2);   //org 3000
		        Thread.sleep(1000);
		       
		        
		        Select org24 =new Select(driver.findElement(By.id("idOrganization")));
		        org24.selectByIndex(3); //org 5000
		        Thread.sleep(1000);
		        
		        Select org25 =new Select(driver.findElement(By.id("idOrganization")));
		        org25.selectByIndex(4);  //org 6000
		        Thread.sleep(1000);
		        
		        Select org75 =new Select(driver.findElement(By.id("idOrganization")));
		        org75.selectByIndex(5);  //ALL
		        
		        driver.findElement(By.linkText("Logout")).click(); //Logout
		        driver.quit();

	}

}
