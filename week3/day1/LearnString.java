package week3.day1;

public class LearnString {

	public static void main(String[] args) {
        //String literal
		String companyName="TestLeaf";//A-65 a-97
		String name="TestLeaf";
		//String object
		String company=new String("TestLeaf");
		//compare the string reference(memory)
		if(companyName==name) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		//equals()-->to compare the string content
		//equalsIgnoreCase--case
		if(companyName.equalsIgnoreCase(company)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		//length()--->to find how many char---int
		int length = companyName.length();//8
		System.out.println(length);
		//contains()--compare the string with matching content--->boolean
		 boolean var = companyName.contains("No records");//ctrl+2
		 System.out.println(var);
		//convert my string into charArray--->char[]
		 char[] charArray = companyName.toCharArray();//"Test Leaf" T,e,s,...
		 System.out.println(charArray);
		 //indexOf('T')-->position of the given char  int
		 int indexOf = companyName.indexOf('L');
		 System.out.println(indexOf);
		 //charAt(i)--->char available in the given position
		 char charAt = companyName.charAt(6);
		 System.out.println(charAt);
		 
		 String str="        Hello This is me      ";
		 //split
		 String[] split = str.split(" ");
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 13));
		//trim
		System.out.println(str);
		String trim = str.trim();
		System.out.println(trim);
		//concatenation join two string
		System.out.println(str+company);
		System.out.println(str.concat(company));
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
