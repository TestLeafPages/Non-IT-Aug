package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificmethod;

public class ViewLead  extends ProjectSpecificmethod{
	public ViewLead (ChromeDriver driver) {
		this.driver=driver;
	}
	public ViewLead verifyFirstname() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	    System.out.println(text);
	    if(text.contains("Princila")) {
	    	System.out.println("The enter name verified");
	    }
	    else {
	    	System.out.println("There is no name present");
	    }
	    return this;
	}

}
