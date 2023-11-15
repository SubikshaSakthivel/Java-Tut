import java.util.Scanner;

public class RevString 
{
  public static void main(String ags[])
  {
    Scanner in =new Scanner(System.in);
    System.out.print("Enter the string: ");
    String s=in.nextLine();
    String rev=" ";
    for(int i=s.length()-1;i>=0;i--)
    {
      System.out.print(s.charAt(i));
    }

  }
  
}/*output
Enter the string: kanna
annak
 */
