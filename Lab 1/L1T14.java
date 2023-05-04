import java.util.Scanner;
public class L1T14{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=msas.nextInt();
    for(int rowCounter=1; rowCounter<=num; rowCounter++){
      for(int colCounter=1; colCounter<=num-rowCounter; colCounter++)
        System.out.print(" ");
      for(int colCounter=1; colCounter<=2*rowCounter-1; colCounter++){
        if(colCounter>rowCounter)
          System.out.print(2*rowCounter-colCounter);
        else
          System.out.print(colCounter);
      }
      System.out.println();
    }
  }
}