package smltestcases;

import org.testng.annotations.Test;

import Base.Baseclass;
import pageclass.Loginpage;

public class logintext  extends Baseclass{

	
  @Test
	public  void logintestcases() throws InterruptedException {
		
	  Loginpage lp = new Loginpage(driver);
		lp.usernametext();
		lp.passwordtext();
		lp.checkboxbtn();
		lp.siginbotton();
	 	lp.deshboappagetext();
	 	
	}

}
