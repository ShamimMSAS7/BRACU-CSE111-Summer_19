import java.util.Scanner;
public class Lab2Task9{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    int []array=new int[10];
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter the value of position "+(i+1));
      array[i]=msas.nextInt();
    }
    for(int i=0; i<array.length; i=i+2)
      System.out.print(array[i]+", ");
    for(int i=1; i<array.length; i=i+2){
      if(i==array.length-1)
        System.out.println(array[i]);
      else
        System.out.print(array[i]+", ");
    }
  }
}