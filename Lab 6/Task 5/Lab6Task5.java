import java.util.Scanner;
public class Lab6Task5{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any word of capital letters");
    String word=sc.nextLine();
    int array[]=new int[26];
    for(int i=0; i<word.length();i++){
      array[word.codePointAt(i)-(int)('A')]++;
    }
    int most1=-1,most2=-1;
    for(int i=0;i<array.length;i++){
      if(array[i]>most1){
        most2=most1;
        most1=array[i];
      }else if(array[i]>most2)
        most2=array[i];
    }
    for(int i=0; i<array.length; i++){
      if(array[i]==most2){
        System.out.println((char)(i+(int)('A')));
        break;
      }
    }
  }
}