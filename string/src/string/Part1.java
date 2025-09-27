package string;

public class Part1
{
    public static void main(String[] args)
    {
        System.out.println("Question 1: ");
        q1();
        System.out.println();

        System.out.println("Question 2: ");
        int[] arr = {1,2,3,4,5};
        q2(arr);
        System.out.println();

        System.out.println("Question 3: ");
        q3(arr);
        System.out.println();

        System.out.println("Question 4: ");
        int[] arr1 = {1,2,3,4,5,6};
        q4(arr1);
        System.out.println();

        System.out.println("Question 5: ");
        q5(arr1);
        System.out.println();

        System.out.println("Question 6: ");
        q6(arr1);
        System.out.println();

        System.out.println("Question 7: ");
        q7(arr1);
        System.out.println();

        System.out.println("Question 8: ");
        q8(new int[] {5, 7, 3, 9, 4});
        System.out.println();

        System.out.println("Question 9: ");
        q9(new int[] {5, 7, 3, 9, 4});
        System.out.println();

        System.out.println("Question 10: ");
        q10(new int[] {5, 7, 3, 9, 4});
        System.out.println();

        System.out.println("Question 11: ");
        q11(new int[] {1, 2, 3, 4},new int[] {5, 6, 7, 8});
        System.out.println();

        System.out.println("Question 12: ");
        q12(new int[] {1, 2, 3, 4, 5});
        System.out.println();

        System.out.println("Question 13: ");
        int[] evenArr = q13(new int[] {14, 9, 6, 20, 35});
        for(int i=0;i<evenArr.length;i++) System.out.print(evenArr[i]+" ");
        System.out.println();

        System.out.println("Question 14: ");
        int[] oddArr = q14(new int[] {14, 9, 6, 20, 35});
        for(int i=0;i<oddArr.length;i++) System.out.print(oddArr[i]+" ");
        System.out.println();

        System.out.println("Question 15: ");
        System.out.println(q15(new int[] {1, 2, 3, 4, 5}));

        System.out.println("Question 16: ");
        System.out.println(q16(new int[] {1, 2, 3, 4, 5}));

        System.out.println("Question 17: ");
        System.out.println(q17(new int[] {1, 2, 3, 4, 5}));

        System.out.println("Question 18: ");
        System.out.println(q18(new int[] {1, 2, 3, 4, 5}));

        System.out.println("Question 19: ");
        q19(new int[] {1, 2, 3, 4, 5});

        System.out.println("Question 20: ");
        q20(new int[] {1, 2, 3, 4, 5});

        System.out.println("Question 21: ");
        int[] squareRoot = squareRoot(new int[] {1, 4, 9, 16, 25});
        int[] cubeRoot = cubeRoot(new int[]  {1, 8, 27, 64, 125});
        System.out.print("Square Root = ");
        for(int i=0;i<squareRoot.length;i++) System.out.print(squareRoot[i]+" ");
        System.out.println();
        System.out.print("Cube Root = ");
        for(int i=0;i<cubeRoot.length;i++) System.out.print(cubeRoot[i]+" ");
        System.out.println();

        System.out.println("Question 22: ");
        int[] twoDigit = q22(new int[] {1, 22, 309, 4, 55});
        System.out.print("Two digit Array = ");
        for(int i=0;i<twoDigit.length;i++) System.out.print(twoDigit[i]+" ");
        System.out.println();

        System.out.println("Question 23: ");
        q23(new int[] {22, 309, 4, 55});

        System.out.println("Question 24: ");
        int[] primeArr = q24(new int[] {11,22,33,41,59});
        System.out.print("Prime Array = ");
        for(int i=0;i<primeArr.length;i++) System.out.print(primeArr[i]+" ");
        System.out.println();

        System.out.println("Question 25: ");
        int n=31;
        q25(new int[] {11, 21, 31, 41, 51},n);

        System.out.println("Question 26: ");
        n=3;
        q26(new int[]  {1, 2, 3, 3, 6, 3, 5, 3},n);
        System.out.println("Question 27: ");
        q27(new int[]  {1, 5, 2, 5, 2, 2, 1, 6});

        System.out.println("Question 28: ");
        int[] sumArr = q28(new int[] {10, 20, 30, 40}, new int[] {1, 2, 3, 4});
        System.out.print("Sum Array = ");
        for(int i=0;i<sumArr.length;i++) System.out.print(sumArr[i]+" ");
        System.out.println();

        System.out.println("Question 29: ");
        int[] productArr = q29(new int[] {10, 20, 30, 40}, new int[] {1, 2, 3, 4});
        System.out.print("Product Array = ");
        for(int i=0;i<productArr.length;i++) System.out.print(productArr[i]+" ");
        System.out.println();

        System.out.println("Question 30: ");

        sumArr = sum(new int[] {10, 20, 30, 40,50}, new int[] {1, 2, 3});
        System.out.print("Sum : ");
        for(int i=0;i<sumArr.length;i++) System.out.print(sumArr[i]+" ");
        System.out.println();

        productArr = product(new int[] {10, 20, 30, 40,50}, new int[] {1, 2, 3});
        System.out.print("Product : ");
        for(int i=0;i<productArr.length;i++) System.out.print(productArr[i]+" ");
        System.out.println();



    }

    private static int[] product(int[] arr1, int[] arr2) {
        int i=0;
        int[] sum = new int[Math.max(arr1.length, arr2.length)];
        while(i<arr1.length && i<arr2.length)
        {
            sum[i]=arr1[i]*arr2[i];
            i++;
        }

        while(i<arr1.length)
        {
            sum[i]=arr1[i];
            i++;
        }
        while(i<arr2.length)
        {
            sum[i]=arr2[i];
            i++;
        }
        return sum;
    }

    private static int[] sum(int[] arr1, int[] arr2) {
        int i=0;
        int[] sum = new int[Math.max(arr1.length, arr2.length)];
        while(i<arr1.length && i<arr2.length)
        {
            sum[i]=arr1[i]+arr2[i];
            i++;
        }

        while(i<arr1.length)
        {
            sum[i]=arr1[i];
            i++;
        }
        while(i<arr2.length)
        {
            sum[i]=arr2[i];
            i++;
        }
        return sum;
    }

    private static int[] q29(int[] arr1, int[] arr2) {
        int i=0;
        int[] sum = new int[Math.max(arr1.length, arr2.length)];
        while(i<arr1.length && i<arr2.length)
        {
            sum[i]=arr1[i]*arr2[i];
            i++;
        }
        return sum;
    }

    private static int[] q28(int[] arr1, int[] arr2) {
        int i=0;
        int[] sum = new int[Math.max(arr1.length, arr2.length)];
        while(i<arr1.length && i<arr2.length)
        {
            sum[i]=arr1[i]+arr2[i];
            i++;
        }
        return sum;
    }

    private static void q27(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int count =0;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]==arr[j]) count++;

            }
            System.out.println("Occurrence of " + arr[i] + " is " + count);
        }
    }

    private static void q26(int[] arr, int n)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                count++;
            }
        }
        System.out.println(count);
    }


    private static void q25(int[] arr, int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }


    private static int[] q24(int[] arr)
    {
        int[] ans =new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(isPrime(arr[i],2)) ans[k++] = arr[i];
        }
        int[] ans2= new int[k];
        for(int i=0;i<k;i++)
        {
            ans2[i]=ans[i];
        }
        return ans2;
    }


    private static boolean isPrime(int n,int i)
    {
        if(n<=1) return false;
        if(i*i>n) return true;
        if(n%i==0) return false;
        return isPrime(n,i+1);
    }


    private static void q23(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" is a "+ digit(arr[i])+ " digit number");
        }
        System.out.println();
    }

    private static int digit(int i)
    {
        int count =0;
        while(i!=0)
        {
            i/=10;
            count++;
        }
        return count;
    }


    private static int[] q22(int[] arr)
    {
        int[] ans =new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>9 && arr[i]<100) ans[k++] = arr[i];
        }
        int[] ans2= new int[k];
        for(int i=0;i<k;i++)
        {
            ans2[i]=ans[i];
        }
        return ans2;
    }

    private static int[] cubeRoot(int[] arr)
    {
        int[] ans =new int[arr.length];
        for(int i=0;i<arr.length;i++) ans[i]=(int)Math.cbrt(arr[i]);
        return ans;
    }

    private static int[] squareRoot(int[] arr)
    {
        int[] ans =new int[arr.length];
        for(int i=0;i<arr.length;i++) ans[i]=(int)Math.sqrt(arr[i]);
        return ans;
    }

    private static void q20(int[] arr)
    {
        int[] square =new int[arr.length];
        int[] cube =new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            square[i]=arr[i]*arr[i];
            cube[i]=arr[i]*arr[i]*arr[i];

        }
        System.out.print("Square = ");
        for(int i=0;i<arr.length;i++)System.out.print(square[i]+" ");
        System.out.println();
        System.out.print("Cube = ");
        for(int i=0;i<arr.length;i++)System.out.print(cube[i]+" ");
        System.out.println();

    }

    private static void q19(int[] arr)
    {
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0) even++;
            if(arr[i]%2!=0) odd++;

        }
        System.out.println("Even = "+even + " Odd = " + odd);

    }

    private static int q18(int[] arr)
    {
        int sum=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0) sum*=arr[i];

        }
        return sum;
    }

    private static int q17(int[] arr)
    {
        int sum=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0) sum*=arr[i];

        }
        return sum;
    }

    private static int q16(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0) sum+=arr[i];

        }
        return sum;
    }

    private static int q15(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0) sum+=arr[i];

        }
        return sum;
    }

    private static int[] q14(int[] arr)
    {
        int[] ans = new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                ans[k++]=arr[i];
            }
        }
        int[] ans2= new int[k];
        for(int i=0;i<k;i++)
        {
            ans2[i]=ans[i];
        }
        return ans2;
    }

    private static int[] q13(int[] arr)
    {
        int[] ans = new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                ans[k++]=arr[i];
            }
        }
        int[] ans2= new int[k];
        for(int i=0;i<k;i++)
        {
            ans2[i]=ans[i];
        }
        return ans2;
    }

    private static void q12(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++) sum+=arr[i];

        System.out.println(sum);

    }

    private static void q11(int[] arr1, int[] arr2) {
        for(int i=0;i<arr1.length || i<arr2.length;i++)
        {
            System.out.print(i<arr1.length?arr1[i]+" ": " "+" ");


            if(i<arr2.length) System.out.print(arr2[i]+ " ");
            System.out.println();
        }

    }

    private static void q10(int[] arr)
    {
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max, arr[i]);
            min=Math.min(min, arr[i]);
        }
        System.out.println(max-min);

    }

    private static void q9(int[] arr)
    {
        int max =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max, arr[i]);
        }
        System.out.println(max);

    }

    private static void q8(int[] arr)
    {
        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            min=Math.min(min, arr[i]);
        }
        System.out.println(min);

    }

    private static void q7(int[] arr)
    {
        for(int i=(arr.length/2);i<arr.length;i++) System.out.print(arr[i]+" ");

    }

    private static void q6(int[] arr)
    {
        for(int i=(arr.length/2)-1;i>=0;i--) System.out.print(arr[i]+" ");

    }

    private static void q5(int[] arr)
    {
        for(int i=arr.length-1;i>=arr.length/2;i--) System.out.print(arr[i]+" ");

    }

    private static void q4(int[] arr)
    {
        for(int i=0;i<arr.length/2;i++) System.out.print(arr[i]+" ");

    }

    private static void q3(int[] arr)
    {
        for(int i=arr.length-1;i>=0;i--) System.out.print(arr[i]+" ");

    }

    private static void q2(int[] arr)
    {
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");


    }

    private static void q1()
    {
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++) arr[i]=i;
        for(int i=0;i<arr.length;i++)System.out.print(arr[i] +" ");

    }

}
