package week3.day1;



public class LearnOverLoading {
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
    public void add(int a,float b) {
    	System.out.println(a+b);
	}
    public void add(int c,int d,int e ) {
    	System.out.println(c+d+e);

	}
    public void sub(int a,double d) {
    	
	}
    public void sub(int a,float d) {
    	System.out.println(a-d);
    	
	}
	public static void main(String[] args) {
		LearnOverLoading obj=new LearnOverLoading();
		obj.add(10, 20);
		obj.add(20, 40);
		obj.add(10, 30, 40);
		obj.sub(12, 1.0f);


	}

}
