package users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import books.Books;
import database.Database;

public class User extends Database
{
	static Scanner sc = new Scanner(System.in);
	
	private String name;
	private String id;
	private String pass;
	private ArrayList<Books> issuedBooks = new ArrayList<Books>();
	
	public User(String name,String id,String pass)
	{
		this.name = name;
		this.id=id;
		this.pass=pass;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public boolean setName(String name)
	{
		this.name=name;
		return true;
	}
	
	public String getPass()
	{
		return this.pass;
	}
	
	public boolean setPass(String oldPass, String newPass)
	{
		if(oldPass.equals(this.pass))
		{
			this.pass=newPass;
			return true;
		}
		return false;
	}
	
	public static void addUser(String name,String id,String pass)
	{
		User user = new User(name,id,pass);
		Database.addUserData(id, user);
	}
	
	public static boolean checkId(String id)
	{
		return Database.checkId(id);
	}
	
	public boolean addUserBook(Books book)
	{
		issuedBooks.add(book);
		Database.addIssuedBook(this.name, book);
		return true;
	}
	
	public boolean removeUserBook(Books book)
	{
		issuedBooks.remove(book);
		return true;
	}
	
	public ArrayList<Books> getIssuedBooks()
	{
		return this.issuedBooks;
	}
	
	public boolean printIssuedBooks()
	{
		ArrayList<Books> list = this.getIssuedBooks();
		if(list.size()==0) 
		{
			System.out.println("No Book is Issued");
			return false;
			
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getBookName());
		}
		return true;
	}
	
	public static void getAllUser()
	{
		HashSet<String> id = Database.getAllUserNames();
		HashMap<String, User> user = Database.getAllUserData();
		for(String i : id)
		{
			System.out.println(user.get(i).name + " : " + i );
		}
	}
	
	public void deleteUser(String id)
	{
		Database.deleteUserData(id);
	}
	
	public static User getUser(String id)
	{
		User user=null;
		if(Database.getUserData(id)!=null)
		{
			user =  Database.getUserData(id);
		}
		else
		{
			user=Database.getAdminData(id);
		}
		return user;
	}
	
	public void showDetails()
	{
		System.out.println(this.name);
		System.out.println(this.id);
		if(issuedBooks.size()==0)
		{
			System.out.println("No Book is Issued.");
		}
		else 
		{
			System.out.println("Issued Books are : ");
			for(Books i : issuedBooks)
			{
				System.out.println(i.getBookName());
			}
		}
		
		
	}
	
	public void editUserDetails(String id)
	{
		User user = getUser(id);
		String uname = user.name;
		String uid = user.id;
		System.out.println("Choose option to update details : ");
		System.out.println("1. Name : " + uname + "\n2. userId : " + uid +  "\n3. Password : ******** ");
		
		int n = sc.nextInt();
		sc.nextLine();
		if(n==1)
		{
			System.out.println("Enter new name for user : ");
			String newName = sc.nextLine();
			user.name=newName;
			
		}
		else if(n==2)
		{
			System.out.println("Enter new UserId for User : ");
			String newid = sc.nextLine();
			user.id=newid;
		}
		else if(n==3)
		{
			System.out.println("Enter old password : ");
			String oldPass = sc.nextLine();
			if(oldPass.equals(user.pass))
			{
				System.out.println("Enter New Password : ");
				String newPass = sc.nextLine();
				user.pass=newPass;
			}
			else 
			{
				System.out.println("Wrong old password... try again");
				
			}
		}
	}
	
	//admin
	
	public boolean addadmin(String id)
	{
		Database.addAdmin(id);
		return true;
	}
	
	public boolean isAdmin()
	{
		return Database.isAdmin(this.id);
	}

}

