//indexOf()
//<Main String>.indexOf(<any string or char>)
//it finds the first index number(starts from 0) of the given string or char from the main string 
//it the gibven part doesn't belong to main string then it sends -1
//it is case sensitive
public class Lab3Task7g{
  public static void main(String[]args){
    String name="Hello, Bye MSAS";
    int result=name.indexOf('B');
    System.out.println(result);
    System.out.println("Hello, Bye MSAS".indexOf("lo"));
    System.out.println("Hello, Bye MSAS".indexOf("Lo"));
  }
}