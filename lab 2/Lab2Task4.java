import java.util.Scanner;
public class Lab2Task4{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    int []array=new int[20];
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter the value of position "+(i+1));
      array[i]=msas.nextInt();
    }
    int count=0;
    for(int i=array.length-1; i>=0; i--){
      if(array[i]%2==0){
        count++;
        if(count==1)
          System.out.print(array[i]);
        else
          System.out.print(", "+array[i]);
      }
    }
    System.out.println();
  }
}