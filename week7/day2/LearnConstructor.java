package week7.day2;

public class LearnConstructor {
	{
		System.out.println("I am a block");
	}
	static {
		System.out.println("I am a static block");
	}
	//constructor is like method
	//does not have return type
	//name same as class name
	public LearnConstructor() {
		System.out.println("I am inside Constructor");
	}
	public LearnConstructor(String name) {
		System.out.println("I am inside construtor with arg");
	}
	public static void main(String[] args) {
		System.out.println("I Am Main method");
		LearnConstructor obj=new LearnConstructor("Testleaf");
	
	}
}












