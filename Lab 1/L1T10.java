import java.util.Scanner;
public class L1T10{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=msas.nextInt();
    for(int rowCounter=1; rowCounter<=num; rowCounter++){
      for(int colCounter=1; colCounter<=(num+rowCounter-1); colCounter++){
        if(rowCounter==num||colCounter==(num-rowCounter+1)||colCounter==(num+rowCounter-1))
          System.out.print(rowCounter+colCounter-num);
        else
          System.out.print(" ");
      }System.out.println();
    }
  }
}