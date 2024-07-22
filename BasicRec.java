
public class BasicRec 

{
  public static void main(String[] args) 
  
  {
    
    int count=0;
    fun(count);
  }
    
   public static void fun(int count)
   {
    if(count==5)return;
    else
    {
      System.out.println("Print count for"+" "+count +" "+"times");
      count++;
      fun(count);

    }
   }
  }
  /* 
   * OUTPUT
  Print count for 0 times
  Print count for 1 times
  Print count for 2 times
  Print count for 3 times
  Print count for 4 times
   */
