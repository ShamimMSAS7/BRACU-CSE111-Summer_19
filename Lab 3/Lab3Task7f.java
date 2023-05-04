//equalsIgnoreCase()
//<first string>.equalsIgnoreCase(<second string>)
//it checks if the both strings are equal or not and then sends a boolean value
//if they are equal then true otherwise false
//it is not case sensitive

public class Lab3Task7f{
  public static void main(String[]args){
    String name1="Hello, MSAS";
    String name2="Hello, MSAT";
    boolean result=name1.equalsIgnoreCase(name2);
    System.out.println(result);
    System.out.println("Hello, MSAS".equalsIgnoreCase("Hello, MSAs"));
    System.out.println("Hello, MSAS".equalsIgnoreCase("Hello, MSAS"));
  }
}