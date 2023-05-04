public class Teacher{
  private String name;
  private String department;
  public String array[]=new String[3];
  public int count=0;
  public Teacher(String n, String d){
    name=n;
    department=d;
  }
  public void addCourse(Course c){
    array[count++]=c.courseName;
  }
  public  void printDetail(){
    System.out.println("========================");
    System.out.println("Name: "+name);
    System.out.println("Department: "+department);
    System.out.println("List of courses");
    System.out.println("========================");
    for(int i=0; i<count;i++){
      System.out.println(array[i]);
    }
    System.out.println("========================");
  }
}