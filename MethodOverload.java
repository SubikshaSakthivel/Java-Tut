class MethodOverload {
  static int add(int a,int b)
  {
    return a+b;
  }
   static int add(int a,int b,int c)
  {
    return a+b+c;
  }
}
class Method{
  public static void main(String args[])

System.out.println(MethodOverload.add(11,11));  
}
}



a