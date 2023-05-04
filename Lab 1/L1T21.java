import java.util.Scanner;
public class L1T21{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter the number of row");
    int row=msas.nextInt();
    System.out.println("Enter the number of column");
    int col=msas.nextInt();
    for(int rowCounter=1; rowCounter<=row; rowCounter++){
      for(int colCounter=1; colCounter<=col; colCounter++){
        if(rowCounter==1||rowCounter==row||colCounter==1||colCounter==col)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}