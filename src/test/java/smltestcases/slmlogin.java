package smltestcases;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class slmlogin {
	static WebDriver driver ;
	
	@Test
	public static void loginpage() {
	 driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("")).sendKeys("");;
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
		
	
	}
	@Test
	public  static  void homepage() {
		
	   WebElement ActualResulte = driver.findElement(By.id(""));
	    ActualResulte.getText();
	   String  Expectedresulte = "";
	   
		
		Assert.assertEquals(ActualResulte , Expectedresulte , "text is not matching  ");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		             File desh = ts.getScreenshotAs(OutputType.FILE);
		              File scr = new  File("./data/Sceenshort.png");
		              //FileUtil.copyFile(desh , scr);
	}
	
	@Test
	public static void  getmultiplewindow() {
		
	     String fistwindow = driver.getWindowHandle() ; 
	     Set<String> allwindow = driver.getWindowHandles();
	     
	     for( Object win :allwindow.tocahrArray())
	}
	
}
