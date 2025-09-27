package string;

public class Constructors
{

    public static void main(String[] args)
    {
        //5 constructors
        String str = new String();//empty string
        System.out.println(str);

        String str1 = new String("abc");//String argument
        System.out.println(str1);

        char[] ch = {'a','b','c'};
        String str2 = new String(ch);//Character array argument
        System.out.println(str2);

        StringBuilder sbuBuilder = new StringBuilder("abc");//StringBuilder argument
        String str3 = new String(sbuBuilder);

        StringBuffer sbuBuffer = new StringBuffer("abc");//StringBuffer argument
        String str4 = new String(sbuBuffer);



    }

}