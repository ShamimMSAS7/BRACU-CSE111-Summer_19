import java.util.Scanner;
public class Lab3Task2{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter something");
    String name=msas.nextLine();
    int len=name.length();
    for(int i=0; i<len; i++)
      System.out.println(name.charAt(i));
  }
}