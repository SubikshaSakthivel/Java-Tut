
import java.util.*;
class Rightmost {
    public static void main(String[] args) 
    {
        Scanner n=new Scanner(System.in);
        System.out.print("Enter the length:");
        int len=n.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=n.nextInt();
        }
        func(arr,len);
    }
        
        public static void func(int arr[],int len)
        {
            int sum=0;
            // int i=0;
            // int j=i+1;
            int i=0;
            for( i=0;i<len-1;i++)
            {
                
                int flag=1;
                for( int j=i+1;j<len;j++)
                {
                    if(arr[i]<arr[j])
                    {
                        break;
                        
                    }
                    else
                    {
                        flag=flag+1;
                        continue;
                    
                }
            }
            if(flag==len-i)
            {
                sum+=arr[i];
            }
            
        }
        System.out.println(sum+arr[len-1]);
       
    }
}
/* Enter the length:5
3
6
1
8
3
11 */