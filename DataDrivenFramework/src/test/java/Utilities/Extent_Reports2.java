package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Reports2 extends Object_Repository{
	

public static ExtentReports setupExtentReport() {
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		Date date=new Date();
		String actualDate=format.format(date); 
		String path=System.getProperty("user.dir")+"C:\\Users\\GANESH\\eclipse-workspace\\DataDrivenFramework\\target\\Reports"+actualDate + ".html";
	    ExtentSparkReporter sparkReport=new ExtentSparkReporter (path);
		extent=new ExtentReports(); 
		extent.attachReporter (sparkReport);
		
		sparkReport.config().setDocumentTitle("DocumentTitle");
		sparkReport.config().setTheme (Theme.DARK);
		sparkReport.config().setReportName("ReportName");
		return extent;
		}
}