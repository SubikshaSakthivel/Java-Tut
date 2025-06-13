import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String m = sc.nextLine();

        if (s.length() == m.length()) {
            char[] a1 = s.toCharArray();
            char[] a2 = m.toCharArray();

            Arrays.sort(a1);
            Arrays.sort(a2);

            if (Arrays.equals(a1, a2)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }
        else {
            System.out.println("Not Anagrams");
        }
    }
}

/*
 * 
 Step 1: Take Input
         Read two strings s1 and s2.

Step 2: Check Length
       If lengths are different → Not anagrams.

Step 3: Sort & Compare
        Convert both strings to char arrays, sort them, then compare.

Step 4: Result
        If sorted arrays match → Anagrams. Else → Not Anagrams.

OUTPUT:
CODE
EDO
NOT ANAGRAM

 */