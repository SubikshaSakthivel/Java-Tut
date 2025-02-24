class MulRest {
  public static void main(String[] args) {
      int arr[] = {1, 2, 3, 4};
      
      for (int i = 0; i < arr.length; i++) {
          int res = 1; // Reset res for each iteration
          
          for (int j = 0; j < arr.length; j++) {
              if (i != j) { // Skip the current element at index i
                  res *= arr[j];
              }
          }
          
          System.out.println("Product excluding index " + i + ": " + res);
      }
  }
}
// OUTPUT
// Product excluding index 0: 24
// Product excluding index 1: 12
// Product excluding index 2: 8
// Product excluding index 3: 6