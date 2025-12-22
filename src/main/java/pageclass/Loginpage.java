package pageclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Loginpage {
WebDriver driver ;
	@FindBy(id = "outlined-size-small")
	WebElement username;

	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	WebElement password;
	@FindBy(xpath = "//input[@class =\"PrivateSwitchBase-input css-1m9pwf3\"]")
	WebElement checkbox;

	@FindBy(xpath = "//button[text() =\"Sign In\"]")
	WebElement siginbtn;
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-t4pc3u']/h4")
	WebElement deshboappage;
	
	
	public Loginpage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

	public void usernametext() {
		username.sendKeys("9180000019");
	}
	public void passwordtext() throws InterruptedException {
		password.sendKeys("9180000019");
		Thread.sleep(8000);
	}
	public void checkboxbtn() throws InterruptedException {
		Thread.sleep(8000);
		checkbox.click();
	}
	public void siginbotton() {
		siginbtn.click();
	}
	public void deshboappagetext() {
		deshboappage.click();
		String actual = deshboappage.getText();
	    String  ex = "Dashboard";
	    
		Assert.assertEquals(actual, ex);
	  System.out.println("actual text is :"+ actual );
	}
	
}
