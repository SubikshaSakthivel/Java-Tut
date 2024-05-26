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
   try{
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n=s.nextInt();
    if(n<0)
    {
      throw new IllegalArgumentException("Please enter a positive integer.");
    }
    System.out.println("Number of digits: " + counter(n));
  }
  catch(NumberFormatException e)
  {
    System.out.println("Print valid number format:");
  }
    catch(Exception e)
    {
      System.out.println("Error: " + e.getMessage());
    }
}
}
  
/*
 * Output 1:(number)
 * Enter the value of n:4567
    4
Enter the value of n:im9 (number with string)
Error: null
* 
 */

  

