import java.util.Scanner;

public class Multiply {
  public static void main(String ags[])
  {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the number:");
    int num=in.nextInt();
    for(int i=1;i<=num;i++)
    {
      System.out.println(num +"*" +i+"="+num*i);
    }

  }
  
}
