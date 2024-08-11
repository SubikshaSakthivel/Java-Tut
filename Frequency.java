
import java.util.*;
class Frequency {
    public static void main(String[] args) {
        String s="Students".toLowerCase();
        System.out.println(s);
        //int count=1;
        HashMap<Character,Integer> hs=new HashMap<>();
        for(char c:s.toCharArray())
        {
          if(hs.containsKey(c))
          {
              hs.put(c,hs.get(c)+1);
          }
          else
          {
               hs.put(c,1);
          }
          
         
        }
        System.out.println(hs);
    }
}

/* Output
students
{s=2, t=2, d=1, u=1, e=1, n=1} */