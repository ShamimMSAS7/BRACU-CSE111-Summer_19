import java.util.Scanner;
public class Lab3v2MediumTask3{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter a word");
    String word1=msas.nextLine();
    System.out.println("Enter another word");
    String word2=msas.nextLine();
    String newWords=word1.concat(" "+word2);
    System.out.println(newWords);
    int sum=0;
    for(int i=0; i<newWords.length();i++){
      if(newWords.charAt(i)!=' ')
        sum+=newWords.codePointAt(i);
    }
    System.out.println(sum);
  }
}