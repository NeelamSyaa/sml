package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.Baseclass;
import ScreenshotUtil.Screenshot;

public class TestListener extends Baseclass implements ITestListener{

	
	@Override
	public void onTestFailure(ITestResult result) {
		Screenshot.takescreenshortforfailedtest(driver);
		
	}

	
}
