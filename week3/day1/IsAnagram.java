package week3.day1;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {
		/*
		 * PsuedoCode
		 * 1.convert the charArray
		 * 2.compare
		 */
		String str1="stop";
		String str2="posT";
		//compare the length
		int length1  = str1.length();
		int length2 = str2.length();
		System.out.println(length1==length2);
		char[] ch1 = str1.toCharArray();//s,t,o,p
		char[] ch2 = str2.toCharArray();//p,o,s,t
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		//for (int i = 0; i < ch2.length; i++) {
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("Anagram");
				//break;
			}
			else {
				System.out.println("Not Anagram");
			}
			
		}

}

