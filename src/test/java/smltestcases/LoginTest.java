//package smltestcases;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//
//import org.openqa.selenium.Alert;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import Base.Baseclass;
//import pageclass.Loginpage;
//@Listeners(listeners.TestListener.class)
//public class LoginTest extends Baseclass{
//
//
//	@Test(dataProvider = "loginTest")
//	public  void loginTest(String uname, String pwd) throws InterruptedException {
//		
//	  Loginpage lp = new Loginpage(driver);
//	  
//		lp.usernametext(uname);
//		lp.passwordtext(pwd);
//		Thread.sleep(8000);
//		lp.checkboxbtn();
//		lp.siginbotton();
//		lp.getDashboardText();
//		lp.succmgs();
//		Thread.sleep(3000);
//
//	 	 String actual = lp.getDashboardText();
//
//	        String expected = "Dashboard";
//
//	        Assert.assertEquals(actual, expected);
//
//	        System.out.println("Dashboard verified successfully");
//	        Robot robot = null;
//			try {
//				robot = new Robot();
//			} catch (AWTException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//	        // Click OK button
//	        robot.keyPress(KeyEvent.VK_ENTER);
//	        robot.keyRelease(KeyEvent.VK_ENTER);
//	}
//	
//  
//  @DataProvider(name ="loginTest")
//  public Object[][]getdata(){
//	return  new Object [][] {
//		{"8296574063","8296574063"},
////		{"8296574063"," "},
////		{" ","8296574063"},
////		{"829657406","82965740633"},
////		{" 35646@##5","@#$%^&&&fvdhhkuhkhmnbn "},
////		{" ghfghfghfghfgh","  yr5y65785        m  56788758"},
////		{" ' OR '1'='1",""}
//		
//	} ;
//			
//	  
//  }
//  
//
//}
