import java.util.Scanner;
public class Lab3v2MediumTask1{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter a word");
    String word=msas.nextLine();
    char []array=word.toCharArray();
    for(int i=0; i<array.length;i++){
      for(int j=0; j<=i; j++)
        System.out.print(array[j]);
      System.out.println();
    }
  }
}