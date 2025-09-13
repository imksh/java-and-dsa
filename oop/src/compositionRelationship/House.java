package compositionRelationship;

public class House 
{

	public House(String room1, String room2, String room3,String room4) 
	{
		
		System.out.println("House is created and it has following rooms : ");
		Room objRoom1 = new Room(room1);
		Room objRoom2 = new Room(room2);
		Room objRoom3 = new Room(room3);
		Room objRoom4 = new Room(room4);
		
	}
	

}
