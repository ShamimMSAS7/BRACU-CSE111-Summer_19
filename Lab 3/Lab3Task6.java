import java.util.Scanner;
public class Lab3Task6{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter something");
    String name=msas.nextLine();
    System.out.println(name);
    System.out.println(name.concat("==THE END=="));
    System.out.println(name);
  }
}