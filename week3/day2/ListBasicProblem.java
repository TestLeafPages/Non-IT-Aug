package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListBasicProblem {

	public static void main(String[] args) {
		//{Adam,Ben, Zara, Adam, Charlie, James, Ben}
		String[] name= {"Adam","Ben", "Zara", "Adam", "Charlie", "James", "Ben"};
		List<String> lst=new ArrayList<String>();
		lst.add("Adam");
		lst.add("Ben");
		System.out.println(lst);
		for (int i = 0; i < name.length; i++) {
			lst.add(name[i]);	
		}
		//System.out.println(lst);
		Collections.sort(lst);
		for (int i = 0; i < lst.size(); i++) {
			
			for (int j = i+1; j < lst.size(); j++) {
			
				if(lst.get(i)==lst.get(j)) {
					System.out.println(lst.get(i));	
					break;
					
			}
				
	}

	}
}
}
