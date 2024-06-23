import java.util.*;
class HelloWorld
{
  public static int countValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        int validPairs = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.pop() == '(') {
                    stack.pop(); // A valid pair is found
                    validPairs++;
                }
            }
        }

        return validPairs*2;
    }

    public static void main(String[] args) {
        String input = "(((())";
        int result = countValidParentheses(input);
        System.out.println("Number of valid parentheses pairs: " + result);
    }
}
