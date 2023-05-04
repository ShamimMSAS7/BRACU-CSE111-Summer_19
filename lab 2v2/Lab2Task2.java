import java.util.Scanner;
public class Lab2Task2{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    int []array=new int[10];
 
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter the value of position "+(i+1));
      array[i]=msas.nextInt();
      System.out.print("You have entered ");
      for(int j=0; j<=i; j++){
        if(j==i)
          System.out.println(array[j]);
        else
          System.out.print(array[j]+", ");
      }
    }
   
  }
}