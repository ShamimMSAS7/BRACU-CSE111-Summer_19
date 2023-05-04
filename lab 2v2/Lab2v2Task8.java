import java.util.Scanner;
public class Lab2v2Task8{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    int []array1=new int[10];
    int array2[]=new int[10];
    for(int i=0; i<array1.length; i++){
      System.out.println("Please, enter the value between 0 to 9 of position "+(i+1));
      array1[i]=msas.nextInt();
      array2[array1[i]]++;
    }
    int count=0;
    for(int i=0; i<array1.length; i++){
      if(array2[array1[i]]>1 && array2[array1[i]]<5){
        count++;
        if(count==1)
          System.out.print(array1[i]);
        else
          System.out.print(", "+array1[i]);
        array2[array1[i]]=0;
      }
    }
    System.out.println();
  }
}