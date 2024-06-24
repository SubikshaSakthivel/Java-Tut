import java.util.*;
class Desarian {
  public static void main(String[] args) {
      int num=175;
      int count=String.valueOf(num).length();
      int temp=num;
      int des=0;
      while(temp>0)
      {
          int rem=temp%10;
          des+=Math.pow(rem,count);
          count--;
          temp=temp/10;
          
      }
      if(des==num)
      {
          System.out.println("True");
      }
      else
      {
          System.out.println("False");
      }
    }
}
// Output
// True