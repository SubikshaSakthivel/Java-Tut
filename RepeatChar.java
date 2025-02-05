
import java.util.*;

public class RepeatChar
{
	public static void main(String[] args) 
	{
	   String s="thr  bhfv fefe";
	   
	   HashMap<Character,Integer> m =new HashMap<>();
	   
	   for(char c : s.toCharArray())
	   {
	       if(c == ' ')continue;
	       
	       m.put(c,m.getOrDefault(c,0)+1);
	   }
	    
	 for(HashMap.Entry<Character,Integer> val : m.entrySet()){
	     
	     if(val.getValue() > 1){
	         System.out.println(val.getKey());
	     }
	 }
		
	}
}