import java.util.*;

class Missing {
    public static void main(String[] args) {
        int arr[] = {30, 5, 10, 15, 25};
        int n = arr.length;

        // Sort the array
        Arrays.sort(arr);
        int d = arr[1] - arr[0];

        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {  
            int c = arr[i] + d;
            if (c != arr[i + 1]) {
                System.out.println("Missing number: " + c);
                break;
            }
        }
    }
}
// OUTPUT
// Missing number: 20