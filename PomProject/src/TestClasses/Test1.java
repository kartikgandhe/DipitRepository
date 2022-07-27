package TestClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomPackage.HomePage;
import PomPackage.LoginPage;

public class Test1 {

	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver123 = new ChromeDriver();
		//driver123.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver123.get("https://www.facebook.com/");
		
		LoginPage loginpage = new LoginPage(driver123);
		loginpage.sendUsername();
		loginpage.sendpassword();
		loginpage.clickonlogin();
		
		HomePage homepage = new HomePage(driver123);
		homepage.clickonMarketplaceButton();
	}
}
