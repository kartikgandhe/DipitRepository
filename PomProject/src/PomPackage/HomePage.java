package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy (xpath = "//span[text()='Friends']")
	private WebElement friends;
	
	@FindBy (xpath = "//a[@aria-label='Marketplace']")
	private WebElement marketplace;
	
	@FindBy (xpath = "//a[@aria-label='Notifications']")
	private WebElement notifications;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonFriendsButton()
	{
		friends.click();
	}
	public void clickonMarketplaceButton()
	{
		marketplace.click();
	}
	public void clickonNotificationsButton()
	{
		notifications.click();
	}
}
