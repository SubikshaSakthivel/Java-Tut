import java.util.ArrayList;
import java.util.Collection;

public class MCollection {
  public static void main(String[] args) 
  {
    Collection<Integer> num=new ArrayList<Integer>();
    num.add(1);
    num.add(2);


    for(int n:num)  //object cannnot assign to integer or other datatype
    {
      System.out.println(n);
      //output
      // 1
      // 2
    }
    
  }
  
}
