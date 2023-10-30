import java.util.Scanner;

public class leapyear {
  public static void main(String args[])
  { System.out.println("Enter year: ");
    Scanner in=new Scanner(System.in);
    int leap=in.nextInt();
    if(leap%4==0 || (leap%100==0 & leap%400==0))
    {
     System.out.println("Its leap year");
    }
    else
    {
      System.out.println("Its  not leap year");
    }

  }
  
}
/* 
Enter year: 
2023
Its  not leap year
*/
