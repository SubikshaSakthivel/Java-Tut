public class CopyArray {
  public static void main(String args[])
  {
    int a1[]=new int[]{1,2,3,4};
    int a2[]=new int[a1.length];
    System.out.print("Orginal Array:");
    for (int i=0; i<a1.length;i++)
    {
      System.out.print(a1[i]+" ");
      a2[i]=a1[i];
    }
     System.out.print("Copied Array:");
     for (int i=0; i<a1.length;i++)
    {
      System.out.print(a2[i]+" ");
    }
    


  }
  
}
