import java.util.Scanner;
public class Lab3v2EasyTask1{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter a word in capital letters");
    String word=msas.nextLine();
    char []array=word.toCharArray();
    for(int i=0; i<array.length-1; i++){
      for(int j=i+1; j<array.length; j++){
        if(array[j]<array[i]){
          char temp=array[i];
          array[i]=array[j];
          array[j]=temp;
        }
      }
    }
    for(int i=0; i<array.length;i++)
      System.out.print(array[i]);
    System.out.println();
  }
}