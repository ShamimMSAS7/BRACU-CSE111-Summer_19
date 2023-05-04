import java.util.Scanner;
public class Lab2Task7{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    int []array=new int[10];
 
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter the value of position "+(i+1));
      array[i]=msas.nextInt();
      for(int j=0; j<=i; j++){
        if(j==i)
          System.out.println(array[j]);
        else
          System.out.print(array[j]+", ");
      }
    }
   
  }
}