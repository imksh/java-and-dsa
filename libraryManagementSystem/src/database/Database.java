package database;

import java.util.HashMap;
import java.util.HashSet;

import books.Books;
import users.*;

public class Database 
{
	//Databases
	private static HashMap<String,User> usersData = new HashMap<>();
	private static HashSet<String> userNames = new HashSet<String>();
	private static HashMap<String,User> adminData = new HashMap<>();
	private static HashSet<String> adminNames = new HashSet<String>();
	private static HashMap<String,Books> booksData = new HashMap<>();
	private static HashSet<String> bookNames = new HashSet<String>();
	private static HashSet<String> issuedBook = new HashSet<String>();
	
	//book geters and seters
	
	protected static void addBookData(String name,Books book)
	{
		if(!bookNames.contains(name))
		{
			bookNames.add(name);
			booksData.put(name,book);
			System.out.println("Successfully added book");
		}
		else
		{
			System.out.println("Adding failed... Book already exist");
		}
	}
	
	protected static boolean addIssuedBook(String name,Books book)
	{
		issuedBook.add(book.getBookName());
		return true;
	}
	protected static boolean viewIssuedBook()
	{
		for(String b : issuedBook)
		{
			System.out.println(b);
		}
		return true;
	}
	
	protected static void deleteBookData(String name)
	{
		bookNames.remove(name);
		booksData.remove(name);
		
	}
	
	protected static Books getBookData(String name)
	{
		if(booksData.containsKey(name))
		{
			return booksData.get(name);
		}
		return null;
	}
	
	protected static HashMap<String, Books> getAllBookData()
	{
		return booksData;
	}
	
	protected static void updateBookKey(String oldName,String newName)
	{
		Books books = booksData.get(oldName);
		booksData.put(newName, books);
		booksData.remove(oldName);
	}
	
	protected static void viewBooks()
	{
		HashMap<String,Books> books= Database.getAllBookData();
		for(String key : books.keySet())
		{
			System.out.println(key);
		}
	}
	
	protected static HashSet<String> getAllBookNames()
	{
		return bookNames;
	}

	protected static boolean checkBook(String name)
	{
		if(bookNames.contains(name))
		{
			
			return true;
		}
		return false;
	}
	
	//User geters and seters
	
	protected static void addUserData(String id,User user)
	{
		if(!userNames.contains(id))
		{
			userNames.add(id);
			usersData.put(id,user);
			System.out.println("Successfully added user");
		}
		else
		{
			System.out.println("Adding failed... User already exist");
		}
	}
	
	protected static void deleteUserData(String id)
	{
		userNames.remove(id);
		usersData.remove(id);
	}
	
	protected static User getUserData(String id)
	{
		if(usersData.containsKey(id))
		{
			return usersData.get(id);
		}
		return null;
	}
	
	protected static boolean checkId(String id)
	{
		return usersData.containsKey(id) || adminData.containsKey(id);
	}
	
	protected static HashMap<String,User> getAllUserData()
	{
		return usersData;
	}
	
	protected static HashSet<String> getAllUserNames()
	{
		return userNames;
	}
	
	
	//Admin user geters and seters
	
	protected static boolean addAdmin(String id)
	{
		if(usersData.containsKey(id))
		{
			User user = usersData.get(id);
			adminData.put(id, user);
			usersData.remove(id);
			userNames.remove(id);
			adminNames.add(id);
			return true;
		}
		return false;
	}
	
	protected static boolean removeAdmin(String id)
	{
		if(adminData.containsKey(id))
		{
			User user = adminData.get(id);
			usersData.put(id,user);
			userNames.add(id);
			adminNames.remove(id);
			adminData.remove(id);
		}
		return false;
	}
	
	protected static User getAdminData(String id)
	{
		if(adminData.containsKey(id))
		{
			return adminData.get(id);
		}
		return null;
	}
	
	protected static HashMap<String,User> getAllAdminData()
	{
		return adminData;
	}
	
	protected static HashSet<String> getAllAdminNames()
	{
		return adminNames;
	}
	
	protected static boolean isAdmin(String id)
	{
		if(adminNames.contains(id))
		{
			return true;
		}
		return false;
	}
	
	
}
