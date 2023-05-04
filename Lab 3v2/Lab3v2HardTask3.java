import java.util.Scanner;
public class Lab3v2HardTask3{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter a word");
    String word=msas.nextLine();
    int start=0;
    for(int i=0; i<word.length(); i++){
      if(word.codePointAt(i)>='A' && word.codePointAt(i)<='Z'){
        for(int j=i; j>=start; j--)
          System.out.print(word.charAt(j));
        start=i+1;
      }
    }
    System.out.println();
  }
}