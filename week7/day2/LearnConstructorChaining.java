package week7.day2;

public class LearnConstructorChaining {
String name1;
int num;
public LearnConstructorChaining() {
	this(20);
	System.out.println("Default construtor");
}
public LearnConstructorChaining(String name) {
	
	System.out.println("String construtor");
}
public LearnConstructorChaining(int num) {
	this("Testleaf");
	System.out.println("Integer construtor");
}
public void write() {
	
}
public void run() {
	System.out.println(this.name1);
	this.write();
}
public static void main(String[] args) {
	LearnConstructorChaining obj=new LearnConstructorChaining();
	System.out.println(obj.name);
	System.out.println(obj.num);
}
}
