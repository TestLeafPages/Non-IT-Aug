package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement target = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
       //find the initial position
		System.out.println( target.getLocation());
	    Actions builder=new Actions(driver);
	    builder.dragAndDropBy(target, 100, 210).perform();
	    //verify
	    System.out.println(target.getLocation());

	}

}
