import java.util.Scanner;
public class Lab3Task1{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter something");
    String name=msas.nextLine();
    int len=name.length();
    System.out.println(len);
  }
}