

class pat{
  int n=5;
  
  void disp1()
  {
    int n=5;
     for(int i=1;i<=n;i++)
     {
      for(int j=0;j<n-i+1;j++)
      {
        System.out.print("*");
      }
      System.out.println();
     }
    
  }
  void disp2()
  {
    int n=5;
     for(int i=1;i<=n;i++)
     {
      for(int j=1;j<=n-i+1;j++)
      {
        System.out.print(j);
      }
      System.out.println();
     }
    
  }
  void disp3()
  {
     for(int i=0;i<=n;i++)
     {
      //space
      for(int j=0;j<n-i-1;j++)
      {
      System.out.println(" ");}
           //star
            for(int j=0;j<2*i+1;j++)
            {
              for(int j=0;j<n-i-1;j++)
              System.out.println("*");
            }
            for(int j=0;j<n-i-1;j++)
            {System.out.println(" ");}
            
      }
      System.out.println();
     }  
  }

public class patterns {
  public static void main(String[] args)
   {
    pat pp=new pat();
    pp.disp1();
    pp.disp2();
    pp.disp3();

    
  }
  
}
//output for disp1 method
// *****
// ****
// ***
// **
// *
//----------------------------
//output for disp2  method
// 12345
// 1234
// 123
// 12
// 1