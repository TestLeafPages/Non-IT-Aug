package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificmethod;
import pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificmethod {
	@BeforeTest
	public void setFile() {
		filename="CreateLead";	
	}
	@Test(dataProvider="fetchData")
	public void runCreateLead(String uname,String password,String cname,String fname,String lname) {
		LoginPage lp=new LoginPage(driver);
		System.out.println(driver);
		lp.enterUsername(uname)
		.enterPassword(password)
		.clicklogin()
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead().enterCompanyname(cname).enterFirstname(fname).enterlastname(lname)
		.clickCreateLeadbutton().verifyFirstname();
	}

}
