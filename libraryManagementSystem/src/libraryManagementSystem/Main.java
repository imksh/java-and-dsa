package libraryManagementSystem;

import java.util.Scanner;

import books.Books;
import users.*;

public class Main extends Hompages
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		DefaultData.addDefaultBooks();
		DefaultData.addDefaultUsers();
		for(int i=0;i<30;i++) System.out.println();
		start();
		System.out.println("Thankyou...");
	}
	private static void start()
	{
		boolean exit = false;
		while(!exit)
		{
			System.out.println();
			System.out.println("Welcome to Library Management System : ");
			System.out.println();
			
				int n = getIntInput(sc, "1. Login \n2. Signup \n3.Exit");
				if(n==1)
				{
					login();
				}
				else if(n==2)
				{
					signup();
				}
				else if(n==3)
				{
					exit=true;
				}
				else 
				{
					System.out.println("Wrong input... try again");
					start();
				}
			
			
		}
	}
	
	private static void signup() 
	{
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter user id : ");
		String id = sc.nextLine();
		while(User.checkId(id))
		{ 
			System.out.println();
				int n=getIntInput(sc, "1. Enter user id \n2. Exit");
				if(n==1)
				{
					System.out.println("Enter user id : ");
					id = sc.nextLine();
				}
				else 
				{
					return;
				}
			
		}
		System.out.println("Enter your password : ");
		String pass = sc.nextLine();
		System.out.println("Account created...");
		User.addUser(name,id,pass);
		login();
	}

	private static void login()
	{
		System.out.println();
		
			int n =getIntInput(sc, "Enter user type : \n 1. Login as user \n 2. Login as Admin \n 3. Exit");
			if(n==3)
			{
				return;
			}
			else if(n!=1 && n!=2)
			{
				System.out.println("Wrong input... try again");
				login();
			}
			System.out.println("Enter your user id : ");
			String id = sc.nextLine();
			System.out.println("Enter your password : ");
			String pass = sc.nextLine();
			if(authenticate(n,id,pass))
			{
				if(n==1)
				{
					homepage(id, pass);
				}
				else
				{
					adminHomepage(id, pass);
				}
			}
			else
			{
				System.out.println("Authentication Failed... try again");
				login();
			}
		
		
		
	}
	
	private static boolean authenticate(int user, String id, String pass)
	{
		User user1 = User.getUser(id);
		if(user1==null || !pass.equals(user1.getPass()))
		{
			return false;
		}
		else if(user==2 && !user1.isAdmin())
		{
			return false;
		}
		return true;
			
	}
	
	public static int getIntInput(Scanner scanner, String prompt) 
	{
		int input = -1;
		while (true) {
			System.out.print(prompt);
			System.out.println();
			try {
				input = scanner.nextInt();
				scanner.nextLine(); // consume newline
				break; // valid input, exit loop
			} catch (Exception e) {
				System.out.println("Invalid input! Please enter a valid number.");
				scanner.nextLine(); // clear the invalid input
			}
		}
		return input;
	}

}
class Hompages
{
	static Scanner sc = new Scanner(System.in);
	public static int getIntInput(Scanner scanner, String prompt) {
		int input = -1;
		while (true) {
			System.out.print(prompt);
			try {
				input = scanner.nextInt();
				scanner.nextLine(); // consume newline
				break; // valid input, exit loop
			} catch (Exception e) {
				System.out.println("Invalid input! Please enter a valid number.");
				scanner.nextLine(); // clear the invalid input
			}
		}
		return input;
	}
	static void homepage(String id, String pass)
	{
		boolean logout = false;
		while(!logout)
		{
			User user = User.getUser(id);
			String name = user.getName();
			
			System.out.println();
			System.out.println("Welcome " + name);
			System.out.println();
			int n=getIntInput(sc, "1. View Books \n2. Renew Book \n3. View Issued Books \n4. Profile Management \n5. Logout");
			
			if(n==1)
			{
				Books.getAllBooks();
			}
			else if(n==2)
			{
				
				if(user.printIssuedBooks())
				{
					System.out.println("Enter Book Name : ");
					String book = sc.nextLine();
					Books b=Books.getBook(book);
					if(b==null)
					{
						System.out.println("No book found");
						continue;
					}
					
					int day =getIntInput(sc, "Enter renewal days : ");
					b.setDuration(day);
				}
				
			}
			else if(n==3)
			{
				user.printIssuedBooks();
			}
			else if(n==4)
			{
				System.out.println("Update Details: ");
				System.out.println();
				int x = getIntInput(sc, "1. Change name \n2. change password \n3. Back");
				if(x==1)
				{
					System.out.println("Enter new name");
					String newName = sc.nextLine();
					boolean check = user.setName(newName);
					if(check)
					{
						System.out.println("Updade successfully");
					}
					else 
					{
						System.out.println("Failed... try again");
					}
				}
				else if(x==2)
				{
					System.out.println("Enter old password");
					String oldpass = sc.nextLine();
					System.out.println("Enter new password");
					String newpass = sc.nextLine();
					boolean check = user.setPass(oldpass, newpass);
					if(check)
					{
						System.out.println("Updade successfully");
					}
				}
				else if(x==3)
				{
					continue;
				}
					else 
				{
					System.out.println("Wrong old password... try again");
				}
			}
			else if(n==5)
			{
				logout=true;
			}
			else 
			{
				System.out.println("Wrong Input... try again");
			}
		}
	}
	static void adminHomepage(String id, String pass)
	{
		boolean logout = false;
		while(!logout)
		{
			User user = User.getUser(id);
			String name = user.getName();
			
			System.out.println("Welcome " + name);
			System.out.println();
			int n = getIntInput(sc, "1. Book Management  \n2. User Management \n3. Issue/Return Management \n4.Profile Management \n5. Logout");
			if(n==1)
			{
				System.out.println("Book Management");
				System.out.println();
				int x= getIntInput(sc, "1. Add Book  \n2. Delete Book \n3. Edit book details \n4. View all books \n5. Search books \n6. Check Availavility \n7. Update Book availability \n8.Back");
				if(x==8)continue;
				if(x==1)
				{
					System.out.println("Enter Book name");
					String bname = sc.nextLine();
					Books.addBook(bname);
					System.out.println("successfully added new book : " + bname);
				}
				else if(x==2)
				{
					System.out.println("Enter Book name");
					String bname = sc.nextLine();
					Books.deleteBook(bname); 
					System.out.println("successfully added deleted " + bname);
				}
				else if(x==3)
				{
					System.out.println("Enter Book name");
					String bname = sc.nextLine();
					Books book = Books.getBook(bname);
					if(book==null) continue;
					book.editBookDetails(bname);
				}
				else if(x==4)
				{
					Books.getAllBooks();
				}
				else if(x==5)
				{
					System.out.println("Enter Book name");
					String bname = sc.nextLine();
					Books book = Books.getBook(bname);
					if(book==null) continue;
					book.showBookDetail();
				}
				else if(x==6)
				{
					System.out.println("Enter Book name");
					String bname = sc.nextLine();
					Books book = Books.getBook(bname);
					if(book.checkAvaiability())
					{
						System.out.println("Available");
					}
					else
					{
						System.out.println("Not Availabile");
					}
				}
				else if(x==7)
				{
					System.out.println("Enter Book name");
					String bname = sc.nextLine();
					Books book = Books.getBook(bname);
					if(book.checkAvaiability())
					{
						System.out.println();
						int y = getIntInput(sc, "Currently book is Available, Do tou want to change Availability. \n1. Yes \n2. No");
						if(y==1)
						{
							book.changeAvaiability();
							System.out.println("Availability is set to unavailable");
						}
						else
						{
							System.out.println("Availability didn't change");
						}
					}
					else
					{
						System.out.println();
						int y = getIntInput(sc, "Currently book is Unavailable, Do tou want to change Availability. \n1. Yes \n2. No");
						if(y==1)
						{
							book.changeAvaiability();
							System.out.println("Availability is set to Available");
						}
						else
						{
							System.out.println("Availability didn't change");
						}
					}
				}
				
			}
			else if(n==2)
			{
				System.out.println();
				int x= getIntInput(sc, "1. View all users  \n2. Search user \n3. Add user \n4. Edit user details \n5. Delete user \n6. Reset user password \n7.Back");
				if(x==7)continue;
				if(x==1)
				{
					User.getAllUser();
				}
				else if(x==2)
				{
					System.out.println("Enter User id");
					String uid = sc.nextLine();
					User u = User.getUser(uid);
					if(u==null)
					{
						System.out.println("No User Found");
						continue;
						
					}
					u.showDetails();
				}
				else if(x==3)
				{
					System.out.println("Enter Name : ");
					String userName = sc.nextLine();
					System.out.println("Enter user id : ");
					String uid = sc.nextLine();
					while(User.checkId(uid))
					{ 
						System.out.println();
						int a=getIntInput(sc, "1. Enter user id \n2. Exit");
						if(a==1)
						{
							System.out.println("Enter user id : ");
							uid = sc.nextLine();
						}
						else 
						{
							return;
						}
					}
					System.out.println("Enter your password : ");
					String userpass = sc.nextLine();
					System.out.println("Account created...");
					User.addUser(userName, uid, userpass);
				}
				else if(x==4)
				{
					System.out.println("Enter User Id : ");
					String uid = sc.nextLine();
					User editUser = User.getUser(uid);
					if(editUser==null)
					{
						System.out.println("No User Found");
						continue;
						
					}
					editUser.editUserDetails(uid);
				}
				else if(x==5)
				{
					System.out.println("Enter User Id : ");
					String uid = sc.nextLine();
					User delete = User.getUser(uid);
					if(delete==null)
					{
						System.out.println("No User Found");
						continue;
						
					}
					delete.deleteUser(uid);
				}
				else if(x==6)
				{
					System.out.println("Enter User Id : ");
					String uid = sc.nextLine();
					System.out.println("Enter your password : ");
					String userpass = sc.nextLine();
					User change = User.getUser(uid);
					if(change==null)
					{
						System.out.println("No User Found");
						continue;
						
					}
					change.setPass(change.getPass(),userpass);
				}
				else
				{
					System.out.println("Wrong Input... try again");
				}
				
			}
			else if(n==3)
			{
				System.out.println();
				int x= getIntInput(sc, "1. Issue book to users  \n2. Return book from user \n3. View all issued books \n4. Renew Book \n5.Back");
				if(x==5)continue;
				if(x==1)
				{
					System.out.println("Enter User Id : ");
					String uid = sc.nextLine();
					User userIssue = User.getUser(uid);
					if(userIssue==null)
					{
						System.out.println("No User Found");
						continue;
					}
					System.out.println("Enter Book name : ");
					String bname = sc.nextLine();
					Books book = Books.getBook(bname);
					if(book==null)
					{
						System.out.println("No Book Found");
						continue;
					}
					else if(book.checkAvaiability())
					{
						userIssue.addUserBook(book);
						book.changeAvaiability();
						System.out.println("Book Issued to the user.");
					}
					else 
					{
						System.out.println("Book isn't available");
					}
				}
				else if(x==2)
				{
					System.out.println("Enter User Id : ");
					String uid = sc.nextLine();
					User user1 = User.getUser(uid);
					if(user1==null)
					{
						System.out.println("No User Found");
						continue;
					}
					System.out.println("Enter Book name : ");
					String bname = sc.nextLine();
					Books book = Books.getBook(bname);
					if(book==null)
					{
						System.out.println("No User Found");
						continue;
					}
					user1.removeUserBook(book);
					book.changeAvaiability();
					System.out.println("Return Successfull");
				}
				else if(x==3)
				{
					Books.showIssuedBook();
				}
				else if(x==4)
				{
					System.out.println("Enter Book name : ");
					String bname = sc.nextLine();
					Books book = Books.getBook(bname);
					if(book==null)
					{
						System.out.println("No book found");
						continue;
					}
					int a = getIntInput(sc, "Enter days : ");
					book.setDuration(a);
				}
				else 
				{
					System.out.println("Wrong Input... try again");
				}
			}
			else if(n==0)
			{
				System.out.println("1. Change admin Credentials  \n2. Set Default Book Issue Duration \n3. Set Maximum Books Per User \n4.  Reset System Data \n5. Configure Fine Rules\n7.Back");
				System.out.println("Working on it...");
			}
			else if(n==4)
			{
				System.out.println("Update Details: ");
				System.out.println();
				int x =getIntInput(sc, "1. Change name \n2. change password \n3.Back");
				if(x==3)continue;
				if(x==1)
				{
					System.out.println("Enter new name");
					String newName = sc.nextLine();
					boolean check = user.setName(newName);
					if(check)
					{
						System.out.println("Updade successfully");
					}
					else 
					{
						System.out.println("Failed... try again");
					}
				}
				else if(x==2)
				{
					System.out.println("Enter old password");
					String oldpass = sc.nextLine();
					System.out.println("Enter new password");
					String newpass = sc.nextLine();
					boolean check = user.setPass(oldpass, newpass);
					if(check)
					{
						System.out.println("Updade successfully");
					}
					else 
					{
						System.out.println("Wrong old password... try again");
					}
				}
			}
			else if(n==5)
			{
				logout=true;
			}
			else 
			{
				System.out.println("Wrong input... try again");
			}
		}
	}
}

class DefaultData
{
	public static void addDefaultBooks()
	{
		Books.addBook("Maths");
		Books.addBook("English");
		Books.addBook("C++");
		Books.addBook("Java");
		Books.addBook("Pride and Prejudice");
		Books.addBook("The God of Small Things");
		Books.addBook("Midnight's Children");
		Books.addBook("A Suitable Boy");
		Books.addBook("Interpreter of Maladies");
		Books.addBook("The Inheritance of Loss");
		Books.addBook("Mahabharata");
		Books.addBook("Ramayan");
		Books.addBook("My hanuman Chalisa");
	}

	public static void addDefaultUsers()
	{
		User.addUser("Karan Sharma", "0133cs221077", "karan");
		User.addUser("Nazar", "0133cs221106", "0133cs221106");
		User.addUser("Nikhil Alone", "0133cs221112", "0133cs221112");
		User.addUser("Manvendra Singh Rajput", "0133cs221095", "0133cs221095");
		User.addUser("Kapil Singh", "0133cs221076", "0133cs221076");
		
		User.getUser("0133cs221077").addadmin("0133cs221077");
		User.getUser("0133cs221095").addUserBook(Books.getBook("English"));
		User.getUser("0133cs221095").addUserBook(Books.getBook("The Inheritance of Loss"));
		User.getUser("0133cs221076").addUserBook(Books.getBook("Ramayan"));
	}
	
}
