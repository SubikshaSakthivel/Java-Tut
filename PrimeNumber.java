import java.util.Scanner;

public class PrimeNumber 
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the number:");
    int n=in.nextInt();
    boolean isprime=true;
    for(int i=2;i<=n/2;i++)
    {
      if(n%i==0)
      {
         isprime=false;
         break;
      }
    }
    if(isprime)
    {
      System.out.print("prime");   
    }
    else
    {
      System.out.print("Not prime");  
    }
    
  }
}
/*output
  Enter the number:21
  Not prime
 */ 