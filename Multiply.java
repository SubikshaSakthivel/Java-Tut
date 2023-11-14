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
/*output
Enter the number:2
Enter the number limit:10
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
2*10=20
*/