import java.io.*;
import java.util.Scanner;
public class Task10{
  public static void main(String[]args) throws Exception{
    String amarFileNameAndLocation  = "C:\\Users/19101532/Desktop/New folder/q10/a.txt";
    File amarFile = new File ( amarFileNameAndLocation );
    Scanner  s = new Scanner (amarFile); 
    String ektaLine;
    ektaLine = s.nextLine();
    int x = Integer.parseInt(ektaLine); 
    ektaLine = s.nextLine();
    int y =Integer.parseInt(ektaLine);
    ektaLine = s.nextLine();
    int z = Integer.parseInt(ektaLine); 
    System.out.println(x+y+z);
    
    
  }
}
