package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificmethod;

public class LoginPage extends ProjectSpecificmethod{

	public LoginPage(ChromeDriver driver) {
	this.driver=driver;
}
	
	
	//elements/actions
	public LoginPage enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;

	}
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	
	public HomePage clicklogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}
}
