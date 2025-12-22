package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class track_tras {
WebDriver driver;
	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item css-ksofwo\"]/ul[1]/li[2]/a")
	WebElement traktraclink;
	
	public track_tras(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

	public void traktraclink() {
		traktraclink.click();
	}
}