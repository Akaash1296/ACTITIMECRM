package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Libraries.WebTools;

public class LoginPage extends BasePage {

	 @FindBy(name="username")
	 private WebElement userName;
	 
	 @FindBy(name="pwd")
	 private WebElement password;
	 
	 @FindBy(xpath="//div[text()='Login ']")
	 private WebElement logIn;
	 
	 public LoginPage(WebDriver driver, WebTools wTools) {
		 super(driver, wTools);
	 }
	 
	 public void setuserName(String username) {
		 wTools.typeText(userName, "User Name", username);
	 }
	 
	 public void setPassword(String pwd) {
		 wTools.typeText(password, "Password", pwd);
	 }
	 
	 public void clickLogin() {
		wTools.clickElement(logIn, "Log In");
	 }
	 
	 
}
