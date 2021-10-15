package logout;

import org.testng.annotations.Test;

import base.Base;

public class logoutTests extends Base {
  @Test
  public void testSuccessLogout() {
	  loginPage.login("Admin","admin123");
	  homePage.logOut();
	  
  }
}
