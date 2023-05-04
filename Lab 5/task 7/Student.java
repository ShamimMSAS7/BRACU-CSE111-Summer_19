public class Student{
  private String name="default name";
  public static int numberOfStudents=0;
  public Student(){
    numberOfStudents++;
  }
  public Student(String n){
    name=n;
    numberOfStudents++;
  }
  public String getName(){
    return name;
  }
}