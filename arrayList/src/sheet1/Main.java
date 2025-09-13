package sheet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) 
	{
		
		
		System.out.println("Quedtion 1 :");
		q1();
		
		System.out.println("Quedtion 2 :");
		q2();
		
		System.out.println("Quedtion 3 :");
		q3();
		
		System.out.println("Quedtion 4 :");
		q4();
		
		System.out.println("Quedtion 5 :");
		q5(3);
		
		System.out.println("Quedtion 6 :");
		q6(1,"Yellow");
		
		System.out.println("Quedtion 7 :");
		q7();
		
		System.out.println("Quedtion 8 :");
		q8("Green");
		
		System.out.println("Quedtion 9 :");
		q9();
		
		System.out.println("Quedtion 10 :");
		q10();
		
		System.out.println("Quedtion 11 :");
		q11();
		
		System.out.println("Quedtion 12 :");
		q12();
		
		System.out.println("Quedtion 14 :");
		q13();
		
		System.out.println("Quedtion 14 :");
		q14();
		
		System.out.println("Quedtion 15 :");
		q15();
		
		System.out.println("Quedtion 16 :");
		q16();
		
		System.out.println("Quedtion 17 :");
		q17();
		
		System.out.println("Quedtion 18 :");
		q18();
		
		System.out.println("Quedtion 19 :");
		q19();
		
		System.out.println("Quedtion 20 :");
		q20();
		
		

	}

	private static void q20() 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(List.of(10,20,30,40,50));
		list.add(40);
		System.out.println(list);
		
	}

	private static void q19() 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.trimToSize();
		
	}

	private static void q18() 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list.isEmpty());
		
	}

	private static void q17() 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(List.of(10,20,30,40,50));
		list.clear();
		System.out.println(list);
		
	}

	private static void q16() 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(List.of(10,20,30,40,50));
		ArrayList<Integer> list1 = new ArrayList<Integer>(List.of(101,201,301,401,501));
		list.addAll(list1);
		System.out.println(list);
		
	}

	private static void q15() 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(List.of(10,20,30,40,50));
		Collections.swap(list,1,2);
		System.out.println(list);
		
	}

	private static void q14() 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(List.of(10,20,30,40,50));
		ArrayList<Integer> list1 = new ArrayList<Integer>(List.of(10,20,30,40,50));
		System.out.println(list.equals(list1));
		
	}

	private static void q13() 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(List.of(10,20,30,40,50));
		System.out.println(list);
		ArrayList<Integer> list1 = new ArrayList<Integer>(list.subList(1, 4));
		System.out.println(list1); 
		
	}

	private static void q12() 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("White");
		Collections.reverse(list);
		System.out.println(list);
		
	}

	private static void q11() 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("White");
		Collections.shuffle(list);
		System.out.println(list);
		
	}

	private static void q10() 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("White");
		
		ArrayList<String> list1 = new ArrayList<String>(list);
		System.out.println(list1);
	}

	private static void q9() 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("White");
		Collections.sort(list);
		System.out.println(list);
		
	}

	private static void q8(String str) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Blue");
		list.add("Green");
		list.add("White");
		
		if(list.contains(str)) System.out.println(str+" is found at "+list.indexOf(str));
		else System.out.println("Not Found");
		
	}

	private static void q7() 
	{
		// TODO Auto-generated method stub
		
	}

	private static void q6( int i, String string) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Blue");
		list.add("Green");
		list.add("White");
		list.set(i, string);
		System.out.println(list);
		
	}

	private static void q5( int i) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Blue");
		list.add("Green");
		list.add("White");
		list.add(0,"Red");
		System.out.println(list.get(i));
		System.out.println();
		
	}

	private static void q4() 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Blue");
		list.add("Green");
		list.add("White");
		list.add(0,"Red");
		System.out.println(list);
		System.out.println();
		
	}

	private static void q3() 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Blue");
		list.add("Pink");
		list.add("Silver");
		list.add("Yellow");
		list.add("Green");
		
		for(String i : list)
		{
			System.out.println(i);
		}
		System.out.println();
		
	}

	private static void q2() 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Blue");
		list.add("Pink");
		list.add("Silver");
		list.add("Yellow");
		list.add("Green");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		
	}

	private static void q1() 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Blue");
		list.add("Pink");
		list.add("Silver");
		list.add("Yellow");
		list.add("Green");
		System.out.println(list);
		System.out.println();
		
	}

}
