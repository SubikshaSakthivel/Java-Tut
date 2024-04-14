import java.util.Scanner;

public class Distance 
{
  public static void main(String[] args) 
  {
     float x1,x2,y1,y2,distance;
     Scanner n=new Scanner(System.in);
     x1=n.nextFloat();
     x2=n.nextFloat();
     y1=n.nextFloat();
     y2=n.nextFloat();
     distance=(float) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
     System.out.println(distance);
   

  }
  
}
