package login;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.Base;
import pages.HomePage;



public class LoginTests extends Base{
	
	String validUsername = "Admin";
    String validPassword = "admin123";
  @Test
  public void testSuccessfulLogin() {
	 HomePage homePage = loginPage.login(validUsername, validPassword);
     Assert.assertEquals(homePage.getWelcomeMessageText(), "Welcome Paul");
  }
}

