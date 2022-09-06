package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {

//Arithmetic operators+,-,*,/,%
		System.out.println(2+3);
		System.out.println(2-3);
		System.out.println(2*3);
		System.out.println(2/3);//quto
		System.out.println(2%3);//rem
//Conditionaloperator(>,<,>=,<=,==,!=)
		System.out.println(5>3);
		System.out.println(5<5);
        System.out.println(5!=5);
        System.out.println(4==4);
        System.out.println(5<=4);
        //Assignment operators(=)
        int num=10;
        //Logical operators
        //And(&&) Or(||) Not!
        //and two t t t t f f
        System.out.println("-------------------");
       System.out.println(5<3 && 10>5); //1*0=0 1*1=1
       System.out.println("|||||||||||||||||||||");
       //OR t t t   t f t //1+0=1 1+1=1
       System.out.println(5<3 || 10>5);
       //Not!
       System.out.println(!(5>3));//1 opposite 0 0 1
       
       //Increament/Decrement
       int b=5;
       
       System.out.println(b++);//5+1=6
       System.out.println("After increment"+b);
       System.out.println(++b);// 7
       
       System.out.println(b--);
       System.out.println("After decrement"+b);
       
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
