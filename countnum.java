import java.util.Scanner;

public class countnum  {
    static int count(int num)
    {
      int number=num;
      int sum=0,temp;
     // int len=String.valueOf(num).length();
      while(number!=0)
      {
        temp=number%10;
        sum++;
        number/=10;
      }
   return sum;

    }
public static void main(String[] args) 
  {
  
  Scanner sum=new Scanner(System.in);
  int num=sum.nextInt();
  System.out.println(count(num));
  }
}
//output
// Counting number of digits
// 123
// 3