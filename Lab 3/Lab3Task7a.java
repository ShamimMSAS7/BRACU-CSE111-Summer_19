//compareTo()
//<first string>.compareTo(<second string>)
//it compares 2 strings and then produce an integer value
//if the value is 0 then the two strings are same
//(hello=hello)(Hello!=hello) it means it doesn't ignore case like small letter or capital
//it calculates the int value: first string-second string(till the first different character)
//if it finds any different value then doesn't check the later values

public class Lab3Task7a{
  public static void main(String[]args){
    String name1="hello";
    String name2="hemln";
    int result=name1.compareTo(name2);
    System.out.println(result);
    System.out.println("Hello, MSAS".compareTo("Hello, MSAs"));
    System.out.println("Hello, MSAS".compareTo("Hello, MSAS"));
  }
}