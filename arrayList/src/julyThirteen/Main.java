package julyThirteen;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(5);
		System.out.println("Collections Methods : ");
		System.out.println("---------------------------------------------");
		System.out.println("search");
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list,20));
		System.out.println("---------------------------------------------");
		
		System.out.println("Reverse : ");
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("---------------------------------------------");	
		
		System.out.println("Asscending :");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("---------------------------------------------");
		
		System.out.println("Descending :");
		System.out.println(list);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("---------------------------------------------");	
		
		System.out.println("Shuffle : ");
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println("---------------------------------------------");	
		
		System.out.println("Max :");
		System.out.println(list);
		System.out.println(Collections.max(list));
		System.out.println("---------------------------------------------");	
		
		System.out.println("Min :");
		System.out.println(list);
		System.out.println(Collections.min(list));
		System.out.println("---------------------------------------------");	
		
		System.out.println("Swap :");
		System.out.println(list);
		Collections.swap(list,0,1);
		System.out.println(list);
		System.out.println("---------------------------------------------");	
		
		System.out.println("Rotate :");
		System.out.println(list);
		Collections.rotate(list,2);
		System.out.println(list);
		System.out.println("---------------------------------------------");
		
		
		System.out.println("Add all : ");
		System.out.println(list);
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		System.out.println("---------------------------------------------");

		System.out.println("Frequency : ");
		System.out.println(list);
		System.out.println(Collections.frequency(list, 5));
		System.out.println("---------------------------------------------");

		System.out.println("Fill :");
		System.out.println(list);
		Collections.fill(list,1);
		System.out.println(list);
		System.out.println("---------------------------------------------");
		
		
		System.out.println("Clear :");
		System.out.println(list);
		list.clear();
		System.out.println(list);
		System.out.println("---------------------------------------------");

	}

}
