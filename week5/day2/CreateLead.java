package week6.day2;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecificMethod {
   
	@Test(dataProvider ="create" )
	public void runCreateLead(String cname,String fname,String lname,String phnum) {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phnum);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(name="create")
	public String[][] getdata() {
		String[][] data=new String[2][4];
		//1 st set data
		data[0][0]="TestLeaf";
		data[0][1]="Princila";
		data[0][2]="Edward";
		data[0][3]="99";
		//2nd set of data
		data[1][0]="Qeagle";
		data[1][1]="Roseline";
		data[1][2]="Edward";
		data[1][3]="99";
		return data;
		
	}
}






