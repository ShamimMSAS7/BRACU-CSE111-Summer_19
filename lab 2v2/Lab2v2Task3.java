import java.util.Scanner;
public class Lab2v2Task3{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    int []array=new int[10];
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter the value of position "+(i+1));
      array[i]=msas.nextInt();
    }
    for(int i=0; i<array.length-1; i++){
      for(int j=i+1; j<array.length; j++){
        if(array[j]>array[i]){
          int temp=array[i];
          array[i]=array[j];
          array[j]=temp;
        }
      }
    }
    for(int i=0; i<array.length; i++){
      if(i==array.length-1)
        System.out.println(array[i]);
      else
        System.out.print(array[i]+", ");
    }
  }
}