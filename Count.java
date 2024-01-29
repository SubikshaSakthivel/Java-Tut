import java.util.Scanner;

public class Count 
{
  static int counter(int n)
  {
    int count=0;
    while(n>0)
    {
    n=n/10;
    count++;
    }
    return count;

  }
  public static void main(String args[])
  {
   
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n=s.nextInt();
    System.out.print(counter(n));

    }
}

  

