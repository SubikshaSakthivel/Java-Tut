import java.util.Arrays;

public class Asc {
    public static void main(String[] args) {
        int n = 132;
        int nn;
        int num = n;
        int count = 0;

        // Count the number of digits
        while (num != 0) {
            num = num / 10;
            count++;
        }

        int[] digi = new int[count];
        num = n;
        int index = 0;

        // Store the digits in an array
        while (num != 0) {
            digi[index] = num % 10;
            num = num / 10;
            index++;
        }

        // Sorting the array
       //Arrays.sort(digi);
       System.out.println("Digits stored in digi array and their positions:");
        for (int i = 0; i < count; i++) {
            System.out.println("Digit at position " + i + " is " + digi[i]);
        }

        // Check if the digits are in ascending order
        boolean isAscending = true;
        for (int i = 0; i < digi.length - 1; i++) {
            if (digi[i] > digi[i + 1]) {
                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            System.out.println("The digits of " + n + " are in ascending order.");
        } else {
            System.out.println("The digits of " + n + " are not in ascending order.");
        }
    }
}
