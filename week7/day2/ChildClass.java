package week7.day2;

public class ChildClass extends ParentClass {
   String lang="Python";
  
   public ChildClass() {
	   super();
	   System.out.println("child constructor");
   }
   
 public void tools() {
	 System.out.println(lang);
	 //parent class variable
	 System.out.println(super.lang);
    //parent class method
	 super.autotools();
	 
 }
   
   
   public static void main(String[] args) {
	   ChildClass obj=new ChildClass();
		
		
		

	}

}
