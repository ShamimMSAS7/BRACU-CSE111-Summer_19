import java.util.Scanner;
public class Lab3v2MediumTask2{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter a word");
    String word=msas.nextLine();
    String newWord=word.toLowerCase();
    char []array1=newWord.toCharArray();
    int []array2=new int[26];
    for(int i=0; i<array1.length; i++){
      array2[array1[i]-'a']++;
    }
    int count=0;
    for(int i=0; i<array2.length;i++){
      if(array2[i]>1){
        System.out.println("'"+(char)(i+'a')+"'"+" has been counted "+array2[i]+" times in the word \""+word+"\"");
        count++;
      }
    }
    if(count==0)
      System.out.println("You entered "+word);
    else
      System.out.println("Please enter another word");
  }
}