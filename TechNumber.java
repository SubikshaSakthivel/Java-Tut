import java.util.*;

public class TechNumber {
  public static void main(String args[])
  { int count=0;
    Scanner in=new Scanner(System.in);
    System.out.println("enter any number:");
    String num=in.next();
    int len=num.length(); //number of digits in  a number
    if(len!=4)
    {
    System.out.println("enter 4 digits only");
    System.out.println("exit");
    }
int n=Integer.parseInt(num);
int rem=0,quo=0,sum=0,sq=0;
rem=n%100;
quo=n/100;
sum=rem+quo;
sq=sum*sum;
if(sq==n)
{
  System.out.println("Tech number");
}
else
{
  System.out.println("Its not");
}
  }
}




    
   