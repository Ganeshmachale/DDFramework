package testcaseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilities.Listener;
import Utilities.Xls_Reader;
import baseclass.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageclass.LoginPageClass;

    @Listeners(Listener.class)

public class TestCaseClass  extends BaseClass {
	
	String path="C:\\Users\\GANESH\\eclipse-workspace\\DataDrivenFramework\\src\\test\\resources\\ExcelFile_Data.xlsx";
	Xls_Reader read=new Xls_Reader(path);
		
    @Test(priority=1)
    public void title()
    {
    	LoginPageClass lp=new LoginPageClass(driver);
    	lp.gettitle();
    }
    
    @Test(priority=2)
    public void clickloginbtn1()
    {
    	LoginPageClass lp=new LoginPageClass(driver);
    	lp.clickloginbtn1();
    }
    
    @Test(priority=3)
    public void usernamepassword()
    {
    	String username1=read.getCellData("Sheet1", "username", 2);
    	String password1=read.getCellData("Sheet1", "password", 3);
  //  	int all=read.getCellRowNum(password1, username1, password1);
    	LoginPageClass lp=new LoginPageClass(driver);
    	lp.usernameNpassword(username1, password1);
    	
    }
    
    @Test(priority=4)
    public void clickloginbtn2()
    {
    	LoginPageClass lp=new LoginPageClass(driver);
    	lp.clkloginbtn2();
    }
    
//    @Test(priority=5)
//    public void clickmylearningbtn()
//    {
//    	LoginPageClass lp=new LoginPageClass(driver);
//    	lp.mylearn();
//    }
    
    @Test(priority=6)
    public void logoutbttn()
    {
    	LoginPageClass lp=new LoginPageClass(driver);
    	lp.logoutbtn();
    }
   
}
