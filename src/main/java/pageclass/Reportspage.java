package pageclass;

import java.time.Duration;
import java.util.concurrent.ExecutionException;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Baseclass;

public class Reportspage {

private	WebDriver driver;
private	WebDriverWait Wait ;
	@FindBy(xpath="///span[text()='Fleet Reports']")
	 private WebElement reportsSidebar;
	 
	
	//   handle the  colender
	 @FindBy(xpath = "//div[@id=\"menu-\"]")
	 private WebElement  dropdwoncollender;
	 //click the  coustom date
	 
	 @FindBy(xpath = "//ul[@class =\"MuiList-root MuiList-padding MuiMenu-list css-r8u8y9\"]//li[1]")
	 
	 private WebElement Custom;

	public Reportspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
	}

	
	public void Reportspagetext() {
		
		 Wait.until(ExpectedConditions.elementToBeClickable(reportsSidebar));
		 reportsSidebar.click();
	}
	
	public void   colllectiondropdwon() {
		dropdwoncollender.click();
	}
	
	public void Selectcoustom() {
		Custom.click();
	}
	

    // Dynamic Calendar Method
    public void selectDate(String monthYear, String day) {

        while (true) {

            String currentMonth = driver.findElement(
                    By.xpath("//div[contains(@class,'MuiPickersCalendarHeader-label')]")
            ).getText();

            if (currentMonth.equals(monthYear)) {
                break;
            }

            driver.findElement(
                    By.xpath("//button[@aria-label='Next month']")
            ).click();
        }

        driver.findElement(
                By.xpath("//button[text()='" + day + "']")
        ).click();
    }
}



