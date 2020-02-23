package Com.FACEBOOK.Auto.TRAINING02;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Common.Browsers;

public class LISTENERS extends Browsers implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		try {
			screenshots();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
		public void onTestSuccess(ITestResult result) {
			try {
				screenshots();
			}catch (IOException e) {
				e.printStackTrace();
}
}
}