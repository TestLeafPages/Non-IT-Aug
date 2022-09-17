package week3.day1;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 * convert theString into charArray
		 * get the char in reverse order
		 * print  every char without white space
		 */
		 String name="TestLeaf";
		 char[] charArray = name.toCharArray();
		 //loop
		 for (int i =charArray.length-1; i>=0 ; i--) {
			System.out.print(charArray[i]);
		}

	}

}
