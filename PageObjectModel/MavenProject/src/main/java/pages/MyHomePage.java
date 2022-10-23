package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificmethod;

public class MyHomePage extends ProjectSpecificmethod {
public MyHomePage(ChromeDriver driver) {
	this.driver=driver;
}
	public MyLeadPage clickLead() {
		driver.findElement(By.linkText("Leads")).click();
		return new  MyLeadPage(driver);
	
}
}
