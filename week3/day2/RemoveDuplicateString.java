package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String text="We learn java basic as a part of java session in java week1";
		//split
		String[] split = text.split(" ");
		
		Set<String>str=new LinkedHashSet<String>(Arrays.asList(split));
		/*
		 * for (int i = 0; i < split.length; i++) 
		 * { str.add(split[i]); }
		 */
		System.out.println(str);
			
		
	for (String dup : str) {
		System.out.print(dup+" ");
	}

	}
}
