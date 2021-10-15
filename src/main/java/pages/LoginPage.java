package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	private By userNameTextBox = By.name("txtUsername");
	private By passwordTextBox = By.name("txtPassword");
	private By loginButton = By.name("Submit");
	
	public LoginPage (WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void openLoginPage(String loginURL){
		
		driver.get(loginURL);
		
	}
	
	public HomePage login(String username,String password) {
		driver.findElement(userNameTextBox).sendKeys(username);
		driver.findElement(passwordTextBox).sendKeys(password);
		driver.findElement(loginButton).click();
		return new HomePage(driver);
		
	}

}
