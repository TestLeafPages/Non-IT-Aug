package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		//collection of data
		//store multiple data
		//index starts from 0 
		int num=10;
		//data type array name=value;
		int num1[]= {1,2,4,6,7};
		String[]names= {"Priya","shyamala","shoba"};
		int[]arr=new int[6];
		arr[0]=10;
		arr[1]=15;
		arr[2]=12;
		arr[3]=13;
		arr[4]=21;
		arr[5]=20;
		Arrays.sort(arr);
		for (int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	 System.out.println(arr);
     System.out.println(arr[1]);
     //get length
     System.out.println(arr.length);
     System.out.println(arr[6]);
     //get last item from list
     int length = arr.length;//short cut ctrl+2+l
     System.out.println(arr[length-1]);
     //sort array arrange my array
     
	}

}
