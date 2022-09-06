package week1.day2;

public class LearnAcessModifier {
  //method1 public simple syso
	public void printName() {
		System.out.println("TestLeaf");
		
	}
	//method2 private return type
	private int  getCvvNumber() {
		int cvv=1234;
		return cvv;
		
	}
	//method3 default with input arg
	void setDetails(String name,int regNum) {
		System.out.println(name);
		System.out.println(regNum);
	}

	public static void main(String[] args) {
		//Create object for the class
		LearnAcessModifier obj=new LearnAcessModifier();
		obj.printName();//public
		int cvvNumber = obj.getCvvNumber();//private// to create local variable ctr+2+l
		System.out.println(cvvNumber);
		obj.setDetails("Priya", 1011);//default
		
		
	}

}
