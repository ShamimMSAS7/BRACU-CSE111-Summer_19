import java.util.Scanner;
public class L1T12{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=msas.nextInt();
    for(int rowCounter=1; rowCounter<=num; rowCounter++){
      for(int colCounter=1; colCounter<=num; colCounter++){
        if(colCounter>num-rowCounter)
          System.out.print(colCounter);
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}