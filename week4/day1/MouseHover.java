package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//MouseHover on Women
	WebElement women = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
   //Move to Actions
	//pass driver as a Arg
	Actions builder =new Actions(driver);
	builder.moveToElement(women).perform();
	
	
	}

}
