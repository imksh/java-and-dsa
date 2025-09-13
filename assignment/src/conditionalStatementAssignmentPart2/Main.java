package conditionalStatementAssignmentPart2;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Question Number 11");
		int num=6;
		System.out.println(printWeekday(num));
		System.out.println();
		
		System.out.println("Question Number 12");
		num=6;
		System.out.println(printMonthName(num));
		System.out.println();
		
		System.out.println("Question Number 13");
		int notesOf100 = 5;
		int notesOf500 = 25;
		int notesOf2000 = 35;
		System.out.println(calculateTotalAmount(notesOf100,notesOf500,notesOf2000));
		System.out.println();
		
		System.out.println("Question Number 14");
		int quantity = 101;
		int price=20;
		System.out.println(totalExpense(quantity,price));
		System.out.println();
		
		System.out.println("Question Number 15");
		int angle1=40;
		int angle2=40;
		int angle3=40;
		System.out.println(isValidTriangle(angle1,angle2,angle3));
		System.out.println();
		
		System.out.println("Question Number 16");
		int side1=10;
		int side2=15;
		int side3=25;
		System.out.println(isValidTriangleSides(side1,side2,side3));
		System.out.println();
		
		System.out.println("Question Number 17");
		side1=10;
		side2=1;
		side3=10;
		System.out.println(checkTriangleType(side1,side2,side3));
		System.out.println();
		
		System.out.println("Question Number 18");
		int currentYear=2025;
		int joiningYear=2020;
		if(yearServed(currentYear,joiningYear)>3)
		{
			System.out.println("The employee is eligible for a bonus of 2500");
		}
		else 
		{
			System.out.println("The employee is not eligible for a bonus");
		}
		
		System.out.println("Question Number 19");
		int sub1 = 95;
		int sub2 = 85;
		int sub3 = 90;
		int sub4 = 80;
		int sub5 = 88;
		System.out.println(calculateGrade(sub1,sub2,sub3,sub4,sub5));
		
		System.out.println("Question Number 20");
		int salary = 8000;
		
		System.out.println(calculateGrossSalary(salary));

	}

	private static double calculateGrossSalary(int salary) 
	{
		if(salary<=10000)
		{
			return salary + 0.2*salary + 0.8*salary;
		}
		else if(salary<=20000)
		{
			return salary + 0.25*salary + 0.9*salary;
		}
		else if(salary>20000)
		{
			return salary + 0.3*salary + 0.95*salary;
		}
		return -1;
	}

	private static String calculateGrade(int sub1, int sub2, int sub3, int sub4, int sub5) {
		int total = sub1+sub2+sub3+sub4+sub5;
		float percentage=((float)total/500)*100;
		if(percentage>=90)
		{
			return "Grade A";
		}
		else if(percentage>=80)
		{
			return "Grade B";
		}
		else if(percentage>=70)
		{
			return "Grade C";
		}
		else if(percentage>=60)
		{
			return "Grade D";
		}
		else if(percentage>=40)
		{
			return "Grade F";
		}
		return "Grade F";
	}

	private static int yearServed(int currentYear, int joiningYear) {
		int served = currentYear-joiningYear;
		return served;
	}

	private static String checkTriangleType(int side1, int side2, int side3) {
		if(side1==side2 && side1==side3)
		{
			return "Equilateral";
		}
		else if(side1!=side2 && side1 != side3  && side2!=side3)
		{
			return "Scalene";
		}
		return "Isosceles";
	}

	private static boolean isValidTriangleSides(int side1, int side2, int side3) 
	{
		if(side1+side2>side3 && side3+side2>side1 && side1+side3>side2)
		{
			return true;
		}
		
		return false;
	}

	private static boolean isValidTriangle(int angle1, int angle2, int angle3) 
	{
		if(angle1+angle2+angle3 == 180)
		{
			return true;
		}
		return false;
	}

	private static double totalExpense(int quantity, int price) 
	{
		int total = quantity*price;
		if(quantity>100)
		{
			return total-(0.10 * total);
		}
		return total;
	}

	private static String calculateTotalAmount(int notesOf100, int notesOf500, int notesOf2000) {
		int total = (notesOf100 * 100) + (notesOf100 * 500) + (notesOf2000 * 2000);
		if(total>10000)
		{
			return "Amount exceeds 10,000";
		}
		return "Amount is within limit";
	}

	private static String printMonthName(int num) 
	{
		if(num==1)
		{
			return "January";
		}
		else if(num==2)
		{
			return "February";
		}
		else if(num==3)
		{
			return "March";
		}
		else if(num==4)
		{
			return "April";
		}
		else if(num==5)
		{
			return "May";
		}
		else if(num==6)
		{
			return "June";
		}
		else if(num==7)
		{
			return "July";
		}
		else if(num==8)
		{
			return "August";
		}
		else if(num==9)
		{
			return "September";
		}
		else if(num==10)
		{
			return "October";
		}
		else if(num==11)
		{
			return "November";
		}
		else if(num==12)
		{
			return "December";
		}
		return null;
	}

	private static String printWeekday(int num) 
	{
		if(num==1)
		{
			return "Monday";
		}
		else if(num==2)
		{
			return "Tuesday";
		}
		else if(num==3)
		{
			return "Wednesday";
		}
		else if(num==4)
		{
			return "Thrusday";
		}
		else if(num==5)
		{
			return "Friday";
		}
		else if(num==6)
		{
			return "Saturday";
		}
		else if(num==7)
		{
			return "Sunday";
		}
		return null;
	}

}
