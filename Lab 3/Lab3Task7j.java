import java.util.Scanner;
public class Lab3Task7j{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    String name="Hello, Bye MSAS";

   
    String result=name.replace('b','h');
    System.out.println(result);
    result=name.replace('B','h');
    System.out.println(result);
    System.out.println(name);
  }
}