import java.util.Scanner;
public class Lab3Task4{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter something in capital letters");
    String name=msas.nextLine();
    int []array=new int[26];
    int len=name.length();
    for(int i=0; i<len; i++)
      array[name.codePointAt(i)-'A']++;
    char letter=65;
    for(int i=0; i<array.length; i++,letter++)
      System.out.println(letter+" which is "+(int)letter+" was found "+array[i]+" times");
  }
}