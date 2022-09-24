package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnErail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement from = driver.findElement(By.id("txtStationFrom"));
         from.clear();
         from.sendKeys("ms",Keys.TAB);
         WebElement to = driver.findElement(By.id("txtStationTo"));
         to.clear();
         to.sendKeys("mdu",Keys.TAB);
         driver.findElement(By.id("chkSelectDateOnly")).click();
         //as row we saved
         List<WebElement> row = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]//tr"));
	     System.out.println( row.size()); 
         for (int i = 2; i <row.size(); i++) {  
        	 //Store the TrainName in List 
		    String trainName = driver.findElement(By.xpath("//table[contains(@class,'DataTable TrainList')]//tr["+i+"]/td[2]")).getText();
	       //find the Word"MS" there from the List of output
            if(trainName.contains("MS")) {
            	System.out.println(trainName);
            }
            //verify whether any duplicate train name is there or not
            List<String>lst=new ArrayList<String>();
            lst.add(trainName);
            System.out.println(lst);
	}
        
}
}