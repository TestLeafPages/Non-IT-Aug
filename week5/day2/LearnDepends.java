package week6.day2;

import org.testng.annotations.Test;

public class LearnDepends {
	//package name.classname.methods
	@Test
	public void create() {
		throw new RuntimeException();
	}
	@Test
	public void edit() {
		
	}
	@Test(dependsOnMethods = {"create"},alwaysRun = true)
	public void delete() {
		
	}
}
