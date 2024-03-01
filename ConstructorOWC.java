//(USES TO  COPY VALUES WITHOUT CONSTRUCTOR)
class Student
{
  int id;
 Student(int i)
{
  id=i;
}
Student(){}

  void display()
  {
    System.out.println(id);
  }

}
public class ConstructorOWC 
{
  public static void main(String[] args) {
    
  
    Student s1=new Student(11);
    Student s2=new Student();
    s2.id=s1.id;
    //s1.display();
    s2.display();

  
}
}

