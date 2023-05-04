//stratsWith()
//<Main String>.startsWith(<any string>)
//it checks if the main string starts with the given string or not and then sends a boolean value
//if it matches then true otherwise false
//it is case sensitive

public class Lab3Task7c{
  public static void main(String[]args){
    String name="Hello, MSAS";
    boolean result=name.startsWith("Hei");
    System.out.println(result);
    result=name.startsWith("Hel");
    System.out.println(result);
    result=name.startsWith("hel");
    System.out.println(result);
  }
}