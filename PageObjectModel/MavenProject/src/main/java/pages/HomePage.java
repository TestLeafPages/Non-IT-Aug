package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificmethod;

public class HomePage extends ProjectSpecificmethod {

	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyHomePage clickCRMSFA() {
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')] ")).click();
		return new MyHomePage(driver);
		
	}
}
