import java.io.*;
import java.util.Scanner;
public class Task12{
  public static void main(String[]args) throws Exception{
    String amarFileNameAndLocation  = "b.txt";
    File amarFile = new File ( amarFileNameAndLocation );
    Scanner  s = new Scanner (amarFile); 
    int  line=0;
    while(s.hasNext()){
      line += s.nextInt();
      
    }
    System.out.println( line ); 
  }
}