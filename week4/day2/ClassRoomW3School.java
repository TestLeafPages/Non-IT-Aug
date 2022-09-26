package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomW3School {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//handle the frame
		driver.switchTo().frame(1);
		//Click Try It Button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//handle the alert
		Alert alert = driver.switchTo().alert();//ctrl+2+1
		String text = alert.getText();
		System.out.println(text);//print text in the alert box
		//Click OK/Cancel in the alert
		alert.accept();
		//Confirm the action is performed correctly by verifying the text !!
		String text2 = driver.findElement(By.id("demo")).getText();
		if(text2.contains("You pressed")) {
			System.out.println("Action is performed");
		}

	}

}
