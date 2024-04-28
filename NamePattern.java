public class NamePattern {
  public static void main(String[] args) 
  {
    int i,j=0,count=1;
    String s="Subhikshaa";
    int l=s.length();
    while(j<l)
    {
      StringBuilder sb=new StringBuilder();
      for(i=0;i<count;i++)
      {
           
           sb.append(s.charAt(j) + " ");
           j++;
      }
      System.out.println(sb.toString());
      count++;
    }
  }
}

  