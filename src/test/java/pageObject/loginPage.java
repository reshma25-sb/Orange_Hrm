package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	By username = By.name("username");
	By password = By.name("password");
	By login = By.xpath("//button[@type='submit']");
	
	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public void enterUserName(String user ,String pwd) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void loginUser() {
		driver.findElement(login).click();
	}

	public void login(WebDriver driver,String user, String pass) {
		
		enterUserName(user,pass);
		loginUser();
	}
	

}
