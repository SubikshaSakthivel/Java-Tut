
import java.util.*;
class  MultiplyWithOut {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int ans=1;
        int i;
        for( i=0;i<arr.length;i++)
        {
            ans*=arr[i];
        }
         for( i=0;i<arr.length;i++)
        {
              arr[i]=ans/arr[i];
        }
        System.out.print(Arrays.toString(arr));    
    }
}
// Input: [1, 2, 3, 4]
// Output: [24, 12, 8, 6]