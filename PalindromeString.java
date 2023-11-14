import java.util.Scanner;

public class PalindromeString{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the string:");
    String s=in.nextLine();
    String rev="";
    for (int i=s.length()-1;i>=0; i--) 
      { 
         System.out.println(s.charAt(i));
          rev+=s.charAt(i);
          
      }
      if (s.equals(rev))
      {
        System.out.println("palindrome");
      }
      else{
        System.out.print("Not a Palindrome");
      }
    

  }
}
/* output 
sample 1:
Enter the string:madam
m
a
d
a
m
palindrome
sample 2:
Enter the string:father
r
e
h
t
a
f
Not a Palindrome
 
 */
 
  
 
