//COPY VALUE BY CONSTRUCTOR
class Operation{
  int num;
  Operation(int n)
  {
       num=n;
  }
  Operation(Operation s )
  {
     num=s.num;
  }
  void display()
  {
  System.out.println(num);

  }

}
public class ConstructorOverloading 
{
  public static void main(String[] args)
   {
     Operation new1=new Operation(4);
     Operation new2=new Operation(new1);
     new1.display();
     new2.display();
     
  }
  
}
