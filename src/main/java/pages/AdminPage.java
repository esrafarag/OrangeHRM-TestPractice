package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
 
	WebDriver driver;
	private By searchBox = By.name("searchSystemUser[userName]");
	private By searchButton = By.name("_search");
	private By firstSearchResult = By.xpath("//*[@id='resultTable']//td[2]");
	
	public AdminPage(WebDriver driver) {
		this.driver=driver;
	}
	public void searchForUser(String searchText) 
	{
	driver.findElement(searchBox).sendKeys(searchText);
	driver.findElement(searchButton).click();
	}
	
	public String getFirstSearchResult() 
	{
		return driver.findElement(firstSearchResult).getText();
	}
}
