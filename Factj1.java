import java.util.Scanner;
class  Fact1
{
    static int fact(int n)
    {
        int res=1;
        for(int i=1;i<=n;i++)
        {
            res=res*i;
        }
        return res;
    }

       

    public static void main(String[] args) {
        int res=1;
        Scanner n1=new Scanner(System.in);
        int n=n1.nextInt();
       int result= fact(n);
        System.out.println(result);
        }
    }
