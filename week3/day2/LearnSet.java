package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	
	public static void main(String[] args) {
	Set<String> data=new TreeSet<String>();
	//add
	data.add("TestLeaf");
	data.add("Qeagle");
	data.add("HP");
	data.add("testLeaf");
	data.add("Cts");
	data.add("CTS");
	data.add("CTS");
	data.add("Qeagle");
	//setname
	System.out.println(data);
	//remove
	System.out.println(data.remove("testLeaf"));
	System.out.println(data);
	//contains
	System.out.println(data.contains("HP"));
	//clear
	data.clear();
	System.out.println(data);
	//isEmpty
	System.out.println(data.isEmpty());
	System.out.println(data);
	
}
}
