package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.switchTo().frame(0);//index start from 0
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		System.out.println(frame1.getText());
		driver.switchTo().defaultContent();//control go to main window
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");//String
		WebElement frame2 = driver.findElement(By.xpath("//button[text()='Click Me']"));
		frame2.click();
		System.out.println(frame2.getText());
		//switch back to parent window
		driver.switchTo().parentFrame();
		//take snapshort
		File source = driver.getScreenshotAs(OutputType.FILE);
		//Create physicalFile
		File dest=new File("./snaps/screenshort.png");
		//copy the source to destination
		FileUtils.copyFile(source, dest);
		
		
	}

}
