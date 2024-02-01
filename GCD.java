import java.util.Scanner;
public class GCD 
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.print("Enter a:");
int a=in.nextInt();
System.out.print("Enter b:");
int b=in.nextInt();
int min;
if(a<b)
{
  min=a;
}
else
{
  min=b;
}
for(int i=min;i>=1;i--)
{
  if(a%i==0 && b%i==0)
  {
  System.out.println("The GCD of the given number :"+i);
  break;
}
}
}
}
/* Output ------>[BRUTE FORCE APPROACH]
 * Enter a:15
   Enter b:5
   The GCD of the given number 5
 */

  

