import java.util.Scanner;
public class L1T15{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=msas.nextInt();
    for(int rowCounter=1; rowCounter<=num; rowCounter++)
      System.out.print("*");
    System.out.println();
  }
}