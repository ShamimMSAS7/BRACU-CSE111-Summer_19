import java.io.*;
import java.util.Scanner;
public class Task11{
  public static void main(String[]args) throws Exception{
    String amarFileNameAndLocation  = "a.txt";
    File amarFile = new File ( amarFileNameAndLocation );
    Scanner  s = new Scanner (amarFile); 
    int line=0;
    while(s.hasNextLine()){
      line +=s.nextInt();
      
    }
    System.out.println( line ); 
    
    
    
  }
}