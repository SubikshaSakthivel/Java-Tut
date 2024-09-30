import java.util.Scanner;
import java.util.Stack;

public class ReverseStr {
  public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner sc = new Scanner(System.in);
        String T="ab569!@#[]{}|;:',.<";
        Stack<Character> s=new Stack<>();
        for(int i=0;i<T.length();i++)
        {
            s.push(T.charAt(i));
        }
       while(!s.isEmpty())
        {
            System.out.print(s.pop());
        }
       
    }
  
}
/* OUTPUT
<.,':;|}{][#@!965ba */