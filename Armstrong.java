import java.util.Scanner;

public class Armstrong  {
    static boolean isArmstrong(int num)
    {
      int number=num;
      int sum=0,temp;
      int len=String.valueOf(num).length();
      while(number!=0)
      {
        temp=number%10;
        sum+=Math.pow(temp,len);
        number/=10;
      }
   return sum==num;

    }
public static void main(String[] args) 
  {
  System.out.println("Armstrong number");
  Scanner sum=new Scanner(System.in);
  int num=sum.nextInt();
 
if(isArmstrong(num))
{
  System.out.println(num+  "  is Armstrong number");
}
else{
  System.out.println(num +  " is not an Armstrong number");
}
     
  }
}
//output
// Armstrong number
// 8208
// 8208  is Armstrong number