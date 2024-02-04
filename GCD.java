//IN BRUTE FORCE APPROACH
//import java.util.Scanner;
// public class GCD 
// {
// public static void main(String args[])
// {
// Scanner in=new Scanner(System.in);
// System.out.print("Enter a:");
// int a=in.nextInt();
// System.out.print("Enter b:");
// int b=in.nextInt();
// int min;
// if(a<b)
// {
//   min=a;
// }
// else
// {
//   min=b;
// }
// for(int i=min;i>=1;i--)
// {
//   if(a%i==0 && b%i==0)
//   {
//   System.out.println("The GCD of the given number :"+i);
//   break;
// }
// }
// }
// }
/* Output 
   Enter b:5
   The GCD of the given number 5
 */
//<------------------------------------------------------------------------------->
//EUCLIDS THEOREM//
import java.util.Scanner;

public class GCD 
{
    static int euclid(int a, int b)
    {
        while (a!=0 && b!=0)
        {
            if (a > b)
            {
                a = a % b;
            }
            else
            {
                b = b % a;
            }
        }
       if(a!=0)
       {
        return a;
       }
       else
       {
        return b;
       }
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();

        int result = euclid(a, b);
        System.out.println("GCD: " + result);
    }
}
/*
 * Output:
 * Enter a: 5
   Enter b: 15
   GCD: 5
 */
