package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethod {
	ChromeDriver driver;//Global variable declaration
	@Parameters({"url","username","password"})//2 step
	@BeforeMethod
	public void setup(String URL, String UserName,String Password){//3 
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);//4
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("username")).sendKeys(UserName);
	driver.findElement(By.id("password")).sendKeys(Password);
	driver.findElement(By.className("decorativeSubmit")).click();
}
	@AfterMethod
public void tearDown() {
	driver.close();
}
}

