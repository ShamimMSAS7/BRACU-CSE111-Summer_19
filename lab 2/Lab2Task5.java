import java.util.Scanner;
public class Lab2Task5{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    int []array=new int[10];
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter the value of position "+(i+1));
      array[i]=msas.nextInt();
    }
    System.out.println("Enter the number");
    int num=msas.nextInt();
    int count=0;
    for(int i=0; i<array.length; i++){
      if(num==array[i]){
        count++;
        System.out.println("yes");
        break;
      }
    }
    if(count==0)
      System.out.println("no");
  }
}