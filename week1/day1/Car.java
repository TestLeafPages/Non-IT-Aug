package week1.day1;

public class Car {
	
	public void applyBreak() {
	
		System.out.println("Apply Break");
      
	}
	
	
	public void driveCar() {
		
		System.out.println("Drive Car");

	}
	public static void main(String[] args) {
		//create object for the class
		
		Car obj=new Car();
		obj.applyBreak();
		obj.driveCar();
			
	}
}
