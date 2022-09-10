package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		//we have to call WDM for browser driver
		WebDriverManager.chromedriver().setup();
		//Launch the browser(chrome)
		ChromeDriver driver=new ChromeDriver();
		 //Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the browser
		driver.manage().window().maximize();
		//Find the username and enter the username value(demosalesmanager)
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Find the password and enter the password value (crmsfa)
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click the button
		driver.findElement(By.className("decorativeSubmit")).click();
		//GetText
		String text = driver.findElement(By.tagName("h2")).getText();
		//print the tagname
		System.out.println(text);
		//verify by title
		  String title =driver.getTitle(); //ctrl+2+l //Leaftaps - TestLeaf Automation Platform
		 //print the title
		 System.out.println(title);
		//Click CRM/SFA
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 //click Leads
		 driver.findElement(By.linkText("Leads")).click();
		 //click Create Lead
		 driver.findElement(By.linkText("Create Lead")).click();
		 //Find Company name Enter the company name
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 //Enter first name
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		 //Enter last name
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Edward");
		 //Click create lead button
		 driver.findElement(By.className("smallSubmit")).click();
		 String title2 = driver.getTitle();
		 System.out.println(title2);
		//close the browser
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
