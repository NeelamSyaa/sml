package Base;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import pageclass.Loginpage;


public class Baseclass {
	public static WebDriver driver ;
	
	@Parameters("browser")
	@BeforeMethod
	public void setuploginpase(String browser ) throws InterruptedException {
	  if(browser.equalsIgnoreCase("chrome")) {
	 driver = new ChromeDriver();
	  }
else if (browser.equalsIgnoreCase("firebox")) {
	 driver = new FirefoxDriver();
}
else if(browser.equalsIgnoreCase("Microsoft Edge")) {
	 driver = new  EdgeDriver();
}
	driver.get("https://pro.smlsaarthi.com/login?redirect=%2F");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	String t = driver.getTitle();
	System.out.println(t);
	}
	
	//@AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
