package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

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
        
       //Declare the list to store the data
         List<String>lst=new ArrayList<String>();
         //as row we saved the list to get all row
         List<WebElement> row = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]//tr"));
	     System.out.println( row.size()); 
         for (int i = 2; i <row.size(); i++) {  
        	 //Store the TrainName in List 
		    String trainName = driver.findElement(By.xpath("//table[contains(@class,'DataTable TrainList')]//tr["+i+"]/td[2]")).getText();
            //add data into list as  string we can store
            lst.add(trainName);
         }
         //verify whether any duplicate train name is there or not
           //get List size
            System.out.println("List Size"+lst.size());
            Set<String>dupSet=new HashSet<String>(lst);
            System.out.println("Set Size"+dupSet.size());
            //get Set size
            if(lst.size()==dupSet.size()) {
            	System.out.println("Duplicate TrainName there");
            }
            else {
            	System.out.println("Duplicate TrainName Not Present");
            }
	
        
		
		

	}

}
