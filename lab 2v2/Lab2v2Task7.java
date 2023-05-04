import java.util.Scanner;
public class Lab2v2Task7{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    int []array=new int[11];
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter the value of position "+(i+1));
      array[i]=msas.nextInt();
      int count=0;
      for(int j=0; j<=i; j++){
        
        if(array[i]==array[j]){
          count++;
          if(count>4){
            System.out.println(array[i]+" has already been entered for 4 times");
            i--;
            break;
          }
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