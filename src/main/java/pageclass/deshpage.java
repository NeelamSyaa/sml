package pageclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class deshpage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div[2]")
	WebElement gotolinkhelthstatu;
	@FindBy(xpath = "//p[text()=\"Health Status\"]")
	WebElement HealthStatuspage;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Search\"]")
	WebElement Serchfiled;
	
    @FindBy(xpath ="/html/body/div[2]/div[3]/div/div/div[1]/div[2]//button")
    WebElement filtterbtn;
    
    @FindBy(xpath = "//p[text()= 'Download']")
    WebElement dwonloadbtn;
    
    @FindBy(xpath = "//p[text()=\"Download Excel\"]")
    WebElement dwonloadexcle;
    
    @FindBy(xpath="//button[text()=\"Close\"]")
    WebElement cloasegotolink;
    
	public deshpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void gotolink() {
		gotolinkhelthstatu.click();
		           
	
	}
	public void HealthStatuspa() {
	 String a = HealthStatuspage.getText();
	 String e = "Health Status";
		 Assert.assertEquals(a, e);
	
	}

	public void Serchtext() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	    WebElement search	=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search\"]")));
	    		
	    search.clear();
	    search.sendKeys("MBUZT54AKK0337006");
	}
	
/*	public void  filtter() {
		filtterbtn.click();
  
	}
	*/
	public void dwonload() {
		dwonloadbtn.click();
	}
	public void dwonloadexcle() {
		dwonloadexcle.click();
	}
	public void cloasegotobtn() {
		cloasegotolink.click();
	}
}
