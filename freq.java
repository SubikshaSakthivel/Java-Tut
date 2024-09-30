import java.util.*;

class freq {
    public static void main(String[] args) {
        
        int arr[] = {1, 1, 1, 1, 2, 2, 2, 3, 3};
        
        // Create a HashMap to count occurrences of each element
        Map<Integer, Integer> count = new HashMap<>();
        
        for(int val : arr) {  // Count every element
            count.put(val, count.getOrDefault(val, 0) + 1);
        }
      
        
        Arrays.sort(arr, (int a, int b) -> {
            int freqA = count.get(a);
            int freqB = count.get(b);
            if (freqA != freqB) {
                return freqA - freqB;  // Sort by frequency
            } else {
                return a - b;  
            }
        });
        
        
        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
