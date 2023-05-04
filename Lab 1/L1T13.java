import java.util.Scanner;
public class L1T13{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=msas.nextInt();
    for(int rowCounter=1; rowCounter<=2*num-1; rowCounter++){
      if(rowCounter>num)
        System.out.print(2*num-rowCounter);
      else
        System.out.print(rowCounter);
      
    }
    System.out.println();
  }
}