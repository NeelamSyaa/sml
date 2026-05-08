package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.Baseclass;
import ConfigReaderutil.Screenshot;

public class TestListener extends Baseclass implements ITestListener{

	
	@Override
	public void onTestFailure(ITestResult result) {
		Screenshot.takescreenshortforfailedtest(driver);
		System.out.println("Test Started : "
                + result.getName());
	}

	

	
}
