//compareToIgnoreCase()
//<first string>.compareTo(<second string>)
//it compares 2 strings and then produce an integer value
//if the value is 0 then the two strings are same
//(hello=hello)(Hello=hello) it means it ignores case like small letter or capital
//it calculates the int value: first string-second string(till the first different charecter)
//if it finds any different value then doesn't check the later values

public class Lab3Task7b{
  public static void main(String[]args){
    String name1="hello";
    String name2="Hello";
    int result=name1.compareToIgnoreCase(name2);
    System.out.println(result);
    System.out.println("Hello, MSAS".compareToIgnoreCase("Hello, MSAs"));
    System.out.println("Hello, MSAS".compareToIgnoreCase("Hello, MSAS"));
  }
}