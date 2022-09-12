package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonClassRoom {

	public static void main(String[] args) {
		/*
		 * ClassRoom3:
setup the path
Launch the browser(chrome)
load the url(https://www.amazon.in/)
In the search type-Bags for men
print first mobile price
		 */
		//step:1 setup the driver path
				WebDriverManager.chromedriver().setup();
				//step:2 Launch the chrome
				ChromeDriver driver=new ChromeDriver();
				//step:3 Load the Url(https://leafground.com/select.xhtml)
				driver.get("https://www.amazon.in/");
				//max window
				driver.manage().window().maximize();
				//In the search type-Bags for men
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bagsformen",Keys.ENTER);
				//print first bag price
				String bagPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
                System.out.println( bagPrice);
	
	}

}
