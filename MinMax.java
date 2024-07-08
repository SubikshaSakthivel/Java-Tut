//print first max and min and so on respectively
import java.util.*;
class MinMax {
    public static void arrange(int arr[])
    {
       int n=arr.length;
       Arrays.sort(arr);
       int i=0;
       int j=n-1;
      // System.out.println("Sorted Array: " + Arrays.toString(arr));
      while(i<j)
      {
          System.out.print(arr[j]+" "+arr[i]+" ");
           i++;
           j--;
      }
     
      if(n%2!=0)
      {
          System.out.print(arr[i]);
      }
    }
public static void main(String[] args)
{
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       arrange(arr);
    }
}
//output
// 3
// 1 2 3 
// 3 1 2