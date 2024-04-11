// import java.util.Scanner;

// public class PrimeNumber 
// {
//   public static void main(String args[])
//   {
//     Scanner in=new Scanner(System.in);
//     System.out.print("Enter the number:");
//     int n=in.nextInt();
//     boolean isprime=true;
//     for(int i=2;i<=n/2;i++)
//     {
//       if(n%i==0)
//       {
//          isprime=false;
//          break;
//       }
//     }
//     if(isprime)
//     {
//       System.out.print("prime");   
//     }
//     else
//     {
//       System.out.print("Not prime");  
//     }
    
//   }
// }
// /*output
//   Enter the number:21
//   Not prime
//  

import java.util.Scanner;





public class PrimeNumber
{

  static boolean isPrime(int n)
  {
   if(n==1)
   {
    return false;
   }
  if(n==2 || n==3)
  {
    return true;
  }
if(n%2==0 || n%3==0)
{
  return false;
}
for(int i=5;i*i<=n;i+=6)
{
  if(n%i==0  || n%(i+2)==0)
  {
    return false;
  }
}
return true;
  }
  public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    int n=scan.nextInt();
    System.out.println(isPrime(n));

    
  }

}