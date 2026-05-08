package smltestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Baseclass;
import pageclass.Loginpage;
import pageclass.Reportspage;

public class ReportTest extends Baseclass {

	@Test
    public void report( String u , String p) throws InterruptedException {

        // Login Page
        Loginpage lp = new Loginpage(driver);

        lp.usernametext(u);

        lp.passwordtext(p);

        lp.checkboxbtn();

        lp.siginbotton();

        // Reports Page
        Reportspage rp = new Reportspage(driver);

        rp.Reportspagetext();
        rp.colllectiondropdwon();
        rp.Selectcoustom();
        rp.selectDate("May 2026", "7");

        // Expected Result
        String expected = "Reports";

        // Actual Result (CORRECT WAY)
        String actual = driver.findElement(
                By.xpath("//h4[text()='Reports']")
        ).getText();

        // Assertion
        Assert.assertEquals(actual, expected);

        System.out.println("Reports page verified successfully");
    }
}
