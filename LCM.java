// import java.util.Scanner;

// public class LCM
// {
//   static int lcm(int a,int b)
//   {
//     int  res = Math.max(a,b);
//     {
//       while (true) 
//       {
//         if(res%a==0 && res%b==0)    
//         {
//           break;
//         }  
//         res++;
//       }
//       return res;
//     }
//   }
// public static void main(String[] args) 
//   {
//     Scanner in=new Scanner(System.in);
//     System.out.print("Enter value a:");
//     int a=in.nextInt();
//     System.out.print("Enter value b:");
//     int b=in.nextInt();
//     System.out.println(lcm(a,b));
//   }
// }
// /* ------ Output ------
//  * Enter value a:3
//    Enter value b:7
//    21
//  */
import java.util.Scanner;

public class LCM {
  static int gcd(int a,int b)
  {
    while(a!=0 && b!=0)
    {
      if(a>b)
      {
        a=a%b;
      }
      else
      {
          b=b%a;
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
  static int lcm(int a,int b)
  {
    return (a*b)/gcd(a,b);
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = in.nextInt();
    System.out.print("Enter second number: ");
    int b = in.nextInt();

    int result = lcm(a, b);
    System.out.println("LCM of " + a + " and " + b + " is: " + result);
  }
}
/* OUTPUT:
 * Enter first number: 3
   Enter second number: 7
  LCM of 3 and 7 is: 21
 */
  


