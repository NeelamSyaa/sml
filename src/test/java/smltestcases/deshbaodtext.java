package smltestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.Baseclass;
import pageclass.Loginpage;
import pageclass.deshpage;

public class deshbaodtext extends Baseclass{
	
	@Test
	public void  gotolindatapage() throws InterruptedException {
		Loginpage lp = new Loginpage( driver);
		lp.usernametext();
		lp.passwordtext();
		lp.checkboxbtn();
		Thread.sleep(1000);
		lp.siginbotton();
		lp.deshboappagetext();
		
		deshpage d = new deshpage(driver);
		d.gotolink();
		d.Serchtext();
		//d.filtter();
		d.dwonload();
		d.dwonloadexcle();
		d.cloasegotobtn();
	}
 
}
