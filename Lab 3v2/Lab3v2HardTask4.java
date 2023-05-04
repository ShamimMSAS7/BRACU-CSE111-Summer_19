import java.util.Scanner;
public class Lab3v2HardTask4{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    Scanner msas2=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=msas.nextInt();
    System.out.println("Enter a word");
    String word=msas2.nextLine();
    char wordArray[]=word.toCharArray();
    for(int i=0; i<word.length(); i++){
      int result=wordArray[i]+num;
      if (result>'Z')
        result-=26;
      System.out.print((char)result);
    }
    System.out.println();
  }
}