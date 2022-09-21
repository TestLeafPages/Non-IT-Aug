package week3.day2;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
	List<Integer> lst=new ArrayList<Integer>();
	//add the data in list
	//listname.add
	lst.add(10);
	//lst.add("Testleaf");string
	//lst.add(12.2f);float
	//lst.add(333.23d); double
	//lst.add('d'); char
	lst.add(70);
	lst.add(50);
	lst.add(60);
	lst.add(30);
	lst.add(3, 11);
	lst.add(30);
	lst.add(70);
	//To print the list
	System.out.println(lst);
	//To remove data from list
	lst.remove(4);//based on index
	System.out.println(lst);
	//contains
	System.out.println(lst.contains(30));
	//clear
	//lst.clear();
	System.out.println(lst);
    //isEmpty
	System.out.println(lst.isEmpty());
	//get particular index get(index)
	System.out.println(lst.get(5));
	//size of list
	System.out.println(lst.size());
	System.out.println(lst);
	//To arrange the list 
	Collections.sort(lst);
	System.out.println(lst);
	}

}
