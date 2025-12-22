package smltestcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.Baseclass;
import pageclass.Loginpage;
import pageclass.track_trace;

@Listeners(listeners.TestListener.class)
public class track_trasttext extends Baseclass {

	@Test
	public void tacktacevin() throws InterruptedException {
		
		Loginpage lp = new Loginpage( driver);
		lp.usernametext();
		lp.passwordtext();
		lp.checkboxbtn();
	
		lp.siginbotton();
		
		track_trace t = new  track_trace(driver);
		t.traktraclink();
		t.SearchVehiclebar();
		t.vincardclick();

        // Window handling
        String parentWindow = t.clickDealerAndSwitchToChild();

        // URL validation
        Assert.assertTrue(
            driver.getCurrentUrl().contains("nearby"),
            "Dealer URL validation failed"
        );

        
		// Header validation
        String headerText = t.validationnewpage()
                .replace("/", "")
                .trim()
                .toLowerCase();

Assert.assertTrue(
headerText.contains("track and trace"),
"Track and Trace header validation failed"
);

        // Close child and switch back
        driver.close();
        driver.switchTo().window(parentWindow);
	}
	
}
