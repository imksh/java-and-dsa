package string;

import java.util.Arrays;

public class Part2
{

    public static void main(String[] args)
    {
        System.out.println("Question 1: ");
        q1("Java is fun");

        System.out.println("Question 2: ");
        q2("John,David,Michael,Rober");

        System.out.println("Question 3: ");
        q3("A|B|||C|");

        System.out.println("Question 4: ");
        q4("Java-is-a-popular-language");

        System.out.println("Question 5: ");
        q5("....i.like.this.program.very.much...");

        System.out.println("Question 6: ");
        q6("education");

        System.out.println("Question 7: ");
        q7(new String[] {"flower", "flow", "flight"});

        System.out.println("Question 8: ");
        q8("XIV");

        System.out.println("Question 9: ");
        q9("()[]{}");

        System.out.println("Question 10: ");
        q10("sadbutsad", "sad");

        System.out.println("Question 11: ");
        q11("Hello World");

        System.out.println("Question 12: ");
        q12("11","1");

        System.out.println("Question 13: ");
        q13("A man, a plan, a canal: Panama");
        System.out.println("Question 14: ");
        q14("abcde","abcde");

        System.out.println("Question 15: ");
        q15("2019-01-09");

        System.out.println("Question 16: ");
        q16("codeleet" , new int[] {4,5,6,7,0,2,1,3});

    }


    //	Que 16. You are given a string s and an integer
//	array indices of the same length. The string s will be
//	shuffled such that the character at the ith position
//	moves to indices[i] in the shuffled string.
//	Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//			Output: "leetcode"
    private static void q16(String str, int[] arr)
    {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            sb.append( str.charAt(arr[i]));
        }
        System.out.println(sb.toString());

    }

    //Que 15. Given a string date representing a Gregorian
//Calendar date formatted as YYYY-MM-DD, return the
//day number of the year.
//Example
//Input: date = "2019-01-09"
//Output: 9
    private static void q15(String str)
    {
        String[] string  = str.split("-");


        int year = Integer.parseInt(string[0]);
        int month= Integer.parseInt(string[1]);
        int day= Integer.parseInt(string[2]);


        int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};


        if(isLeap(year)) arr[1]=29;

        int count=0;

        for(int i=0;i<month-1;i++)
        {
            count+=arr[i];
        }
        count+=day;
        System.out.println(count);

    }


    private static boolean isLeap(int year)
    {

        return (year%4==0 && year%100!=0)|| year%400==0;
    }


    //Que 14. Given two strings s and goal, return true if and
//only if s can become goal after some number
//of shifts on s.
//A shift on s consists of moving the leftmost character
//of s to the rightmost position.
//• For example, if s = "abcde", then it will
//be "bcdea" after one shift.
//Example
//Input: s = "abcde", goal = "cdeab"
//Output: true
    private static void q14(String s, String goal)
    {
        System.out.println((s+s).contains(goal));

    }


    //Que 13. A phrase is a palindrome if, after converting all
//uppercase letters into lowercase letters and removing
//all non-alphanumeric characters, it reads the same
//forward and backward. Alphanumeric characters
//include letters and numbers.
//Given a string s, return true if it is a palindrome,
//or false otherwise.
//Example
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
    private static void q13(String str)
    {
        str=str.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLetterOrDigit(str.charAt(i)))
            {
                sb.append(str.charAt(i));
            }
        }
        StringBuilder sb1 = sb.reverse();
        System.out.println(sb.equals(sb1));
    }


    //Que 12. Given two binary strings a and b, return their
//sum as a binary string.
//Example
//Input: a = "11", b = "1"
//Output: "100"
    private static void q12(String a, String b)
    {


    }

    //Que 11. Given a string s consisting of words and
//spaces, return the length of the last word in the string.
//Example
//Input: s = "Hello World"
//Output: 5
    private static void q11(String string)
    {

//		int count=0;
//		string=string.trim();
//		for(int i=string.length()-1;i>=0;i--)
//		{
//			if(string.charAt(i)==' ') break;
//
//			count++;
//		}

        string=string.trim();
        String[] str=string.split(" ");

        System.out.println(str[str.length-1].length());

    }


    //Que 10. Given two strings needle and haystack, return
//the index of the first occurrence of needle in haystack,
//or -1 if needle is not part of haystack.
//Example
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
    private static void q10(String string, String string2)
    {
//		int n = string2.length();
//		for(int i=0;i<string.length();i++)
//		{
//
//			String sub = string.substring(i,n+i);
//			if(sub.equals(string2))
//			{
//				System.out.println(i);
//				return;
//			}
//		}

        System.out.println(string2.indexOf(string));

    }

    //Que 9. Given a string s containing just the
//characters '(', ')', '{', '}', '[' and ']', determine if the input
//string is valid.
//Input: s = "()[]{}"
//Output: true
    private static void q9(String string)
    {
        String prev =  string;
        do
        {
            prev=string;
            string=string.replace("()", "");
            string=string.replace("{}", "");
            string=string.replace("[]", "");

        }while(!string.equals(prev));

        System.out.println(string.isEmpty());

    }


    //Que 8. Write a program to convert input roman string
//into an integer.
//Roman numerals are based on the symbols I, V, X, L, C,
//D, and M, which represent 1, 5, 10, 50, 100, 500, and
//1,000, respectively.
//Input: XIV
//Output: 14
    private static void q8(String str)
    {
        int total=0;
        int prev=0;
        str=str.toUpperCase();
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            int curr = convert(ch);
            if(curr<prev)
            {
                total-=curr;
            }
            else
            {
                total+=curr;
            }
            prev=curr;
        }
        System.out.println(total);
    }

    private static int convert(char ch)
    {
        switch (ch) {
            case 'I'	 : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return -1;
    }

    //Que 7. Given an array of strings arr[], the task is to
//return the longest common prefix among each and
//every strings present in the array. If there’s no prefix
//common in all the strings, return “”.
//Input: arr[] = "flower", "flow", "flight"]
//Output: “fl”
//Explanation: The longest common prefix in the given
//strings ("flower", "flow", and "flight") is "fl".
//Input: arr[] = [“apple”, “ape”, “april”]
//Output : “ap”
    private static void q7(String[] strings)
    {
        String str ="";
        if(strings.length==0)
        {
            System.out.println(str);
        }
//		int k=0;
//		boolean check = true;
//		while(check)
//		{
//
//			for(int i=0;i<strings.length-1;i++)
//			{
//				if(k>=strings[i].length() || k>=strings[i+1].length() || strings[i].charAt(k)!= strings[i+1].charAt(k))
//				{
//					check=false;
//					break;
//				}
//			}
//			if(check)
//			{
//				str+=strings[0].charAt(k);
//			}
//			k++;
//		}

        StringBuilder ans = new StringBuilder();
        Arrays.sort(strings);
        char[] c1 = strings[0].toCharArray();
        char[] c2 = strings[strings.length-1].toCharArray();

        for(int i=0;i<c1.length;i++)
        {
            if(c1[i]!=c2[i])
            {
                break;
            }
            ans.append(c1[i]);
        }

        System.out.println(ans.toString());
    }


    //Que 6. Write a Java program to count both vowels and
//consonants in a string and display their counts
//separately. Ignore the special characters and numbers.
//Example
//Input: "education"
//Output: Vowels: 5 Consonants: 4
    private static void q6(String string) {
        // TODO Auto-generated method stub

    }
    //Que 5. Given a string str, the task is to reverse the
//order of the words in the given string.
//Note that str may contain leading or trailing dots(.) or
//multiple trailing dots(.) between two words. The
//returned string should only have a single dot(.)
//separating the words.
//Input: str = “i.like.this.program.very.much”
//Output: str = “much.very.program.this.like.i”
    private static void q5(String string)
    {
        string = string.replaceAll("^\\.+|\\.+$", "");
        String[] str = string.split("\\.",0);
        StringBuffer sb = new StringBuffer();

        for(int i=str.length-1;i>=0;i--)
        {
            sb.append(str[i]);
            if(i!=0) sb.append(".");
        }
        string=new String(sb);
        System.out.println(string);






    }

    //Que 4. Write a Java program to split a string by hyphen
//(-) and limit the result to 3 parts only.
//Input: String str = "Java-is-a-popular-language";
//Output: Java
//is
//a-popular-language
    private static void q4(String string)
    {
        String[] string2 =string.split("\\-",3);
        print(string2);

    }

    //Que 3. Write a Java program to split a string that
//contains multiple consecutive delimiters (|) and
//preserve empty values using limit = -1.
//Input: String str = "A|B|||C|";
//Output: [A]
//[B]
//[]
//[]
//[C]
//[]
    private static void q3(String string)
    {
        String[] str = string.split("\\|",-1);
        print(str);

    }

    //Que 2. Write a Java program to split a list of names
//separated by commas.
//Input: String str = "John,David,Michael,Robert";
//Output: John
//David
//Michael
//Robert
    private static void q2(String string)
    {
        String[] str = string.split(",");
        print(str);
    }

    //	Que 1. Write a Java program to split a sentence into
//	words using space (" ") as the delimiter.
//	Input: String str = "Java is fun";
//	Output: Java
//	is
//	fun
    private static void q1(String string)
    {
        String[] str =string.split(" ");
        print(str);

    }

    private static void print(String[] str)
    {
        for(int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }
    }

}
