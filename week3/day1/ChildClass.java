package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildClass extends FatherClass{
 public void childHouse() {
	System.out.println("childHouse");
}
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		ChildClass obj=new ChildClass();
		obj.childHouse();
		obj.fatherHouse();
		obj.oneHouse();
		obj.TwoHouse();

	}

}
