package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Handle the browser notification
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Handle the alert  sweet alert so inspect and write
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		//click on fligts
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		//get the title
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		//How can i know the second window
		Set<String> windowHandles = driver.getWindowHandles();//ctrl+2+l
		System.out.println("How many window open"+windowHandles.size());
		//how can i get second window
		//convert set into list by pass the set value to list as a arg
		List<String>lstWindow=new ArrayList<String>(windowHandles);
		//How to move the control
		driver.switchTo().window(lstWindow.get(1));
		//print title
		System.out.println(driver.getTitle());
		//Close
		driver.close();
		
		

	}

}
