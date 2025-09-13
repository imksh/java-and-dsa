package hollowPaternAssignmentPart2ByWhileLoop;
public class Main 
{
    public static void Q1() 
    {
        System.out.println("Q1");
        int n = 6, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < 2 * n - 1) 
            {
                System.out.print((i==n-1 || i+j==n-1 ||j-i==n-1)?"* ":"  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void Q2() 
    {
        System.out.println("Q2");
        int n = 6, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < 2 * n - 1) 
            {
                System.out.print((i==0 ||i ==j ||i+j==2*n-n/3)?"* ":"  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void Q3() 
    {
        System.out.println("Q3");
        int n = 11, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n / 2 + 1) 
            {
                System.out.print((j==0 ||i==j||i+j==n-1)?"* ":"  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void Q4() 
    {
        System.out.println("Q4");
        int n = 11, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n / 2 + 1) 
            {
                System.out.print((j == n / 2 || i + j == n / 2 || i - j == n / 2) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void Q5() 
    {
        System.out.println("Q5");
        int n = 11, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n) 
            {
                System.out.print((i + j == n / 2 || j - i == n / 2 || i - j == n / 2 || i + j == n + n / 2 - 1) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void Q6() 
    {
        System.out.println("Q6");
        int n = 11, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n) 
            {
                System.out.print((j == 0 || j == n - 1 || i == j || i + j == n - 1) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void Q7() 
    {
        System.out.println("Q7");
        int n = 11, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n) 
            {
                System.out.print((i + j == n / 2 || j - i == n / 2 || i - j == n / 2 || i + j == n + n / 2 - 1 || j == n / 2) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void Q8() 
    {
        System.out.println("Q8");
        int n = 11, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n) 
            {
                System.out.print((i + j == n / 2 || j - i == n / 2 || i - j == n / 2 || i + j == n + n / 2 - 1 || i == n / 2) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void Q9() 
    {
        System.out.println("Q9");
        int n = 11, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n) 
            {
                System.out.print((i + j == n / 2 || j - i == n / 2 || i - j == n / 2 || i + j == n + n / 2 - 1 || j == 0 || j == n - 1) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void Q10() 
    {
        System.out.println("Q10");
        int n = 11, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n) 
            {
                System.out.print((i + j == n / 2 || j - i == n / 2 || i - j == n / 2 || i + j == n + n / 2 - 1 || i == 0 || i == n - 1) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) 
    {
        Q1();
        Q2();
        Q3();
        Q4();
        Q5();
        Q6();
        Q7();
        Q8();
        Q9();
        Q10();
    }
}