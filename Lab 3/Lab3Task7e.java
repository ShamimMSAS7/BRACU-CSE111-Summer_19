//equals()
//<first string>.equals(<second string>)
//it checks if the both strings are equal or not and then sends a boolean value
//if they are equal then true otherwise false
//it is case sensitive

public class Lab3Task7e{
  public static void main(String[]args){
    String name1="Hello, MSAS";
    String name2="Hello, MSAT";
    boolean result=name1.equals(name2);
    System.out.println(result);
    System.out.println("Hello, MSAS".equals("Hello, MSAs"));
    System.out.println("Hello, MSAS".equals("Hello, MSAS"));
  }
}