package smltestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.Baseclass;
import pageclass.Loginpage;
import pageclass.deshpage;
@Listeners(listeners.TestListener.class)
public class deshbaodtext extends Baseclass{
	
	@Test
	public void  gotolindatapage(String u , String pw) throws InterruptedException {
		Loginpage lp = new Loginpage( driver);
		lp.usernametext(u);
		lp.passwordtext(pw);
		Thread.sleep(7000);
		lp.checkboxbtn();
		Thread.sleep(6000);
		lp.siginbotton();
		lp.getDashboardText();
		
		deshpage d = new deshpage(driver);
		d.gotolink();
		d.Serchtext();
		//d.filtter();
		d.dwonload();
		d.dwonloadexcle();
		d.cloasegotobtn();
	}
 
}
