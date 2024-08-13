class PeekEle {
  public static void main(String[] args) {
      int arr[] = {2, 3, 4, 89,90};

      if (arr.length == 1) {
          System.out.println(0);
          return;
      }

      // Check the first element
      if (arr[0] > arr[1]) {
          System.out.println(0);
          return;
      }

      // Check the middle elements
      for (int i = 1; i < arr.length - 1; i++) {
          if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
              System.out.println(arr[i]);
              return;
          }
      }

      // Check the last element
      if (arr[arr.length - 1] > arr[arr.length - 2]) {
          System.out.println(arr[arr.length - 1]);
      }
  }
}
/* Output
90 */