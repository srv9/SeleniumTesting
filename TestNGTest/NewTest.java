package TestNGTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {

	@BeforeMethod
	public void setup() {
     System.out.println("Setup done");
		
	}      
	@Test
	public void LoginTest() {
		System.out.println("Login done");
	}
	@Test
	public void UserTest() {
	System.out.println("UserTest done");
	}
   @Test
   public void TearDown(){
    System.out.println("TearDown Method done");
   }
}
