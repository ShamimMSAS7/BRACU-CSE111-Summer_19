import java.util.Scanner;
public class Tester{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
  System.out.print("Enter radius of Circle");  
  Circle c=new Circle(sc.nextInt());
  System.out.println(c.space());
  System.out.print("Enter radius of Sphere");  
  Sphere s=new Sphere(sc.nextInt());
  
  System.out.println(s.space());
  }
}