package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Libraries.WebTools;

public class HomePage extends BasePage {

	@FindBy(xpath="//div[text()='Time-Track']")
	private WebElement timeTrack;

	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasks;
	
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement reports;
	
	@FindBy(xpath="//div[text()='Users']")
	private WebElement users;
	
	@FindBy(xpath="//a[text()='Enter Time-Track']")
	private WebElement enterTimeTrack;

	@FindBy(xpath="//a[text()='View Time-Track']")
	private WebElement viewTimeTrack;
	
	@FindBy(xpath="//a[text()='Lock Time-Track']")
	private WebElement lockTimeTrack;
	
	@FindBy(xpath="//a[text()='Approve Time-Track']")
	private WebElement approveTimeTrack;

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logOut;



	public HomePage(WebDriver driver, WebTools wTools) {
		super(driver, wTools);
	}


	public void clickTimeTrack() {
		wTools.clickElement(timeTrack, "Time Track");
	}

	public void clickTasks() {
		wTools.clickElement(tasks, "Time Track");
	}

	public void clickReports() {
		wTools.clickElement(reports, "Reports");
	}

	public void clickEnterTimeTrack() {
		wTools.clickElement(enterTimeTrack, "Enter Time-Track");
	}
	
	public void clickViewTimeTrack() {
		wTools.clickElement(viewTimeTrack, "View Time-Track");
	}
	
	public void clickLockTimeTrack() {
		wTools.clickElement(lockTimeTrack, "Lock Time-Track");
	}
	
	public void clickApproveTimeTrack() {
		wTools.clickElement(approveTimeTrack, "Approve Time-Track");
	}
	
	public void clickUsers() {
		wTools.clickElement(users, "Users");
	}
	
	public void logOut() {
		wTools.clickElement(logOut, "Log Out");
	}
}
