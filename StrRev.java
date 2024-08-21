class StrRev {
  public static void main(String[] args) 
  {
      int i=0;
      String s="STRIG";
      String rev="";
      for(i=s.length()-1;i>=0;i--)
      {
          rev+=s.charAt(i);
      }
      System.out.println(rev);
  }
}
/* OUTPUT
GIRTS */