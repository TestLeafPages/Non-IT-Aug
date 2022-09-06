package week1.day2;
      //Create class Calculator
public class Calculator {
     //method-1 add(int num1 ,int num2)
	public void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	//method-2 sub(float num1,int num2,int num3)
	public void  sub(float num1,int num2,int num3) {
		System.out.println(num1-num2-num3);
	}
	/*
	 * create main method//ctrl space Create object for
	 * Calculator class pass the
	 * input and execute
	 */
	public static void main(String[] args) {
		Calculator cal=new Calculator ();
		cal.add(10, 20);
		cal.sub(0.2f, 15, 10);
	}

}
