import java.util.Scanner;

public class SumOfDigit 
{
  public static void main(String args[])
  {
    int i,sum=0;
    Scanner in=new Scanner(System.in);
    System.out.print("enter the number: ");
    int n=in.nextInt();
    for(i=0;i<=n;i++)
    {
       sum=sum+i;
    }
       System.out.printf("The sum of digit is:"+sum);
    }
    }
    /*output
     * enter the number: 5
       The sum of digit is:15
     */
  
  

