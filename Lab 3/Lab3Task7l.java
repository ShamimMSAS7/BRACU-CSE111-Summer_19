import java.util.Scanner;
public class Lab3Task7l{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    String name="Hello, Bye MSAS";
    char[] result=name.toCharArray();
    System.out.println(result);
    for(int i=0; i<result.length; i++)
      System.out.println(result[i]);
  }
}