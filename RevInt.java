class RevInt {
  public static void main(String[] args)
  {
      int arr[] = {1, 2, 3, 4, 5, 6}; 
      int temp=0;
      int i=0;
      int j=arr.length-1;
      while(i<j)
      {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
      }
       for (int k = 0; k<arr.length; k++) 
          System.out.print(arr[k] + " "); 
      System.out.println(); 
  } 

}

/* OUTPUT
6 5 4 3 2 1 */