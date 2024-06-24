
import java.util.*;

class Removerepeat {
    public static void main(String[] args)
    {
        String str="Jayajtt";
        int n=str.length();
       HashMap<Character,Integer> hm=new HashMap<>();
       for(int i=0;i<n;i++)
       {
           if(hm.containsKey(str.charAt(i)))
           {
               int count=hm.get(str.charAt(i));
               hm.put(str.charAt(i),++count);
           }
           else
           {
               hm.put(str.charAt(i),1);
           }
           
       }
       for(int i=0;i<str.length();i++)
       {
           char ch=str.charAt(i);
           if(hm.get(ch)==1)
           {
               System.out.print(ch);
           }
       }
    }
    
}
// Output
// Jyj