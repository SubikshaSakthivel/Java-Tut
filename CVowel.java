public class CVowel {
  public static void main(String[] args) 
  {
      String s="SetOut"; 
      String s1=s.toLowerCase();
      int count=0;
      // String method contains()=> checks whether it present or not
      //== -> do the same process
     if(s1=="a" ||s1=="e"|| s1.contains("i")||s1.contains("o")||s1.contains("u") )
     {
         count++;
         
  }
      System.out.print(count);
      
  }
}
// OUTPUT
// 1
