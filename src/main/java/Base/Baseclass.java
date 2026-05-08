package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baseclass {

    public static WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setuploginpase(String browser) {

        try {

            if (browser == null) {
                browser = "chrome"; // default browser
            }

            if (browser.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();

            } else if (browser.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();

            } else if (browser.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();

            } else {
                System.out.println("Invalid browser, launching Chrome");
                driver = new ChromeDriver();
            }

            driver.manage().window().maximize();

            driver.manage().timeouts()
                    .implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://pro.smlsaarthi.com/login?redirect=%2F");

            System.out.println("Title: " + driver.getTitle());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}