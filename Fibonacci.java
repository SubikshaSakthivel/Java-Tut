import java.util.Scanner;

public class Fibonacci

{
  public static void main(String args[])
  {
    int i=1,firstterm=0,secondterm=1;
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the number of terms to end:");
    int n=in.nextInt();
    while(i<=n)
    {
     System.out.print(firstterm+",");
     int nextterm=firstterm+secondterm;
     firstterm=secondterm;
     secondterm=nextterm;
     i++;
    }
     }  
  }
  /*output
    Enter the number of terms to end:5
     0,1,1,2,3,
   */
