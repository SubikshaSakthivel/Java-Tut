import java.util.*;

class MoveZeros {
    public static void main(String[] args) 
    {
        int a[]={0,1,2,3,0,4};
        int c=0;
        // 1ST MOVE NON X=ZEROS FRONT
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                a[c++]=a[i];
            }
            
        }
        //2ND FILL ZERO UPTO ARRAY LENGTH
        while(c<a.length)
        {
            a[c++]=0;
        }
       System.out.println(Arrays.toString(a));
    }
}
/*
 * OUTPUT
 * [1,2,3,4,0,0]
 */