//endsWith()
//<Main String>.endsWith(<any string>)
//it checks if the main string ends with the given string or not and then sends a boolean value
//if it matches then true otherwise false
//it is case sensitive

public class Lab3Task7d{
  public static void main(String[]args){
    String name="Hello, MSAS";
    boolean result=name.endsWith("SAS");
    System.out.println(result);
    result=name.endsWith("SAM");
    System.out.println(result);
    result=name.endsWith("SAs");
    System.out.println(result);
  }
}