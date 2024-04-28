 import java.util.Scanner;
import java.util.Stack;

public class Paran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(checkParan(s) ? "yes" : "no");
    }

    public static boolean checkParan(String s) {
        char[] Char = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : Char) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }
}
