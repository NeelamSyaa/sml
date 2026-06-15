package pageclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Loginpage {
WebDriver driver ;

	@FindBy(id = "outlined-size-small")
	WebElement username;
	 WebDriverWait  wait;
	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	WebElement password;
	@FindBy(xpath = "//input[@class =\"PrivateSwitchBase-input css-1m9pwf3\"]")
	WebElement checkbox;

	@FindBy(xpath = "//button[text() =\"Sign In\"]")
	WebElement siginbtn;
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-t4pc3u']/h4")
	WebElement dashboardPage;
	@FindBy(xpath =  "//div[text()='Success! Logged In']")
	WebElement  Successmassage;
	
	
	public Loginpage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	    wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public void usernametext(String u) {
		username.sendKeys(u);
	}
	public void passwordtext(String p) throws InterruptedException {
		password.sendKeys(p);
		Thread.sleep(8000);
	}
	public void checkboxbtn() throws InterruptedException {
		Thread.sleep(8000);
		checkbox.click();
	}
	public void siginbotton() {
		siginbtn.click();
	}
	// Return dashboard text only
    public String getDashboardText() {

        return dashboardPage.getText();
    }
public void  succmgs() {
String textfun = Successmassage.getText();
System.out.println(" " +textfun);
}
	

}
