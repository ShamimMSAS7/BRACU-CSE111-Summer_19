import java.util.Scanner;
public class Lab2Task6{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    int []array1=new int[15];
    int[] array2= new int[10];
    for(int i=0; i<array1.length; i++){
      System.out.println("Please, enter the value between 0 to 9 of position "+(i+1));
      array1[i]=msas.nextInt();
      array2[array1[i]]++;
    }
    for(int i=0; i<array2.length; i++)
      System.out.println(i+" has been entered "+array2[i]+" time(s)");
  }
}