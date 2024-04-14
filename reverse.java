import java.util.Scanner;

public class reverse {
    static int count(int num)
    {
      int number=num;
      int sum=0,temp;
      int rev=0;
     // int len=String.valueOf(num).length();
      while(number!=0)
      {
        temp=number%10;
        rev=(rev*10)+temp;
        number/=10;
      }
   return rev;

    }
public static void main(String[] args) 
  {
    System.out.println("Reverse a String ...");
  Scanner sum=new Scanner(System.in);
  int num=sum.nextInt();
  System.out.println(count(num));
  }
}
//output
// Reverse a String ...
// 123
// 321