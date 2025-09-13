package hollowPaternAssignmentPart1ByWhileLoop;
public class Main 
{
    public static void Q1() 
    {
        System.out.println("Q1");
        int n = 5, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n + 1) 
            {
                System.out.print((i == 0 || i == n - 1) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
    public static void Q2() 
    {
        System.out.println("Q2");
        int n = 5, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n + 1) 
            {
                System.out.print((j == 0 || j == n) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
    public static void Q3() 
    {
        System.out.println("Q3");
        int n = 5, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n + 1) 
            {
                System.out.print((i == 0 || i == n - 1 || j == 0 || j == n) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
    public static void Q4() 
    {
        System.out.println("Q4");
        int n = 5, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n + 1) 
            {
                System.out.print((i == n - 1 || j == 0 || j == n) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
    public static void Q5() 
    {
        System.out.println("Q5");
        int n = 5, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n + 1) 
            {
                System.out.print((i == 0 || j == 0 || j == n) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
    public static void Q6() 
    {
        System.out.println("Q6");
        int n = 5, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n) 
            {
                System.out.print((i == j) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
    public static void Q7() 
    {
        System.out.println("Q7");
        int n = 5, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n) 
            {
                System.out.print((i + j == n - 1) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
    public static void Q8() 
    {
        System.out.println("Q8");
        int n = 5, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n) 
            {
                System.out.print((i == j || i + j == n - 1) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
    public static void Q9() 
    {
        System.out.println("Q9");
        int n = 5, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n) 
            {
                System.out.print((i == 0 || i == n - 1 || i + j == n - 1) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
    public static void Q10() 
    {
        System.out.println("Q10");
        int n = 5, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n) 
            {
                System.out.print((i == j || i == 0 || i == n - 1) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
    public static void Q11() 
    {
        System.out.println("Q11");
        int n = 7, i = 0;
        while (i < n) 
        {
            int j = 0;
            while (j < n) 
            {
                System.out.print((j == n / 2 || i == n / 2) ? "* " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void Q12() 
        {
            System.out.println("Q12");
            int n = 7, i = 0;
            while (i < n) 
            {
                int j = 0;
                while (j < n) 
                {
                    System.out.print((i == 0 || i == n - 1 || j == 0 || j == n - 1 || j == n / 2) ? "* " : "  ");
                    j++;
                }
                System.out.println();
                i++;
            }
        }
        
     public static void Q13() 
     {
            System.out.println("Q13");
            int n = 7, i = 0;
            while (i < n) 
            {
                int j = 0;
                while (j < n) 
                {
                    System.out.print((j == 0 || i == n - 1 || i == j) ? "* " : "  ");
                    j++;
                }
                System.out.println();
                i++;
            }
        }
        
     public static void Q14() 
     {
            System.out.println("Q14");
            int n = 7, i = 0;
            while (i < n) 
            {
                int j = 0;
                while (j < n) 
                {
                    System.out.print((j == 0 || i == 0 || i + j == n - 1) ? "* " : "  ");
                    j++;
                }
                System.out.println();
                i++;
            }
        }
        
      public static void Q15() 
      {
            System.out.println("Q15");
            int n = 7, i = 0;
            while (i < n) 
            {
                int j = 0;
                while (j < n) 
                {
                    System.out.print((i == n - 1 || j == n - 1 || i + j == n - 1) ? "* " : "  ");
                    j++;
                }
                System.out.println();
                i++;
            }
        }
        
       public static void Q16() 
       {
            System.out.println("Q16");
            int n = 7, i = 0;
            while (i < n) 
            {
                int j = 0;
                while (j < n) 
                {
                    System.out.print((i == 0 || j == n - 1 || i == j) ? "* " : "  ");
                    j++;
                }
                System.out.println();
                i++;
            }
        }
        
        public static void Q17() 
        {
            System.out.println("Q17");
            int n = 7, i = 0;
            while (i < n) {
                int j = 0;
                while (j < n) 
                {
                    System.out.print((i == 0 || i == n / 2 || i == n - 1 || j == 0 || j == n / 2 || j == n - 1) ? "* " : "  ");
                    j++;
                }
                System.out.println();
                i++;
            }
        }
        
        public static void Q18() 
        {
            System.out.println("Q18");
            int n = 7, i = 0;
            while (i < n) 
            {
                int j = 0;
                while (j < n) 
                {
                    System.out.print((i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) ? "* " : "  ");
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
    	Q11();
    	Q12();
    	Q13();
    	Q14();
    	Q15();
    	Q16();
    	Q17();
    	Q18();
    	
        
    }
}