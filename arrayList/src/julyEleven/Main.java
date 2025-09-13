package julyEleven;

import java.util.ArrayList;

public class Main 
{

	public static void main(String[] args) 
	{
		 ArrayList list = new ArrayList();
		 list.add(10);
		 list.add(null);
		 list.add(null);
		 list.add(3,12);
		 for(Object object : list)
		 {
			 System.out.println(object);
		 }

	}

}
