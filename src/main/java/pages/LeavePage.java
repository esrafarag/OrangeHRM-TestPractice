package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class LeavePage {
	
	WebDriver driver;
	private By assignLeaveTab = By.id("menu_leave_assignLeave");
	private By formTitle = By.id("assign-leave");
	private By empolyeeNamefield = By.id("assignleave_txtEmployee_empName");
	private By leaveTypefield = By.id("assignleave_txtLeaveType");
	private By calendar = By.className("ui-datepicker-trigger");
	private By fromDay = By.xpath("//*[@id='ui-datepicker-div']//tr[5]/td[2]");
	private By toDay = By.xpath("//*[@id='ui-datepicker-div']//tr[5]/td[2]");
	private By durationfield = By.id("assignleave_duration_duration");
	private By commentfield = By.id("assignleave_txtComment");
	private By assignButton = By.id("assignBtn");
	private By successConfirmationMessage = By.xpath("//*[@id='assign-leave']/div[2]");
	
	public LeavePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void openAssignLeavePage() {
		driver.findElement(assignLeaveTab).click();
	
	}
	
	public String getFormTitle() {
		
		String formTitleText= driver.findElement(formTitle).getText();
		return formTitleText;
		
	}
	
	public void enterEmpolyeeName(String empolyeeName) {
		driver.findElement(empolyeeNamefield).sendKeys(empolyeeName);
	}
	public void enterLeaveType(String leaveTypeOption) {
		
		Select leaveType = new Select(driver.findElement(leaveTypefield));
		leaveType.selectByVisibleText(leaveTypeOption);
	}
public void enterFromDate() {
		driver.findElement(calendar).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(fromDay));
		driver.findElement(fromDay).click();
	}
public void enterToDate() {
	driver.findElement(calendar).click();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(toDay));
	driver.findElement(toDay).click();
}
public void enterDuration(String durationOption) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(durationfield));
	
	Select leaveType = new Select(driver.findElement(durationfield));
	leaveType.selectByVisibleText(durationOption);
}
public void enterComment (String comment) {
	driver.findElement(commentfield).sendKeys(comment);
}

public void clickAssignButton() {
	
	driver.findElement(assignButton).click();
	
}

public String getAssignLeaveConfirmation() {
	
	String confirmationMessageText = driver.findElement(successConfirmationMessage).getText();
	return confirmationMessageText;
	
	
}
}
