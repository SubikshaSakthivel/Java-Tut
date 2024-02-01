import java.util.Scanner;

public class Trailzero {
    static int countTrailingZeros(int n) {
        int result =0 ;
        int powerOf5 = 5;

        while (n >= powerOf5) {
            result = result + (n / powerOf5);
            powerOf5 = powerOf5 * 5;
        }

        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Trailing Zeros: " + countTrailingZeros(n));
    }
}
/*
 * output
 * Enter the number: 25
   Trailing Zeros: 6
 */
