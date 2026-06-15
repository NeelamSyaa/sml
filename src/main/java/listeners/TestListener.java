package listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.Baseclass;
import ConfigReaderutil.Screenshot;

public class TestListener extends Baseclass implements ITestListener{

	
	@Override
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot.takescreenshortforfailedtest(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test Started : "
                + result.getName());
	}

	

	
}
