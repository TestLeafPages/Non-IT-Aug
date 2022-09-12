package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropDown {

	public static void main(String[] args) {
		/*
		 * ClassRoom:Goal to understand the Select Class
step:1 setup the driver path
step:2 Launch the chrome
step:3 Load the Url(https://leafground.com/select.xhtml)
step:4 Choose your favorite UI Automation tool
		 */
		//step:1 setup the driver path
		WebDriverManager.chromedriver().setup();
		//step:2 Launch the chrome
		ChromeDriver driver=new ChromeDriver();
		//step:3 Load the Url(https://leafground.com/select.xhtml)
		driver.get("https://leafground.com/select.xhtml");
		//max window
		driver.manage().window().maximize();
		//step:4 Choose your favorite UI Automation tool
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
		Select drop1=new Select(tool);
		drop1.selectByVisibleText("ui-selectonemenu-label");
    
	   String text = driver.findElement(By.xpath("")).getText();
		System.out.println(text);
		
	}

}
