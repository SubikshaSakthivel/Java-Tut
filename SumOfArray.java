public class SumOfArray {
    public static void main(String[] args) 
    {   
        int sum=0;
        int mark[]={2,3,4,5};
        for(int i=0;i<=mark.length-1;i++)
        {
            int m=mark[i];
            sum+=m;
           // System.out.print(mark[i]);
        }
            System.out.print("Sum Of arrays:");
            System.out.print(sum);
        
        
    }
}
/*output
Sum Of arrays:14
 */
