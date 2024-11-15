package genricutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListnerUtility extends BaseClassUtility implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		test=extReport.createTest(result.getName());// object creation of extent test
	}
	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getName()+"is failed");
		TakesScreenshot ts=(TakesScreenshot)sdriver;
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));//to add screenshot in extent report
		
		// to add screenshot in screenshots folder
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/"+result.getName()+jutil.getSystemTime()+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}

}
