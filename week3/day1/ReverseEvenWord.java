package week3.day1;

public class ReverseEvenWord {

	public static void main(String[] args) {
	/*Class Room:2
	 * String input="Testleaf  located in chennai";
	 * convert the string into words[]//split
	 * check if the word is odd  or even index(i%2!=0)
	 * if it even index-->Reverse the string
	 * print the output
	 */
		String input="Testleaf located in chennai";
		String[] split = input.split(" ");//Testleaf
		for (int i = 0; i < split.length; i++) {
			if(i%2!=0) {
				char[] charArray = split[i].toCharArray();
			
				for (int j = charArray.length-1; j>=0; j--) {
					
					System.out.println(charArray[j]);
					
				}
			}
			else {
				System.out.println(split[i]);
			}
			System.out.println(" ");
		}
		

	}

}
