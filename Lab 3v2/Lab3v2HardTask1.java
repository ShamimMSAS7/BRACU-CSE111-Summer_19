import java.util.Scanner;
public class Lab3v2HardTask1{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter a number");
    String num=msas.nextLine();
    int sum=0;
    for(int i=0; i<num.length(); i++)
      sum+=num.codePointAt(i)-'0';
    if(sum%3==0)
      System.out.println(num+" is divisible by 3");
    else
      System.out.println(num+" is not divisible by 3");
  }
  
}