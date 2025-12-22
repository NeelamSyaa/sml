package pageclass;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class track_trace {
	WebDriver driver;
	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item css-ksofwo\"]/ul[1]/li[2]/a")
	WebElement traktraclink;
	@FindBy(xpath="//button[text()=\"Download\"]")
	WebElement dwonloadallvin;
	@FindBy(xpath = "//input[@placeholder=\"Search Vehicle\"]")
	WebElement SearchVehicle;
	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item css-f1jhil\"]/div/div/div/div")
	WebElement vincard;
	@FindBy(xpath = "//p[text()=\"Dealer\"]")
	WebElement dealerlink;
	@FindBy(xpath = "//h4[text()=\"Track and trace\"]")
	WebElement validationnewwin;

	public track_trace(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void traktraclink() {
		traktraclink.click();
	}
	
	public void dwonloadallvin() {
	
		dwonloadallvin.click();
	}
	public void SearchVehiclebar() {
		SearchVehicle.sendKeys("PB65BL9719");
	}

	public void vincardclick() {
		vincard.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", vincard);

	}

	public String clickDealerAndSwitchToChild() {
		String fistwin = driver.getWindowHandle();
		dealerlink.click();

		Set<String> allnewwin = driver.getWindowHandles();

		for (String win : allnewwin) {
			if (!win.equals(fistwin)) {
				driver.switchTo().window(win);

			}

		}
		return fistwin;

	}

	public String validationnewpage() {
	  return validationnewwin.getText();
	
	}

	public String newwinURl() {
		return driver.getCurrentUrl();
	}
}