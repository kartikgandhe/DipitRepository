package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (xpath = "//input[@id='email']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[text()='Log In']")
	private WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendUsername()
	{
		username.sendKeys("kartik2384@gmail.com");
	}
	public void sendpassword()
	{
		password.sendKeys("kartik9188");
	}
	public void clickonlogin()
	{
		login.click();
	}
}
