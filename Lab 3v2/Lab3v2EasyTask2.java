import java.util.Scanner;
public class Lab3v2EasyTask2{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter something");
    String word=msas.nextLine();
    char []array=word.toCharArray();
    
    for(int i=0; i<array.length;i++){
      if(array[i]==' ')
        System.out.print(" ");
      else if(array[i]=='z')
        System.out.print((char)97);
      else
        System.out.print((char)(array[i]+1));
    }
    System.out.println();
  }
}