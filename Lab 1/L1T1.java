import java.util.Scanner;
public class L1T1{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=msas.nextInt();
    for(int colCounter=1; colCounter<=num; colCounter++)
      System.out.print(colCounter);
    System.out.println();
  }
}