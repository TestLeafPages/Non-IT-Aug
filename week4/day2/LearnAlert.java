package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click the simple alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		//switch the control
	    Alert alert = driver.switchTo().alert();//ctrl+2+l
	    String text = alert.getText();//ctrl+2+l
	    System.out.println(text);
	    //click ok 
	    alert.accept();
	    //prompt Alert
       driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
       Alert alert2 = driver.switchTo().alert();
       alert2.sendKeys("TestLeaf");
       Thread.sleep(5000);
       String text2 = alert2.getText();
       alert2.accept();
       System.out.println(text2);
	}

}
