package conditionalAssignmentPart3;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Question 21");
		int unit = 300;
		System.out.println(electricityBill(unit));
		
		System.out.println("Question 22");
		int salary = 50000;
		char performanceRating = 'A';
		int yearsOfService = 8;
		String jobLevel = "junior";
		System.out.println(finalSalary(salary,performanceRating,yearsOfService,jobLevel));
		
		System.out.println("Question 23");
		int km=100;
		System.out.println(calculateTravelBill(km));
		
		System.out.println("Question 24");
		salary = 1200;
		System.out.println(grossSalary(salary));
		
		System.out.println("Question 25");
		int sub1 =70;
		int sub2 =80;
		int sub3 =65;
		int sub4 =75;
		int sub5 =90;
		System.out.println(studentDivision(sub1,sub2,sub3,sub4,sub5));
		
		System.out.println("Question 26");

		String status = "Married";
		String gender = "Male";
		int age = 28;
		System.out.println(insuranceEligibility(status,gender,age));
		
		System.out.println("Question 27");
		
		gender = "Male";
		yearsOfService=10;
		String qualifications = "Post-Graduate";
		System.out.println(calculateSalary(gender,yearsOfService,qualifications));
		
		System.out.println("Question 28");
		int purchaseAmount = 450;
		System.out.println(finalAmount(purchaseAmount));
		
		System.out.println("Question 29");
		age=55;
		String health = "Poor";
		if(calculateInsurance(age,health)==-1)
		{
			System.out.println("Not eligible for insurance");
		}
		else 
		{
			System.out.println("Premium is " + calculateInsurance(age,health));
		}
		
		System.out.println("Question 30");
		age = 25;
		String day = "Sunday";
		System.out.println(calculateTicketPrice(age,day));
	}

	private static int calculateTicketPrice(int age, String day) 
	{
		if(age<5)
		{
			return 0;
		}
		else if(age>=5 && age<18)
		{
			if(day=="Saturday" || day=="Sunday")
			{
				return 1500;
			}
			else 
			{
				return 1000;
			}
		}
		else if(age>=18 && age<60)
		{
			if(day=="Saturday" || day=="Sunday")
			{
				return 2000;
			}
			else 
			{
				return 1500;
			}
		}
		else if(age>=60)
		{
			if(day=="Saturday" || day=="Sunday")
			{
				return 750;
			}
			else 
			{
				return 0;
			}
		}
		return -1;
	}

	private static int calculateInsurance(int age, String health) 
	{
		if(age<30 && health=="Good")
		{
			return 500;
		}
		else if(age<30 && health=="Poor")
		{
			return 1000;
		}
		else if(age>=30 && age<50 && health=="Poor")
		{
			return 2000;
		}
		else if(age>=50 && health=="Good")
		{
			return 2000;
		}
		else if(age>=50 && health=="Poor")
		{
			return -1;
		}
		return -1;
	}

	private static double finalAmount(int purchaseAmount)
	{
		if(purchaseAmount<500)
		{
			return purchaseAmount;
		}
		else if(purchaseAmount>=500 && purchaseAmount<=1000)
		{
			return purchaseAmount-(0.05*purchaseAmount);
		}
		else if(purchaseAmount>=1001 && purchaseAmount<=5000)
		{
			return purchaseAmount-(0.10*purchaseAmount);
		}
		else if(purchaseAmount>5000)
		{
			return purchaseAmount-(0.15*purchaseAmount);
		}
		return -1;
	}

	private static int calculateSalary(String gender, int yearsOfService, String qualifications) 
	{
		if(gender=="Male")
		{
			if(yearsOfService>=10 && qualifications=="Post-Graduate")
			{
				return 15000;
			}
			else if(yearsOfService>=10 && qualifications=="Graduate")
			{
				return 10000;
			}
			else if(yearsOfService<10 && qualifications=="Post-Graduate")
			{
				return 10000;
			}
			else if(yearsOfService<10 && qualifications=="Graduate")
			{
				return 7000;
			}
		}
		else 
		{
			if(yearsOfService>=10 && qualifications=="Post-Graduate")
			{
				return 12000;
			}
			else if(yearsOfService>=10 && qualifications=="Graduate")
			{
				return 9000;
			}
			else if(yearsOfService<10 && qualifications=="Post-Graduate")
			{
				return 10000;
			}
			else if(yearsOfService<10 && qualifications=="Graduate")
			{
				return 6000;
			}
		}
		return -1;
	}

	private static String insuranceEligibility(String status, String gender, int age) 
	{
		if(status=="Married")
		{
			return "The driver is eligible for insurance.";
		}
		else if(status=="Unmarried" && gender=="Male" && age>30)
		{
			return "The driver is eligible for insurance.";
		}
		else if(status=="Unmarried" && gender=="Female" && age>25)
		{
			return "The driver is eligible for insurance.";
		}
		
		return "The driver is not eligible for insurance.";
	}

	private static String studentDivision(int sub1, int sub2, int sub3, int sub4, int sub5) 
	{
		double percent = ((double)(sub1+sub2+sub3+sub4+sub5)/500)*100;
		
		if(percent>=60)
		{
			return "First Division";
		}
		else if(percent>=50 && percent<=59)
		{
			return "Second Division";
		}
		else if(percent>=40 && percent<=49)
		{
			return "Second Division";
		}
		else 
		{
			return "Fail";
		}
	}

	private static double grossSalary(int salary)
	{
		if(salary<1500)
		{
			return salary+(0.1*salary)+(0.9*salary);
		}
		else 
		{
			return salary+500+(0.98*salary);
		}
		
	}

	private static int calculateTravelBill(int km)
	{
		int bill=0;
		if(km>10)
		{
			bill+=10*11;
		}
		else if(km>0)
		{
			bill+=km*11;
		}
		km-=10;
		if(km>90)
		{
			bill+=90*10;
		}
		else if(km>0)
		{
			bill+=km*10;
		}
		km-=90;
		if(km>0)
		{
			bill+=km*9;
		}
		return bill;
	}

	private static double finalSalary(int salary, char performanceRating, int yearsOfService, String jobLevel) 
	{
		double ans =0;
		if(performanceRating == 'A') 
		{
			if(yearsOfService>10)
			{
				ans=salary+(0.2*salary);
			}
			else if(yearsOfService>5 || yearsOfService<=10)
			{
				ans=salary+(0.15*salary);
			}
		}
		else if(performanceRating == 'B')
		{
			if(jobLevel=="senior")
			{
				ans=salary+(0.12*salary);
			}
			else if(jobLevel=="junior")
			{
				ans=salary+(0.08*salary);
			}
		}
		return ans;
	}

	private static double electricityBill(int unit) 
	{
		double bill = 0;
		if(unit>50)
		{
			bill+=50*0.50;
		}
		else if(unit>0)
		{
			bill+=unit*0.50;
		}
		unit-=50;
		if(unit>150)
		{
			bill+=150*0.75;
		}
		else if(unit>0)
		{
			bill+=unit*0.75;
		}
		unit-=150;
		if(unit>250)
		{
			bill+=250*1.20;
		}
		else if(unit>0)
		{
			bill+=unit*1.20;
		}
		unit-=250;
		if(unit>250)
		{
			bill+=unit*1.20;
		}
		else if(unit>0)
		{
			bill+=unit*1.20;
		}
		bill+=0.2*bill;
		return bill;
	}

}
