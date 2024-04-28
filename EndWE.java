public class EndWE 
{
       public static void main(String[] args)
        { 
            int start=0,i,j;
            String ss="git provide a good platform to  enable to push and give user experience";
            for(i=0;i<ss.length();i++)
            {
                if (ss.charAt(i)==' ')
                 {
                    start=i+1;   //extract a word.. 
                }
               if(ss.charAt(i)=='e')
               {
            
                 if(i+1==ss.length() || ss.charAt(i+1)==' ') //fetch last index ..
                {
                    StringBuilder sb=new StringBuilder();
                    for(j=start;j<=i;j++)
                    {
                        sb.append(ss.charAt(j));  //after comming out of loop it get buffered and  again comming into loop sb is empty
                           
                    }
                    System.out.println(sb);

                 }
               
                }
               
            }
        }
    }

    //output
    // provide
    // enable
    // give
    // experience