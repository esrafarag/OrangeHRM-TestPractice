package leave;



import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;

public class AssignLeaveTests extends Base{
  @Test
  public void testOpenAssignLeaveForm() {
	  loginPage.login("Admin","admin123");
	  homePage.openLeavePage();
	  leavePage.openAssignLeavePage();
	  Assert.assertTrue(leavePage.getFormTitle().contains("Assign Leave"));
  }
  
  @Test
  public void TestAssignLeave() {
	  loginPage.login("Admin","admin123");
	  homePage.openLeavePage();
	  leavePage.openAssignLeavePage();
	  leavePage.enterEmpolyeeName("Paul Collings");
	  leavePage.enterLeaveType("CAN - Personal");
	  leavePage.enterFromDate();
	  leavePage.enterToDate();
	  leavePage.enterDuration("Full Day");
	  leavePage.enterComment("Assign Leave Test");
	  leavePage.clickAssignButton();
	  leavePage.getAssignLeaveConfirmation();
	  Assert.assertTrue(leavePage.getAssignLeaveConfirmation().contains("Successfully Assigned"));
  }
}
