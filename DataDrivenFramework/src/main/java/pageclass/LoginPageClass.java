package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageClass {
 
	public static WebDriver driver;

	@FindBy (xpath="//*[@id=\"w3loginbtn\"]")            //decleartion
	private WebElement loginbtn1;
	
	@FindBy (xpath="//*[@id=\"modalusername\"]")
	private WebElement username;
	
	@FindBy (css="input[id='current-password']")
	private WebElement password;
	                
	@FindBy (xpath="//button[text()='']")
	private WebElement loginbutn2;
	
	@FindBy (xpath="//a[text()=' Explore now']")
	private WebElement mylearningbtn;
	               
	@FindBy (xpath="//*[@id=\"navigation\"]/div/button")
	private WebElement logout;
	
	public LoginPageClass(WebDriver driver)
	{
		LoginPageClass.driver=driver;            //initialisation
		PageFactory.initElements(driver, this);
	}

    public void gettitle()
    {
    	String title=driver.getTitle();
    	Assert.assertEquals(title, "W3Schools Online Web Tutorials");
    }
    
    public void clickloginbtn1()
    {
    	Assert.assertTrue(loginbtn1.isDisplayed());
    	loginbtn1.click();
    }
    
    public void usernameNpassword(String username,String password)
    {
    	this.username.sendKeys(username);
    	this.password.sendKeys(password);
    }
    
    public void clkloginbtn2()
    {
    	Assert.assertTrue(loginbutn2.isDisplayed());
    	loginbutn2.click();
    }
    
    public void logoutbtn()
    {
            	logout.click();
    }
}