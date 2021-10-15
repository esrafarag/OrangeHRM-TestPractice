package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	private By welcomeMessage = By.id("welcome");
	private By adminTab = By.id("menu_admin_viewAdminModule");
	private By leaveTab = By.id("menu_leave_viewLeaveModule");
	private By logOutMenu = By.id("welcome");	
	private By logOutButton= By.linkText("Logout");

	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getWelcomeMessageText() {
		String welcomeMessageText = driver.findElement(welcomeMessage).getText();
		return welcomeMessageText;
		
	} 
	
	public AdminPage openAdminPage() {
		
		driver.findElement(adminTab).click();
		return new AdminPage(driver);
	}
	
	public LeavePage openLeavePage() {
		
		driver.findElement(leaveTab).click();
		return new LeavePage(driver);
		
	}

	public void logOut() 
	{
		driver.findElement(logOutMenu).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(logOutButton));
		driver.findElement(logOutButton).click();
	}
			
}
