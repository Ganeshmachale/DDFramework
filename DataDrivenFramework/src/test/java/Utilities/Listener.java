package Utilities;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import pageclass.LoginPageClass;

public class Listener extends Object_Repository implements ITestListener {

    public WebDriver driver;

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

		test.log(Status.FAIL,"Test case: "+result.getMethod().getMethodName()+"is failed ");
		test.log(Status.FAIL, result.getThrowable());
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		Date date=new Date();
		String actualdate=format.format(date);
		String path=System.getProperty("user.dit")+"C:\\Users\\GANESH\\eclipse-workspace\\DataDrivenFramework\\ScreenShots" +actualdate;
		TakesScreenshot screenshot=(TakesScreenshot)LoginPageClass.driver;
		File storage=screenshot.getScreenshotAs(OutputType.FILE);
		File location=new File(path);
		try {
			FileHandler.copy(location, storage);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}

	
    

}
