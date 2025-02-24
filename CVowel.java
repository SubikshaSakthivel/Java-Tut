class CVowel {
  public static void main(String[] args) 
  {
    // String method contains()=> checks whether it present or not
      //== -> do the same process
      String s="SetOut";
      String s1=s.toLowerCase();
      int count=0;
      for(char ch:s1.toCharArray())
      {
          if(ch=='a' ||ch=='e'|| ch=='i'||ch=='o'||ch=='u' )
     {
         count++;
         
  }
      }
     
      System.out.print(count);
      
  }
}



// OUTPUT
// 1
