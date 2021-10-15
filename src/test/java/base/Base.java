package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.AdminPage;
import pages.HomePage;
import pages.LeavePage;
import pages.LoginPage;

     
public class Base {
	WebDriver driver;
	private String loginURL = "https://opensource-demo.orangehrmlive.com/";
	public LoginPage loginPage;
	public HomePage homePage;
	public AdminPage adminPage;
	public LeavePage leavePage;
	
	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

	}
	@BeforeMethod 
	public void beforemethod() {
		
		driver = new ChromeDriver();
		driver.get(loginURL);
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		adminPage=new AdminPage(driver);
		leavePage= new LeavePage(driver);
	}

 
}
