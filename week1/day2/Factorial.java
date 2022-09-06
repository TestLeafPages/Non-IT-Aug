package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		// take 5 num loop 1 2 3 4 5 
		int num=5;
		int fact = 1;
		for (int i = 1; i <=num; i++) {
			fact=fact*i;//1*1=1  //1*2=2
			System.out.println(fact);
		}
		System.out.println(fact);

	}

}
