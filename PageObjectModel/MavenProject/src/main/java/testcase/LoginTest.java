package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificmethod;
import pages.LoginPage;

public class LoginTest extends ProjectSpecificmethod {
	@BeforeTest
	public void setFile() {
		filename="Login";	
	}
	@Test(dataProvider="fetchData")
	public void runLogin(String uname,String password) {
		LoginPage lp=new LoginPage(driver);
		System.out.println(driver);
		lp.enterUsername(uname).enterPassword(password).clicklogin();
	
}
}
