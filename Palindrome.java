import java.util.Scanner; // checking numbers

public class Palindrome {
  public static void main(String args[])
  {
    int rev=0;
    Scanner in =new Scanner(System.in);
    System.out.print("Enter the number:");
    int n= in.nextInt();
    int temp=n;
    while(n!=0)
    {
    int m=n%10;
    rev=rev*10+m;
    n=n/10;
    }
    System.out.println("The reversed number is:"+rev);
    if (rev==temp)
    {
      System.out.println("palindrome");
    }
    else
    {
      System.out.println("Not A palindrome");
    }
  }}
  /* output
     Enter the number:121
     The reversed number is:121
     palindrome
*/
  



  
  

