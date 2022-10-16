package week7.day2;

public class SupportClass extends LearnStatic {

	public static void main(String[] args) {
		//without creating obj  we can use static var as well method
		System.out.println(LearnStatic.num);
		LearnStatic.testing();
		//without static need to create object to call  var as well method
		SupportClass obj=new SupportClass();
		System.out.println(obj.name);
		obj.nonTesting();
		
		
	}

}
