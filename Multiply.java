import java.util.Scanner;

public class Multiply {
  public static void main(String ags[])
  {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the number:");
    int num=in.nextInt();
    System.out.print("Enter the number limit:");
    int num1=in.nextInt();
    for(int i=1;i<=num1;i++)
    {
      System.out.println(num +"*" +i+"="+num*i);
    }

  }
  
}
