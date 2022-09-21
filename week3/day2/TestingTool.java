package week3.day2;

public class TestingTool extends MultiLanguage implements Language,Mobile {
	public static void main(String[] args) {
		TestingTool tool=new TestingTool();
		tool.ruby();
		tool.python();
		tool.java();
		System.out.println(tool.lan);
	}
	public void java() {
		
	}
	public void python() {	
	}
	@Override
	public void cSharp() {
		// TODO Auto-generated method stub
		
	}



}
