package week6.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttribute {
	@Test(priority = -1)
	public void create() {
		
	}
	@Test(priority = 1)
	public void Edit() {
		
	}
	@Ignore
	@Test//(enabled = false)
	public void delete() {
		
	}

}
