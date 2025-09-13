package books;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import users.User;
import database.*;

public class Books extends Database
{
	static Scanner sc = new Scanner(System.in);
	
	private String name;
	private int price;
	private boolean isAvaiable = true;
	private User userId=null;
	private int duration; //in days
	
	public Books(String name)
	{
		this.name = name;
	}
	
	public void showBookDetail()
	{
		System.out.println("1. Name : " + this.name + "\n2. price : " + this.price +  "\n3. Availavle : " + this.isAvaiable + "\n4. user : "+userId==null? "No User":this.userId + "\n5. Duration : " + this.duration );
	}
	
	public static void showIssuedBook()
	{
		viewIssuedBook();
	}
	
	public static void addBook(String name)
	{
		Books book = new Books(name);
		addBookData(name, book);
	}
	
	public static void deleteBook(String name)
	{
		HashMap<String, Books> book = getAllBookData();
		book.remove(name);
		HashSet<String> name1 = getAllBookNames();
		name1.remove(name);
		deleteBookData(name);
	}
	
	public String getBookName()
	{
		if(!checkBook(name))
		{
			return null;
		}
		return this.name;
	}
	
	public static Books getBook(String name)
	{
		if(!checkBook(name))
		{
			System.out.println("No Book Found");
			return null;
		}
		return getBookData(name);
	}
	
	public boolean setDuration(int day)
	{
		this.duration = day;
		return true;
	}
	
	public static boolean checkBook(String name)
	{
		if(!Database.checkBook(name))
		{
			System.out.println("Book doesn't exist");
			return false;
		}
		return true;
	}
	
	public void changeAvaiability()
	{
		this.isAvaiable=!this.isAvaiable;
	}
	public boolean checkAvaiability()
	{
		return this.isAvaiable;
	}
	public static void getAllBooks()
	{
		HashSet<String> name = getAllBookNames();
		for(String i : name)
		{
			System.out.println(i);
		}
	}
	
	public void editBookDetails(String name)
	{
		if(!checkBook(name))
		{
			System.out.println("No Book Found");
			return;
		}
		Books book = getBook(name);
		String bookName = book.name;
		int price = book.price;
		boolean avaiable = book.isAvaiable;
		User userId = book.userId;
		int duration = book.duration;
		System.out.println("Choose option to update details : ");
		System.out.println("1. Name : " + bookName + "\n2. price : " + price +  "\n3. Availavle : " + avaiable + "\n4. userId : "+ userId + "\n5. Duration : " + duration );
		
		int n = sc.nextInt();
		sc.nextLine();
		if(n==1)
		{
			System.out.println("Enter new name for book : ");
			String newName = sc.nextLine();
			book.name=newName;
			updateBookKey(name, newName);
		}
		else if(n==2)
		{
			System.out.println("Enter new price for book : ");
			int p = sc.nextInt();
			sc.nextLine();
			book.price = p;
		}
		else if(n==3)
		{
			System.out.println("Enter new availavility for book : ");
			Boolean b = sc.nextBoolean();
			sc.nextLine();
			book.isAvaiable = b;
		}
		else if(n==4)
		{
			System.out.println("Enter new user's id for book : ");
			String uid = sc.nextLine();
			User user = getUserData(uid);
			book.userId= user;
			user.addUserBook(book);
			
		}
		else if(n==5)
		{
			System.out.println("Enter new duration for book : ");
			int d = sc.nextInt();
			sc.nextLine();
			book.duration = d;
		}
	}
}
