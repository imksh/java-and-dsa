package switchStatementAssignmentPart1;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Question 1");
		int n=5;
		question1(n);
		System.out.println();
		
		System.out.println("Question 2");
		char ch='M';
		question2(ch);
		System.out.println();
		
		System.out.println("Question 3");
		n=11;
		question3(n);
		System.out.println();
		
		System.out.println("Question 4");
		ch='N';
		question4(ch);
		System.out.println();
		
		System.out.println("Question 5");
		ch='R';
		question5(ch);
		System.out.println();
		
		System.out.println("Question 6");
		n=4;
		question6(n);
		System.out.println();
		
		System.out.println("Question 7");
		int a = 12;
		int b=15;
		char operator = '*';
		question7(a,b,operator);
		System.out.println();
		
		System.out.println("Question 8");
		ch='R';
		question8(ch);
		System.out.println();
		
		System.out.println("Question 9");
		String animal = "dog";
		question9(animal);
		System.out.println();
		
		System.out.println("Question 10");
		int score = 100;
		question10(score);
		System.out.println();
		
		
	}

	private static void question10(int score) 
	{
		switch(score/10)
		{
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
			System.out.println("F");
			break;
		case 4:
			System.out.println("F");
			break;
		case 3:
			System.out.println("F");
			break;
		case 2:
			System.out.println("F");
			break;
		case 1:
			System.out.println("F");
			break;
		case 0:
			System.out.println("F");
			break;
		default:
			System.out.println("Invalid");
			
		}
		
	}

	private static void question9(String animal) 
	{
		switch(animal)
		{
		case "dog":
			System.out.println("Mammal");
			break;
		case "cat":
			System.out.println("Mammal");
			break;
		case "bird":
			System.out.println("Bird");
			break;
		default:
			System.out.println("Invalid");
		}
		
	}

	private static void question8(char ch) 
	{
		switch(ch)
		{
		case 'A':
			System.out.println("Vowel");
			break;
		case 'a':
			System.out.println("Vowel");
			break;
		case 'E':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'I':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'O':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'U':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonent");
		}
		
	}

	private static void question7(int a, int b, char operator) 
	{
		
		switch(operator)
		{
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("Invalid");
			
		}
		
	}

	private static void question6(int n) 
	{
		switch(n)
		{
		case 6:
			System.out.println("Weekend");
			break;
		case 7:
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Not a weekend");
			
		}
		
	}

	private static void question5(char ch) 
	{
		
		switch(ch)
		{
		case 'R':
			System.out.println("Red");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		default:
			System.out.println("Invalid");
		}
	}

	private static void question4(char ch) 
	{
		switch(ch)
		{
		case 'N':
			System.out.println("North");
			break;
		case 'S':
			System.out.println("South");
			break;
		case 'E':
			System.out.println("East");
			break;
		case 'W':
			System.out.println("West");
			break;
		default:
			System.out.println("Invalid");
		}
		
	}

	private static void question3(int n) 
	{
		switch(n)
		{
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid");
			
		}
		
	}

	private static void question2(char ch) 
	{
		switch(ch)
		{
		case 'M':
			System.out.println("Male");
			break;
		case 'F':
			System.out.println("Female");
			break;
		default:
			System.out.println("Invalid");
		}
		
	}

	private static void question1(int n) 
	{
			switch(n)
			{
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thrusday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid");
				
			}
	}

}
