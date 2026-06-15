package ConfigReaderutil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.internal.annotations.ITest;

public class Screenshot implements ITestListener {
	
	WebDriver driver;

	public static void takescreenshortforfailedtest(WebDriver driver) throws IOException {

		  if (driver != null) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File desh = new File("./screenshots/failure.png");
			FileUtils.copyFile(src, desh);
		}  else {
			System.out.println("driver is null. Cannot take screenshot.");
		}
	}}

