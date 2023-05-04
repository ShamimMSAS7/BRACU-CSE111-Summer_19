import java.util.Scanner;
public class Lab3v2MediumTask4{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter a word");
    String word=msas.nextLine();
    char []array=word.toCharArray();
    String word2=String.valueOf(array[0]);
    
    for(int i=1, j=i+1; j<array.length;i++, j++){
      if(array[j]!=array[i]){
        word2+=array[j];
        
      }
      
    }
    
    System.out.println(word2);
  }
}