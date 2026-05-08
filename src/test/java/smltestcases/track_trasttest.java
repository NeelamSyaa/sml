package smltestcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.Baseclass;
import pageclass.Loginpage;
import pageclass.track_trace;

@Listeners(listeners.TestListener.class)
public class track_trasttest extends Baseclass {

	@Test
	public void tackmaodule( String un , String up) throws InterruptedException {
		
		Loginpage lp = new Loginpage( driver);
		lp.usernametext(un);
		lp.passwordtext(up);
		Thread.sleep(5000);
		lp.checkboxbtn();
	
		lp.siginbotton();
		
		track_trace t = new  track_trace(driver);
		t.traktraclink();
		t.dwonloadallvin();
		t.SearchVehiclebar();
		t.vincardclick();
   
     
	}
	
}
