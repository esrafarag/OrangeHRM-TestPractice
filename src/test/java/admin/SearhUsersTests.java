package admin;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;


public class SearhUsersTests extends Base{
	String searchText = "Admin";
  @Test
  public void searchForValidUserTest() {
	  
	 loginPage.login("Admin","admin123");
	 homePage.openAdminPage();
	 adminPage.searchForUser(searchText);
	 Assert.assertEquals(adminPage.getFirstSearchResult(), searchText);
  }
}
