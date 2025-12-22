package smltestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.Baseclass;
import pageclass.Loginpage;
import pageclass.track_tras;

public class track_trasttext extends Baseclass {

	@Test
	public void tacktacevin() throws InterruptedException {
		
		Loginpage lp = new Loginpage( driver);
		lp.usernametext();
		lp.passwordtext();
		lp.checkboxbtn();
	
		lp.siginbotton();
		
		track_tras t = new  track_tras(driver);
		t.traktraclink();
		
	}
	
}
